package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pl_last_numbers", schema = "public", catalog = "db_coopmis")
public class PlLastNumbers {
    private Integer id;
    private Integer plAccountTypeId;
    private String lastNumber;
    private Short status;
    private Timestamp createdAt;
    private Integer createdBy;
    private Timestamp modifiedAt;
    private Integer modifiedBy;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pl_account_type_id")
    public Integer getPlAccountTypeId() {
        return plAccountTypeId;
    }

    public void setPlAccountTypeId(Integer plAccountTypeId) {
        this.plAccountTypeId = plAccountTypeId;
    }

    @Basic
    @Column(name = "last_number")
    public String getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(String lastNumber) {
        this.lastNumber = lastNumber;
    }

    @Basic
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlLastNumbers that = (PlLastNumbers) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(plAccountTypeId, that.plAccountTypeId) &&
                Objects.equals(lastNumber, that.lastNumber) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plAccountTypeId, lastNumber, status, createdAt, createdBy, modifiedAt, modifiedBy);
    }
}
