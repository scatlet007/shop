package com.scatlet.dao;

import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2015/4/28.
 */
public interface BaseDao {

    public Session getMySession();

    public void close(Session session);
    //实体处理

    /**
     * 保存实体
     * @param t 实体对象
     * @param <T>
     * @return
     */
    public <T> boolean saveEntity(T t);

    /**
     * 删除实体
     * @param t 实体对象
     * @param <T>
     * @return
     */
    public <T> boolean deleteEntity(T t);

    /**
     * 更新实体
     * @param t 实体对象
     * @param <T>
     * @return
     */
    public <T> boolean updateEntity(T t);

    /**
     * 获得实体
     * @param t 实体类
     * @param id 实体id
     * @param <T>
     * @return
     */
    public <T> T getEntity(Class t,Serializable id);

    //批量处理

    /**
     * 查询
     * @param hql hql语句
     * @param objects
     * @return
     */
    public <T> List<T> queryByHql(String hql,Object...objects);

    /**
     * 分页查询
     * @param hql 查询语句
     * @return
     */
    public <T> List<T> queryForPages(final String hql, final Object[] params,
                                     final int start, final int limit);
}
