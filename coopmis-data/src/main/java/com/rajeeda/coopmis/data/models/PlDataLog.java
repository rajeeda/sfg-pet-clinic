package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pl_data_log", schema = "public", catalog = "db_coopmis")
public class PlDataLog {
    private long id;
    private String comment;
    private Timestamp createdAt;
    private Integer createdBy;
    private Integer logCategory;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private Long plAccountId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "created_by")
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "log_category")
    public Integer getLogCategory() {
        return logCategory;
    }

    public void setLogCategory(Integer logCategory) {
        this.logCategory = logCategory;
    }

    @Basic
    @Column(name = "modified_at")
    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Basic
    @Column(name = "modified_by")
    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Basic
    @Column(name = "pl_account_id")
    public Long getPlAccountId() {
        return plAccountId;
    }

    public void setPlAccountId(Long plAccountId) {
        this.plAccountId = plAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlDataLog plDataLog = (PlDataLog) o;
        return id == plDataLog.id &&
                Objects.equals(comment, plDataLog.comment) &&
                Objects.equals(createdAt, plDataLog.createdAt) &&
                Objects.equals(createdBy, plDataLog.createdBy) &&
                Objects.equals(logCategory, plDataLog.logCategory) &&
                Objects.equals(modifiedAt, plDataLog.modifiedAt) &&
                Objects.equals(modifiedBy, plDataLog.modifiedBy) &&
                Objects.equals(plAccountId, plDataLog.plAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, comment, createdAt, createdBy, logCategory, modifiedAt, modifiedBy, plAccountId);
    }
}
