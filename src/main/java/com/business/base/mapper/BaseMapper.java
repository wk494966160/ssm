package com.business.base.mapper;

import java.util.List;

/**
 * Created by wk on 2018/3/22.
 */
public interface BaseMapper<T> {

    /**
     * 根据ID获取对象
     * @param id
     * @return
     */
    T get(String id);

    /**
     * 获取所有对象的集合
     * @return
     */
    List<T> getAllList();

    /**
     * 根据条件获取对象
     * @param entity
     * @return
     */
    List<T> getList(T entity);

    /**
     * 添加数据
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 修改数据
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 删除数据
     * @param entity
     * @return
     */
    int delete(T entity);

}
