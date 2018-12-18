package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_branch", schema = "public", catalog = "db_coopmis")
public class GlBranch {
    private int id;
    private String branchDes;
    private String branchName;
    private String branchNameS;
    private Timestamp createdAt;
    private Integer createdBy;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private String otherCode;
    private Short status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "branch_des")
    public String getBranchDes() {
        return branchDes;
    }

    public void setBranchDes(String branchDes) {
        this.branchDes = branchDes;
    }

    @Basic
    @Column(name = "branch_name")
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Basic
    @Column(name = "branch_name_s")
    public String getBranchNameS() {
        return branchNameS;
    }

    public void setBranchNameS(String branchNameS) {
        this.branchNameS = branchNameS;
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
    @Column(name = "other_code")
    public String getOtherCode() {
        return otherCode;
    }

    public void setOtherCode(String otherCode) {
        this.otherCode = otherCode;
    }

    @Basic
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlBranch glBranch = (GlBranch) o;
        return id == glBranch.id &&
                Objects.equals(branchDes, glBranch.branchDes) &&
                Objects.equals(branchName, glBranch.branchName) &&
                Objects.equals(branchNameS, glBranch.branchNameS) &&
                Objects.equals(createdAt, glBranch.createdAt) &&
                Objects.equals(createdBy, glBranch.createdBy) &&
                Objects.equals(modifiedAt, glBranch.modifiedAt) &&
                Objects.equals(modifiedBy, glBranch.modifiedBy) &&
                Objects.equals(otherCode, glBranch.otherCode) &&
                Objects.equals(status, glBranch.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, branchDes, branchName, branchNameS, createdAt, createdBy, modifiedAt, modifiedBy, otherCode, status);
    }
}
