package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pl_transaction", schema = "public", catalog = "db_coopmis")
public class PlTransaction {
    private long id;
    private BigDecimal amount;
    private BigDecimal balance;
    private int branchId;
    private Date confirmDate;
    private Timestamp createdAt;
    private Integer createdBy;
    private BigDecimal credit;
    private BigDecimal debit;
    private String description;
    private BigDecimal fee;
    private Integer feeGl;
    private BigDecimal fund1;
    private BigDecimal fund2;
    private int glAccNo;
    private int glIntNo;
    private Integer glPenNo;
    private String intChange;
    private BigDecimal interest;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private Integer oldIdTemp;
    private Integer originalInterest;
    private BigDecimal passdue;
    private BigDecimal passdueInstallment;
    private Integer pbLineNo;
    private Integer pbPageNo;
    private Integer pbType;
    private BigDecimal penalty;
    private long plAccountId;
    private Short print;
    private String printCode;
    private Short status;
    private Time time;
    private String transactionCode;
    private String type;
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
    @Column(name = "amount")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    @Column(name = "branch_id")
    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
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
    @Column(name = "debit")
    public BigDecimal getDebit() {
        return debit;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
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
    @Column(name = "fee")
    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Basic
    @Column(name = "fee_gl")
    public Integer getFeeGl() {
        return feeGl;
    }

    public void setFeeGl(Integer feeGl) {
        this.feeGl = feeGl;
    }

    @Basic
    @Column(name = "fund_1")
    public BigDecimal getFund1() {
        return fund1;
    }

    public void setFund1(BigDecimal fund1) {
        this.fund1 = fund1;
    }

    @Basic
    @Column(name = "fund_2")
    public BigDecimal getFund2() {
        return fund2;
    }

    public void setFund2(BigDecimal fund2) {
        this.fund2 = fund2;
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
    @Column(name = "gl_int_no")
    public int getGlIntNo() {
        return glIntNo;
    }

    public void setGlIntNo(int glIntNo) {
        this.glIntNo = glIntNo;
    }

    @Basic
    @Column(name = "gl_pen_no")
    public Integer getGlPenNo() {
        return glPenNo;
    }

    public void setGlPenNo(Integer glPenNo) {
        this.glPenNo = glPenNo;
    }

    @Basic
    @Column(name = "int_change")
    public String getIntChange() {
        return intChange;
    }

    public void setIntChange(String intChange) {
        this.intChange = intChange;
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
    @Column(name = "old_id_temp")
    public Integer getOldIdTemp() {
        return oldIdTemp;
    }

    public void setOldIdTemp(Integer oldIdTemp) {
        this.oldIdTemp = oldIdTemp;
    }

    @Basic
    @Column(name = "original_interest")
    public Integer getOriginalInterest() {
        return originalInterest;
    }

    public void setOriginalInterest(Integer originalInterest) {
        this.originalInterest = originalInterest;
    }

    @Basic
    @Column(name = "passdue")
    public BigDecimal getPassdue() {
        return passdue;
    }

    public void setPassdue(BigDecimal passdue) {
        this.passdue = passdue;
    }

    @Basic
    @Column(name = "passdue_installment")
    public BigDecimal getPassdueInstallment() {
        return passdueInstallment;
    }

    public void setPassdueInstallment(BigDecimal passdueInstallment) {
        this.passdueInstallment = passdueInstallment;
    }

    @Basic
    @Column(name = "pb_line_no")
    public Integer getPbLineNo() {
        return pbLineNo;
    }

    public void setPbLineNo(Integer pbLineNo) {
        this.pbLineNo = pbLineNo;
    }

    @Basic
    @Column(name = "pb_page_no")
    public Integer getPbPageNo() {
        return pbPageNo;
    }

    public void setPbPageNo(Integer pbPageNo) {
        this.pbPageNo = pbPageNo;
    }

    @Basic
    @Column(name = "pb_type")
    public Integer getPbType() {
        return pbType;
    }

    public void setPbType(Integer pbType) {
        this.pbType = pbType;
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
    @Column(name = "pl_account_id")
    public long getPlAccountId() {
        return plAccountId;
    }

    public void setPlAccountId(long plAccountId) {
        this.plAccountId = plAccountId;
    }

    @Basic
    @Column(name = "print")
    public Short getPrint() {
        return print;
    }

    public void setPrint(Short print) {
        this.print = print;
    }

    @Basic
    @Column(name = "print_code")
    public String getPrintCode() {
        return printCode;
    }

    public void setPrintCode(String printCode) {
        this.printCode = printCode;
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
    @Column(name = "time")
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
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
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        PlTransaction that = (PlTransaction) o;
        return id == that.id &&
                branchId == that.branchId &&
                glAccNo == that.glAccNo &&
                glIntNo == that.glIntNo &&
                plAccountId == that.plAccountId &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(confirmDate, that.confirmDate) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(debit, that.debit) &&
                Objects.equals(description, that.description) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(feeGl, that.feeGl) &&
                Objects.equals(fund1, that.fund1) &&
                Objects.equals(fund2, that.fund2) &&
                Objects.equals(glPenNo, that.glPenNo) &&
                Objects.equals(intChange, that.intChange) &&
                Objects.equals(interest, that.interest) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(modifiedBy, that.modifiedBy) &&
                Objects.equals(oldIdTemp, that.oldIdTemp) &&
                Objects.equals(originalInterest, that.originalInterest) &&
                Objects.equals(passdue, that.passdue) &&
                Objects.equals(passdueInstallment, that.passdueInstallment) &&
                Objects.equals(pbLineNo, that.pbLineNo) &&
                Objects.equals(pbPageNo, that.pbPageNo) &&
                Objects.equals(pbType, that.pbType) &&
                Objects.equals(penalty, that.penalty) &&
                Objects.equals(print, that.print) &&
                Objects.equals(printCode, that.printCode) &&
                Objects.equals(status, that.status) &&
                Objects.equals(time, that.time) &&
                Objects.equals(transactionCode, that.transactionCode) &&
                Objects.equals(type, that.type) &&
                Objects.equals(paymentMethod, that.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, balance, branchId, confirmDate, createdAt, createdBy, credit, debit, description, fee, feeGl, fund1, fund2, glAccNo, glIntNo, glPenNo, intChange, interest, modifiedAt, modifiedBy, oldIdTemp, originalInterest, passdue, passdueInstallment, pbLineNo, pbPageNo, pbType, penalty, plAccountId, print, printCode, status, time, transactionCode, type, paymentMethod);
    }
}
