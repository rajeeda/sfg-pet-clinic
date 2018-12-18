package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_year_balance", schema = "public", catalog = "db_coopmis")
public class GlYearBalance {
    private long id;
    private int branchId;
    private Timestamp createdAt;
    private String createdBy;
    private BigDecimal credit;
    private BigDecimal debit;
    private int glAccNo;
    private Timestamp modifiedAt;
    private String modifiedBy;
    private Short status;
    private int yearNumber;
    private BigInteger closeCredit;
    private BigInteger closeDebit;
    private BigInteger openCredit;
    private BigInteger openDebit;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "branch_id")
    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
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
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "credit")
    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "debit")
    public BigDecimal getDebit() {
        return debit;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }

    @Basic
    @Column(name = "gl_acc_no")
    public int getGlAccNo() {
        return glAccNo;
    }

    public void setGlAccNo(int glAccNo) {
        this.glAccNo = glAccNo;
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
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
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
    @Column(name = "year_number")
    public int getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }

    @Basic
    @Column(name = "close_credit")
    public BigInteger getCloseCredit() {
        return closeCredit;
    }

    public void setCloseCredit(BigInteger closeCredit) {
        this.closeCredit = closeCredit;
    }

    @Basic
    @Column(name = "close_debit")
    public BigInteger getCloseDebit() {
        return closeDebit;
    }

    public void setCloseDebit(BigInteger closeDebit) {
        this.closeDebit = closeDebit;
    }

    @Basic
    @Column(name = "open_credit")
    public BigInteger getOpenCredit() {
        return openCredit;
    }

    public void setOpenCredit(BigInteger openCredit) {
        this.openCredit = openCredit;
    }

    @Basic
    @Column(name = "open_debit")
    public BigInteger getOpenDebit() {
        return openDebit;
    }

    public void setOpenDebit(BigInteger openDebit) {
        this.openDebit = openDebit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlYearBalance that = (GlYearBalance) o;
        return id == that.id &&
                branchId == that.branchId &&
                glAccNo == that.glAccNo &&
                yearNumber == that.yearNumber &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(debit, that.debit) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(modifiedBy, that.modifiedBy) &&
                Objects.equals(status, that.status) &&
                Objects.equals(closeCredit, that.closeCredit) &&
                Objects.equals(closeDebit, that.closeDebit) &&
                Objects.equals(openCredit, that.openCredit) &&
                Objects.equals(openDebit, that.openDebit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, branchId, createdAt, createdBy, credit, debit, glAccNo, modifiedAt, modifiedBy, status, yearNumber, closeCredit, closeDebit, openCredit, openDebit);
    }
}
