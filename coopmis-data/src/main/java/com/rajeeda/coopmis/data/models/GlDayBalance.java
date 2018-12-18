package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_day_balance", schema = "public", catalog = "db_coopmis")
public class GlDayBalance {
    private long id;
    private int branchId;
    private Timestamp createdAt;
    private Integer createdBy;
    private BigDecimal credit;
    private Date date;
    private BigDecimal debit;
    private int glAccNo;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private Short status;
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
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
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
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
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
        GlDayBalance that = (GlDayBalance) o;
        return id == that.id &&
                branchId == that.branchId &&
                glAccNo == that.glAccNo &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(date, that.date) &&
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
        return Objects.hash(id, branchId, createdAt, createdBy, credit, date, debit, glAccNo, modifiedAt, modifiedBy, status, closeCredit, closeDebit, openCredit, openDebit);
    }
}
