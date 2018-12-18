package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_transaction", schema = "public", catalog = "db_coopmis")
public class GlTransaction {
    private long id;
    private Long transactionHeaderId;
    private String transactionCode;
    private Long fiscalPeriodId;
    private Long fiscalYearId;
    private Long plAutoId;
    private Integer branchId;
    private Integer glAccNo;
    private Date confirmDate;
    private BigDecimal debit;
    private BigDecimal credit;
    private BigDecimal balance;
    private String cashBook;
    private String type;
    private Long memNumber;
    private String time;
    private Long print;
    private Long status;
    private Long oldIdTemp;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    private Integer createdBy;
    private Integer modifiedBy;
    private Integer cashBankAccount;
    private String paymentMethod;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "transaction_header_id")
    public Long getTransactionHeaderId() {
        return transactionHeaderId;
    }

    public void setTransactionHeaderId(Long transactionHeaderId) {
        this.transactionHeaderId = transactionHeaderId;
    }

    @Basic
    @Column(name = "transaction_code")
    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    @Basic
    @Column(name = "fiscal_period_id")
    public Long getFiscalPeriodId() {
        return fiscalPeriodId;
    }

    public void setFiscalPeriodId(Long fiscalPeriodId) {
        this.fiscalPeriodId = fiscalPeriodId;
    }

    @Basic
    @Column(name = "fiscal_year_id")
    public Long getFiscalYearId() {
        return fiscalYearId;
    }

    public void setFiscalYearId(Long fiscalYearId) {
        this.fiscalYearId = fiscalYearId;
    }

    @Basic
    @Column(name = "pl_auto_id")
    public Long getPlAutoId() {
        return plAutoId;
    }

    public void setPlAutoId(Long plAutoId) {
        this.plAutoId = plAutoId;
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
    @Column(name = "gl_acc_no")
    public Integer getGlAccNo() {
        return glAccNo;
    }

    public void setGlAccNo(Integer glAccNo) {
        this.glAccNo = glAccNo;
    }

    @Basic
    @Column(name = "confirm_date")
    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
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
    @Column(name = "credit")
    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "balance")
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "cash_book")
    public String getCashBook() {
        return cashBook;
    }

    public void setCashBook(String cashBook) {
        this.cashBook = cashBook;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "mem_number")
    public Long getMemNumber() {
        return memNumber;
    }

    public void setMemNumber(Long memNumber) {
        this.memNumber = memNumber;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "print")
    public Long getPrint() {
        return print;
    }

    public void setPrint(Long print) {
        this.print = print;
    }

    @Basic
    @Column(name = "status")
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Basic
    @Column(name = "old_id_temp")
    public Long getOldIdTemp() {
        return oldIdTemp;
    }

    public void setOldIdTemp(Long oldIdTemp) {
        this.oldIdTemp = oldIdTemp;
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
    @Column(name = "modified_at")
    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
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
    @Column(name = "modified_by")
    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Basic
    @Column(name = "cash_bank_account")
    public Integer getCashBankAccount() {
        return cashBankAccount;
    }

    public void setCashBankAccount(Integer cashBankAccount) {
        this.cashBankAccount = cashBankAccount;
    }

    @Basic
    @Column(name = "payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlTransaction that = (GlTransaction) o;
        return id == that.id &&
                Objects.equals(transactionHeaderId, that.transactionHeaderId) &&
                Objects.equals(transactionCode, that.transactionCode) &&
                Objects.equals(fiscalPeriodId, that.fiscalPeriodId) &&
                Objects.equals(fiscalYearId, that.fiscalYearId) &&
                Objects.equals(plAutoId, that.plAutoId) &&
                Objects.equals(branchId, that.branchId) &&
                Objects.equals(glAccNo, that.glAccNo) &&
                Objects.equals(confirmDate, that.confirmDate) &&
                Objects.equals(debit, that.debit) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(cashBook, that.cashBook) &&
                Objects.equals(type, that.type) &&
                Objects.equals(memNumber, that.memNumber) &&
                Objects.equals(time, that.time) &&
                Objects.equals(print, that.print) &&
                Objects.equals(status, that.status) &&
                Objects.equals(oldIdTemp, that.oldIdTemp) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(modifiedBy, that.modifiedBy) &&
                Objects.equals(cashBankAccount, that.cashBankAccount) &&
                Objects.equals(paymentMethod, that.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transactionHeaderId, transactionCode, fiscalPeriodId, fiscalYearId, plAutoId, branchId, glAccNo, confirmDate, debit, credit, balance, cashBook, type, memNumber, time, print, status, oldIdTemp, createdAt, modifiedAt, createdBy, modifiedBy, cashBankAccount, paymentMethod);
    }
}
