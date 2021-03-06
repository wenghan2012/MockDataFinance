package com.finance.mock.entity;

/**
 * @Author: 快乐水 樱桃可乐
 * @Description:
 * @Date: Created in 10:12 2018/9/21
 * @Modified By:
 */
public class Banner {
    private long id;
    private String serialId;
    private String title;
    private String key;
    private int intervalTime;
    private String createdBy;
    private String updatedBy;
    private boolean status;
    private long createAt;
    private long updateAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", serialId='" + serialId + '\'' +
                ", title='" + title + '\'' +
                ", key='" + key + '\'' +
                ", intervalTime=" + intervalTime +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", status=" + status +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
