package com.scatlet.domin;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2015/4/28.
 */
public class UserInfo {

    private String name;
    private String cellphone;
    private String school;
    private String college;
    private String identity;


    @Column(name = "id")
    @GenericGenerator(name = "generator", strategy = "uuid2")
    @Id
    @GeneratedValue(generator = "generator")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name="cellphone")
    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Basic
    @Column(name="school")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name="college")
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Basic
    @Column(name="identity")
    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (!cellphone.equals(userInfo.cellphone)) return false;
        if (!college.equals(userInfo.college)) return false;
        if (!identity.equals(userInfo.identity)) return false;
        if (!name.equals(userInfo.name)) return false;
        if (!school.equals(userInfo.school)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + cellphone.hashCode();
        result = 31 * result + school.hashCode();
        result = 31 * result + college.hashCode();
        result = 31 * result + identity.hashCode();
        return result;
    }
}
