package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pl_policy", schema = "public", catalog = "db_coopmis")
public class PlPolicy {
    private int id;
    private Timestamp createdAt;
    private Integer createdBy;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private String note;
    private String policyName;
    private int policyTypeId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "policy_name")
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    @Basic
    @Column(name = "policy_type_id")
    public int getPolicyTypeId() {
        return policyTypeId;
    }

    public void setPolicyTypeId(int policyTypeId) {
        this.policyTypeId = policyTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlPolicy plPolicy = (PlPolicy) o;
        return id == plPolicy.id &&
                policyTypeId == plPolicy.policyTypeId &&
                Objects.equals(createdAt, plPolicy.createdAt) &&
                Objects.equals(createdBy, plPolicy.createdBy) &&
                Objects.equals(modifiedAt, plPolicy.modifiedAt) &&
                Objects.equals(modifiedBy, plPolicy.modifiedBy) &&
                Objects.equals(note, plPolicy.note) &&
                Objects.equals(policyName, plPolicy.policyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, createdBy, modifiedAt, modifiedBy, note, policyName, policyTypeId);
    }
}
