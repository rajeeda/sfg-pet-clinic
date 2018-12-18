package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_account", schema = "public", catalog = "db_coopmis")
public class GlAccount {
    private int accNo;
    private Integer branchId;
    private BigDecimal budget;
    private Timestamp createdAt;
    private Integer createdBy;
    private String description;
    private String glAccNoOld;
    private Integer glCoaId;
    private BigDecimal lastCredit;
    private BigDecimal lastDebit;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private BigDecimal openCredit;
    private BigDecimal openDebit;
    private Short status;

    @Id
    @Column(name = "acc_no")
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    @Basic
    @Column(name = "branch_id")
    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @Basic
    @Column(name = "budget")
    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "gl_acc_no_old")
    public String getGlAccNoOld() {
        return glAccNoOld;
    }

    public void setGlAccNoOld(String glAccNoOld) {
        this.glAccNoOld = glAccNoOld;
    }

    @Basic
    @Column(name = "gl_coa_id")
    public Integer getGlCoaId() {
        return glCoaId;
    }

    public void setGlCoaId(Integer glCoaId) {
        this.glCoaId = glCoaId;
    }

    @Basic
    @Column(name = "last_credit")
    public BigDecimal getLastCredit() {
        return lastCredit;
    }

    public void setLastCredit(BigDecimal lastCredit) {
        this.lastCredit = lastCredit;
    }

    @Basic
    @Column(name = "last_debit")
    public BigDecimal getLastDebit() {
        return lastDebit;
    }

    public void setLastDebit(BigDecimal lastDebit) {
        this.lastDebit = lastDebit;
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
    @Column(name = "open_credit")
    public BigDecimal getOpenCredit() {
        return openCredit;
    }

    public void setOpenCredit(BigDecimal openCredit) {
        this.openCredit = openCredit;
    }

    @Basic
    @Column(name = "open_debit")
    public BigDecimal getOpenDebit() {
        return openDebit;
    }

    public void setOpenDebit(BigDecimal openDebit) {
        this.openDebit = openDebit;
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
        GlAccount glAccount = (GlAccount) o;
        return accNo == glAccount.accNo &&
                Objects.equals(branchId, glAccount.branchId) &&
                Objects.equals(budget, glAccount.budget) &&
                Objects.equals(createdAt, glAccount.createdAt) &&
                Objects.equals(createdBy, glAccount.createdBy) &&
                Objects.equals(description, glAccount.description) &&
                Objects.equals(glAccNoOld, glAccount.glAccNoOld) &&
                Objects.equals(glCoaId, glAccount.glCoaId) &&
                Objects.equals(lastCredit, glAccount.lastCredit) &&
                Objects.equals(lastDebit, glAccount.lastDebit) &&
                Objects.equals(modifiedAt, glAccount.modifiedAt) &&
                Objects.equals(modifiedBy, glAccount.modifiedBy) &&
                Objects.equals(openCredit, glAccount.openCredit) &&
                Objects.equals(openDebit, glAccount.openDebit) &&
                Objects.equals(status, glAccount.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accNo, branchId, budget, createdAt, createdBy, description, glAccNoOld, glCoaId, lastCredit, lastDebit, modifiedAt, modifiedBy, openCredit, openDebit, status);
    }
}
