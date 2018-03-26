package com.business.base.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wk on 2018/3/22.
 */
public class BaseEntity<T> implements Serializable {

    private static final long serialVersionUID = 1755989621542875317L;

    /**
     * 主键(唯一标识)
     */
    protected long id;

    /**
     * 备注
      */
    protected String remarks;

    /**
     * 创建时间
     */
    protected Date createDate;

    /**
     * 修改时间
     */
    protected Date updateDate;

    public BaseEntity(){

    }

    public BaseEntity (long id){
        this();
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void preInsert(){
        this.createDate = new Date();
        this.updateDate = new Date();
    }

}
