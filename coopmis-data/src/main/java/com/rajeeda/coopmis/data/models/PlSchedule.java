package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pl_schedule", schema = "public", catalog = "db_coopmis")
public class PlSchedule {
    private long id;
    private BigDecimal capitalBalance;
    private BigDecimal capitalInstallment;
    private Timestamp createdAt;
    private Integer createdBy;
    private Date fromDate;
    private Integer installmentNum;
    private BigDecimal interestBalance;
    private BigDecimal interestInstallment;
    private BigInteger interestRate;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private Integer noOfDays;
    private Short paid;
    private Long plAccountId;
    private Date toDate;
    private BigDecimal totalInstallment;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "capital_balance")
    public BigDecimal getCapitalBalance() {
        return capitalBalance;
    }

    public void setCapitalBalance(BigDecimal capitalBalance) {
        this.capitalBalance = capitalBalance;
    }

    @Basic
    @Column(name = "capital_installment")
    public BigDecimal getCapitalInstallment() {
        return capitalInstallment;
    }

    public void setCapitalInstallment(BigDecimal capitalInstallment) {
        this.capitalInstallment = capitalInstallment;
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
    @Column(name = "from_date")
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "installment_num")
    public Integer getInstallmentNum() {
        return installmentNum;
    }

    public void setInstallmentNum(Integer installmentNum) {
        this.installmentNum = installmentNum;
    }

    @Basic
    @Column(name = "interest_balance")
    public BigDecimal getInterestBalance() {
        return interestBalance;
    }

    public void setInterestBalance(BigDecimal interestBalance) {
        this.interestBalance = interestBalance;
    }

    @Basic
    @Column(name = "interest_installment")
    public BigDecimal getInterestInstallment() {
        return interestInstallment;
    }

    public void setInterestInstallment(BigDecimal interestInstallment) {
        this.interestInstallment = interestInstallment;
    }

    @Basic
    @Column(name = "interest_rate")
    public BigInteger getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigInteger interestRate) {
        this.interestRate = interestRate;
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
    @Column(name = "no_of_days")
    public Integer getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    @Basic
    @Column(name = "paid")
    public Short getPaid() {
        return paid;
    }

    public void setPaid(Short paid) {
        this.paid = paid;
    }

    @Basic
    @Column(name = "pl_account_id")
    public Long getPlAccountId() {
        return plAccountId;
    }

    public void setPlAccountId(Long plAccountId) {
        this.plAccountId = plAccountId;
    }

    @Basic
    @Column(name = "to_date")
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "total_installment")
    public BigDecimal getTotalInstallment() {
        return totalInstallment;
    }

    public void setTotalInstallment(BigDecimal totalInstallment) {
        this.totalInstallment = totalInstallment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlSchedule that = (PlSchedule) o;
        return id == that.id &&
                Objects.equals(capitalBalance, that.capitalBalance) &&
                Objects.equals(capitalInstallment, that.capitalInstallment) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(fromDate, that.fromDate) &&
                Objects.equals(installmentNum, that.installmentNum) &&
                Objects.equals(interestBalance, that.interestBalance) &&
                Objects.equals(interestInstallment, that.interestInstallment) &&
                Objects.equals(interestRate, that.interestRate) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(modifiedBy, that.modifiedBy) &&
                Objects.equals(noOfDays, that.noOfDays) &&
                Objects.equals(paid, that.paid) &&
                Objects.equals(plAccountId, that.plAccountId) &&
                Objects.equals(toDate, that.toDate) &&
                Objects.equals(totalInstallment, that.totalInstallment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, capitalBalance, capitalInstallment, createdAt, createdBy, fromDate, installmentNum, interestBalance, interestInstallment, interestRate, modifiedAt, modifiedBy, noOfDays, paid, plAccountId, toDate, totalInstallment);
    }
}
