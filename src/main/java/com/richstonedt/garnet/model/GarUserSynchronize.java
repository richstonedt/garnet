package com.richstonedt.garnet.model;
import java.util.Date;
public class GarUserSynchronize {
    private Long id;
    private Date updatedTime;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getUpdatedTime() {
        return updatedTime;
    }
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}