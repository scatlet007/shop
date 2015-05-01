package com.scatlet.domin;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.File;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/4/28.
 */
public class Picture {

    private String id;
    private String fileName;
    private File file;
    private String url;
    private String types;
    private Timestamp createTime;

    @Column(name = "id")
    @GenericGenerator(name = "generator", strategy = "uuid2")
    @Id
    @GeneratedValue(generator = "generator")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name="createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name="url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name="file")
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Basic
    @Column(name="types")
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Basic
    @Column(name="fileName")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Picture picture = (Picture) o;

        if (!createTime.equals(picture.createTime)) return false;
        if (!file.equals(picture.file)) return false;
        if (!fileName.equals(picture.fileName)) return false;
        if (!id.equals(picture.id)) return false;
        if (!types.equals(picture.types)) return false;
        if (!url.equals(picture.url)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + fileName.hashCode();
        result = 31 * result + file.hashCode();
        result = 31 * result + url.hashCode();
        result = 31 * result + types.hashCode();
        result = 31 * result + createTime.hashCode();
        return result;
    }
}
