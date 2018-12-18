package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tm_transaction", schema = "public", catalog = "db_coopmis")
public class TmTransaction {
    private Long id;
    private String transactionCode;
    private String paymentMethod;
    private Integer glAccount;
    private Long plAccountId;
    private Date confirmDate;
    private Integer cashBankAccount;
    private BigDecimal amount;
    private BigDecimal debit;
    private BigDecimal credit;
    private BigDecimal interest;
    private BigDecimal penalty;
    private BigDecimal fee;
    private BigDecimal fund1;
    private BigDecimal fund2;
    private Short status;
    private Integer createdBy;
    private Integer modifiedBy;
    private Long memberNo;
    private String transactionType;
    private String accountType;
    private String chequeNo;
    private Date chequeDate;
    private Timestamp modifiedAt;
    private Timestamp createdAt;
    private BigDecimal balance;
    private BigDecimal interestBalance;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Basic
    @Column(name = "gl_account")
    public Integer getGlAccount() {
        return glAccount;
    }

    public void setGlAccount(Integer glAccount) {
        this.glAccount = glAccount;
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
    @Column(name = "confirm_date")
    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
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
    @Column(name = "amount")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    @Column(name = "interest")
    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    @Basic
    @Column(name = "penalty")
    public BigDecimal getPenalty() {
        return penalty;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    @Basic
    @Column(name = "fee")
    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Basic
    @Column(name = "fund1")
    public BigDecimal getFund1() {
        return fund1;
    }

    public void setFund1(BigDecimal fund1) {
        this.fund1 = fund1;
    }

    @Basic
    @Column(name = "fund2")
    public BigDecimal getFund2() {
        return fund2;
    }

    public void setFund2(BigDecimal fund2) {
        this.fund2 = fund2;
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
    @Column(name = "member_no")
    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    @Basic
    @Column(name = "transaction_type")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Basic
    @Column(name = "account_type")
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Basic
    @Column(name = "cheque_no")
    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    @Basic
    @Column(name = "cheque_date")
    public Date getChequeDate() {
        return chequeDate;
    }

    public void setChequeDate(Date chequeDate) {
        this.chequeDate = chequeDate;
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
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
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
    @Column(name = "interest_balance")
    public BigDecimal getInterestBalance() {
        return interestBalance;
    }

    public void setInterestBalance(BigDecimal interestBalance) {
        this.interestBalance = interestBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TmTransaction that = (TmTransaction) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(transactionCode, that.transactionCode) &&
                Objects.equals(paymentMethod, that.paymentMethod) &&
                Objects.equals(glAccount, that.glAccount) &&
                Objects.equals(plAccountId, that.plAccountId) &&
                Objects.equals(confirmDate, that.confirmDate) &&
                Objects.equals(cashBankAccount, that.cashBankAccount) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(debit, that.debit) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(interest, that.interest) &&
                Objects.equals(penalty, that.penalty) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(fund1, that.fund1) &&
                Objects.equals(fund2, that.fund2) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(modifiedBy, that.modifiedBy) &&
                Objects.equals(memberNo, that.memberNo) &&
                Objects.equals(transactionType, that.transactionType) &&
                Objects.equals(accountType, that.accountType) &&
                Objects.equals(chequeNo, that.chequeNo) &&
                Objects.equals(chequeDate, that.chequeDate) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(interestBalance, that.interestBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transactionCode, paymentMethod, glAccount, plAccountId, confirmDate, cashBankAccount, amount, debit, credit, interest, penalty, fee, fund1, fund2, status, createdBy, modifiedBy, memberNo, transactionType, accountType, chequeNo, chequeDate, modifiedAt, createdAt, balance, interestBalance);
    }
}
