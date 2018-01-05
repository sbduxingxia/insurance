package com.zhp.insurance.mysql.dao;

/**
 * @author zhp.dts
 * @date 2018/1/5.
 */
public interface SimpleDao<T> {
    T selectByPrimaryKey(Object id);
    Integer deleteByPrimaryKey(Object id);
    Integer insert(T item);
    Integer insertSelective(T item);
    Integer updateByPrimaryKeySelective(T item);
    Integer updateByPrimaryKey(T item);

}
