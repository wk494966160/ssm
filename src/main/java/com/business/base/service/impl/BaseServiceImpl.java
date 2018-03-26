package com.business.base.service.impl;


import com.business.base.mapper.BaseMapper;
import com.business.base.entity.BaseEntity;
import com.business.base.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by wk on 2018/3/22.
 */
@Transactional(readOnly = true)
public class BaseServiceImpl<M extends BaseMapper<T>,T extends BaseEntity>  implements IBaseService<T> {

    /**
     *持久层对象
     */
    @Autowired
    protected M mapper;

    /**
     * 获取单条数据
     * @param id
     * @return
     */
    public T get(String id) {
        return mapper.get(id);
    }

    /**
     * 获取数据集合
     * @return
     */
    public List<T> getAllList() {
        return mapper.getAllList();
    }

    /**
     * 根据条件获取数据集合
     * @param entity
     * @return
     */
    public List<T> getList(T entity) {
        return mapper.getList(entity);
    }

    /**
     * 添加或修改数据
     * @param entity
     * @return
     */
    @Transactional(readOnly = false)
    public int save(T entity) {
        if(StringUtils.isEmpty(entity.getId())){
            return mapper.insert(entity);
        }else{
            return mapper.update(entity);
        }
    }

    /**
     * 删除一条数据
     * @param entity
     * @return
     */
    public int delete(T entity) {
        return mapper.insert(entity);
    }
}
