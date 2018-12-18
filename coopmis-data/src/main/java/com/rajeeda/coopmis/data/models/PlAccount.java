package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pl_account", schema = "public", catalog = "db_coopmis")
public class PlAccount {
    private long id;
    private BigDecimal approved;
    private BigDecimal balance;
    private int branchId;
    private BigDecimal capital;
    private Integer clientAge;
    private Timestamp createdAt;
    private Integer createdBy;
    private String description;
    private Date dueDate;
    private BigDecimal dueInterest;
    private Integer fdNumberForLoan;
    private Integer fdRenewOption;
    private BigInteger fee;
    private Integer feeGl;
    private BigDecimal fund1;
    private Integer fund1Gl;
    private BigDecimal fund1Rate;
    private BigDecimal fund2;
    private Integer fund2Gl;
    private int glAccNo;
    private Integer glIntNo;
    private Integer glPenNo;
    private Integer glTaxNo;
    private Long guarantor1;
    private Long guarantor2;
    private Long guarantor3;
    private BigDecimal holdAmount;
    private BigDecimal installment;
    private BigInteger inteRate;
    private BigDecimal interest;
    private BigDecimal interestBalance;
    private BigDecimal interestInstallment;
    private BigDecimal interestTotal;
    private Integer interestType;
    private Long interestUpdateAccount;
    private Integer interestUpdateType;
    private Long loanDeductSavingNo;
    private Integer loanDeductStatus;
    private Long memNumber;
    private BigDecimal minimumBalance;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private Date openDate;
    private BigDecimal passdueInstallment;
    private BigDecimal passdueTotal;
    private Integer passdueType;
    private Integer pbBookNo;
    private Integer pbLineNo;
    private Integer pbPageNo;
    private Integer pbType;
    private BigDecimal penalty;
    private Integer penaltyBase;
    private Integer penaltyDays;
    private BigInteger penaltyRate;
    private Integer penaltyType;
    private BigDecimal period;
    private String plAccountCode;
    private Integer plAccountTypeId;
    private Short status;
    private BigDecimal taxAmount;
    private BigDecimal taxMinBalance;
    private BigDecimal taxRate;
    private BigDecimal tempPayment;
    private String time;
    private String accountType;
    private Boolean allowIntChange;
    private Boolean mobileCollection;
    private BigDecimal fund2Rate;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "approved")
    public BigDecimal getApproved() {
        return approved;
    }

    public void setApproved(BigDecimal approved) {
        this.approved = approved;
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
    @Column(name = "capital")
    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    @Basic
    @Column(name = "client_age")
    public Integer getClientAge() {
        return clientAge;
    }

    public void setClientAge(Integer clientAge) {
        this.clientAge = clientAge;
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
    @Column(name = "due_date")
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Basic
    @Column(name = "due_interest")
    public BigDecimal getDueInterest() {
        return dueInterest;
    }

    public void setDueInterest(BigDecimal dueInterest) {
        this.dueInterest = dueInterest;
    }

    @Basic
    @Column(name = "fd_number_for_loan")
    public Integer getFdNumberForLoan() {
        return fdNumberForLoan;
    }

    public void setFdNumberForLoan(Integer fdNumberForLoan) {
        this.fdNumberForLoan = fdNumberForLoan;
    }

    @Basic
    @Column(name = "fd_renew_option")
    public Integer getFdRenewOption() {
        return fdRenewOption;
    }

    public void setFdRenewOption(Integer fdRenewOption) {
        this.fdRenewOption = fdRenewOption;
    }

    @Basic
    @Column(name = "fee")
    public BigInteger getFee() {
        return fee;
    }

    public void setFee(BigInteger fee) {
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
    @Column(name = "fund_1_gl")
    public Integer getFund1Gl() {
        return fund1Gl;
    }

    public void setFund1Gl(Integer fund1Gl) {
        this.fund1Gl = fund1Gl;
    }

    @Basic
    @Column(name = "fund_1_rate")
    public BigDecimal getFund1Rate() {
        return fund1Rate;
    }

    public void setFund1Rate(BigDecimal fund1Rate) {
        this.fund1Rate = fund1Rate;
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
    @Column(name = "fund_2_gl")
    public Integer getFund2Gl() {
        return fund2Gl;
    }

    public void setFund2Gl(Integer fund2Gl) {
        this.fund2Gl = fund2Gl;
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
    public Integer getGlIntNo() {
        return glIntNo;
    }

    public void setGlIntNo(Integer glIntNo) {
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
    @Column(name = "gl_tax_no")
    public Integer getGlTaxNo() {
        return glTaxNo;
    }

    public void setGlTaxNo(Integer glTaxNo) {
        this.glTaxNo = glTaxNo;
    }

    @Basic
    @Column(name = "guarantor_1")
    public Long getGuarantor1() {
        return guarantor1;
    }

    public void setGuarantor1(Long guarantor1) {
        this.guarantor1 = guarantor1;
    }

    @Basic
    @Column(name = "guarantor_2")
    public Long getGuarantor2() {
        return guarantor2;
    }

    public void setGuarantor2(Long guarantor2) {
        this.guarantor2 = guarantor2;
    }

    @Basic
    @Column(name = "guarantor_3")
    public Long getGuarantor3() {
        return guarantor3;
    }

    public void setGuarantor3(Long guarantor3) {
        this.guarantor3 = guarantor3;
    }

    @Basic
    @Column(name = "hold_amount")
    public BigDecimal getHoldAmount() {
        return holdAmount;
    }

    public void setHoldAmount(BigDecimal holdAmount) {
        this.holdAmount = holdAmount;
    }

    @Basic
    @Column(name = "installment")
    public BigDecimal getInstallment() {
        return installment;
    }

    public void setInstallment(BigDecimal installment) {
        this.installment = installment;
    }

    @Basic
    @Column(name = "inte_rate")
    public BigInteger getInteRate() {
        return inteRate;
    }

    public void setInteRate(BigInteger inteRate) {
        this.inteRate = inteRate;
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
    @Column(name = "interest_total")
    public BigDecimal getInterestTotal() {
        return interestTotal;
    }

    public void setInterestTotal(BigDecimal interestTotal) {
        this.interestTotal = interestTotal;
    }

    @Basic
    @Column(name = "interest_type")
    public Integer getInterestType() {
        return interestType;
    }

    public void setInterestType(Integer interestType) {
        this.interestType = interestType;
    }

    @Basic
    @Column(name = "interest_update_account")
    public Long getInterestUpdateAccount() {
        return interestUpdateAccount;
    }

    public void setInterestUpdateAccount(Long interestUpdateAccount) {
        this.interestUpdateAccount = interestUpdateAccount;
    }

    @Basic
    @Column(name = "interest_update_type")
    public Integer getInterestUpdateType() {
        return interestUpdateType;
    }

    public void setInterestUpdateType(Integer interestUpdateType) {
        this.interestUpdateType = interestUpdateType;
    }

    @Basic
    @Column(name = "loan_deduct_saving_no")
    public Long getLoanDeductSavingNo() {
        return loanDeductSavingNo;
    }

    public void setLoanDeductSavingNo(Long loanDeductSavingNo) {
        this.loanDeductSavingNo = loanDeductSavingNo;
    }

    @Basic
    @Column(name = "loan_deduct_status")
    public Integer getLoanDeductStatus() {
        return loanDeductStatus;
    }

    public void setLoanDeductStatus(Integer loanDeductStatus) {
        this.loanDeductStatus = loanDeductStatus;
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
    @Column(name = "minimum_balance")
    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
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
    @Column(name = "open_date")
    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
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
    @Column(name = "passdue_total")
    public BigDecimal getPassdueTotal() {
        return passdueTotal;
    }

    public void setPassdueTotal(BigDecimal passdueTotal) {
        this.passdueTotal = passdueTotal;
    }

    @Basic
    @Column(name = "passdue_type")
    public Integer getPassdueType() {
        return passdueType;
    }

    public void setPassdueType(Integer passdueType) {
        this.passdueType = passdueType;
    }

    @Basic
    @Column(name = "pb_book_no")
    public Integer getPbBookNo() {
        return pbBookNo;
    }

    public void setPbBookNo(Integer pbBookNo) {
        this.pbBookNo = pbBookNo;
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
    @Column(name = "penalty_base")
    public Integer getPenaltyBase() {
        return penaltyBase;
    }

    public void setPenaltyBase(Integer penaltyBase) {
        this.penaltyBase = penaltyBase;
    }

    @Basic
    @Column(name = "penalty_days")
    public Integer getPenaltyDays() {
        return penaltyDays;
    }

    public void setPenaltyDays(Integer penaltyDays) {
        this.penaltyDays = penaltyDays;
    }

    @Basic
    @Column(name = "penalty_rate")
    public BigInteger getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(BigInteger penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    @Basic
    @Column(name = "penalty_type")
    public Integer getPenaltyType() {
        return penaltyType;
    }

    public void setPenaltyType(Integer penaltyType) {
        this.penaltyType = penaltyType;
    }

    @Basic
    @Column(name = "period")
    public BigDecimal getPeriod() {
        return period;
    }

    public void setPeriod(BigDecimal period) {
        this.period = period;
    }

    @Basic
    @Column(name = "pl_account_code")
    public String getPlAccountCode() {
        return plAccountCode;
    }

    public void setPlAccountCode(String plAccountCode) {
        this.plAccountCode = plAccountCode;
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
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "tax_amount")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Basic
    @Column(name = "tax_min_balance")
    public BigDecimal getTaxMinBalance() {
        return taxMinBalance;
    }

    public void setTaxMinBalance(BigDecimal taxMinBalance) {
        this.taxMinBalance = taxMinBalance;
    }

    @Basic
    @Column(name = "tax_rate")
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    @Basic
    @Column(name = "temp_payment")
    public BigDecimal getTempPayment() {
        return tempPayment;
    }

    public void setTempPayment(BigDecimal tempPayment) {
        this.tempPayment = tempPayment;
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
    @Column(name = "account_type")
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Basic
    @Column(name = "allow_int_change")
    public Boolean getAllowIntChange() {
        return allowIntChange;
    }

    public void setAllowIntChange(Boolean allowIntChange) {
        this.allowIntChange = allowIntChange;
    }

    @Basic
    @Column(name = "mobile_collection")
    public Boolean getMobileCollection() {
        return mobileCollection;
    }

    public void setMobileCollection(Boolean mobileCollection) {
        this.mobileCollection = mobileCollection;
    }

    @Basic
    @Column(name = "fund_2_rate")
    public BigDecimal getFund2Rate() {
        return fund2Rate;
    }

    public void setFund2Rate(BigDecimal fund2Rate) {
        this.fund2Rate = fund2Rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlAccount plAccount = (PlAccount) o;
        return id == plAccount.id &&
                branchId == plAccount.branchId &&
                glAccNo == plAccount.glAccNo &&
                Objects.equals(approved, plAccount.approved) &&
                Objects.equals(balance, plAccount.balance) &&
                Objects.equals(capital, plAccount.capital) &&
                Objects.equals(clientAge, plAccount.clientAge) &&
                Objects.equals(createdAt, plAccount.createdAt) &&
                Objects.equals(createdBy, plAccount.createdBy) &&
                Objects.equals(description, plAccount.description) &&
                Objects.equals(dueDate, plAccount.dueDate) &&
                Objects.equals(dueInterest, plAccount.dueInterest) &&
                Objects.equals(fdNumberForLoan, plAccount.fdNumberForLoan) &&
                Objects.equals(fdRenewOption, plAccount.fdRenewOption) &&
                Objects.equals(fee, plAccount.fee) &&
                Objects.equals(feeGl, plAccount.feeGl) &&
                Objects.equals(fund1, plAccount.fund1) &&
                Objects.equals(fund1Gl, plAccount.fund1Gl) &&
                Objects.equals(fund1Rate, plAccount.fund1Rate) &&
                Objects.equals(fund2, plAccount.fund2) &&
                Objects.equals(fund2Gl, plAccount.fund2Gl) &&
                Objects.equals(glIntNo, plAccount.glIntNo) &&
                Objects.equals(glPenNo, plAccount.glPenNo) &&
                Objects.equals(glTaxNo, plAccount.glTaxNo) &&
                Objects.equals(guarantor1, plAccount.guarantor1) &&
                Objects.equals(guarantor2, plAccount.guarantor2) &&
                Objects.equals(guarantor3, plAccount.guarantor3) &&
                Objects.equals(holdAmount, plAccount.holdAmount) &&
                Objects.equals(installment, plAccount.installment) &&
                Objects.equals(inteRate, plAccount.inteRate) &&
                Objects.equals(interest, plAccount.interest) &&
                Objects.equals(interestBalance, plAccount.interestBalance) &&
                Objects.equals(interestInstallment, plAccount.interestInstallment) &&
                Objects.equals(interestTotal, plAccount.interestTotal) &&
                Objects.equals(interestType, plAccount.interestType) &&
                Objects.equals(interestUpdateAccount, plAccount.interestUpdateAccount) &&
                Objects.equals(interestUpdateType, plAccount.interestUpdateType) &&
                Objects.equals(loanDeductSavingNo, plAccount.loanDeductSavingNo) &&
                Objects.equals(loanDeductStatus, plAccount.loanDeductStatus) &&
                Objects.equals(memNumber, plAccount.memNumber) &&
                Objects.equals(minimumBalance, plAccount.minimumBalance) &&
                Objects.equals(modifiedAt, plAccount.modifiedAt) &&
                Objects.equals(modifiedBy, plAccount.modifiedBy) &&
                Objects.equals(openDate, plAccount.openDate) &&
                Objects.equals(passdueInstallment, plAccount.passdueInstallment) &&
                Objects.equals(passdueTotal, plAccount.passdueTotal) &&
                Objects.equals(passdueType, plAccount.passdueType) &&
                Objects.equals(pbBookNo, plAccount.pbBookNo) &&
                Objects.equals(pbLineNo, plAccount.pbLineNo) &&
                Objects.equals(pbPageNo, plAccount.pbPageNo) &&
                Objects.equals(pbType, plAccount.pbType) &&
                Objects.equals(penalty, plAccount.penalty) &&
                Objects.equals(penaltyBase, plAccount.penaltyBase) &&
                Objects.equals(penaltyDays, plAccount.penaltyDays) &&
                Objects.equals(penaltyRate, plAccount.penaltyRate) &&
                Objects.equals(penaltyType, plAccount.penaltyType) &&
                Objects.equals(period, plAccount.period) &&
                Objects.equals(plAccountCode, plAccount.plAccountCode) &&
                Objects.equals(plAccountTypeId, plAccount.plAccountTypeId) &&
                Objects.equals(status, plAccount.status) &&
                Objects.equals(taxAmount, plAccount.taxAmount) &&
                Objects.equals(taxMinBalance, plAccount.taxMinBalance) &&
                Objects.equals(taxRate, plAccount.taxRate) &&
                Objects.equals(tempPayment, plAccount.tempPayment) &&
                Objects.equals(time, plAccount.time) &&
                Objects.equals(accountType, plAccount.accountType) &&
                Objects.equals(allowIntChange, plAccount.allowIntChange) &&
                Objects.equals(mobileCollection, plAccount.mobileCollection) &&
                Objects.equals(fund2Rate, plAccount.fund2Rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, approved, balance, branchId, capital, clientAge, createdAt, createdBy, description, dueDate, dueInterest, fdNumberForLoan, fdRenewOption, fee, feeGl, fund1, fund1Gl, fund1Rate, fund2, fund2Gl, glAccNo, glIntNo, glPenNo, glTaxNo, guarantor1, guarantor2, guarantor3, holdAmount, installment, inteRate, interest, interestBalance, interestInstallment, interestTotal, interestType, interestUpdateAccount, interestUpdateType, loanDeductSavingNo, loanDeductStatus, memNumber, minimumBalance, modifiedAt, modifiedBy, openDate, passdueInstallment, passdueTotal, passdueType, pbBookNo, pbLineNo, pbPageNo, pbType, penalty, penaltyBase, penaltyDays, penaltyRate, penaltyType, period, plAccountCode, plAccountTypeId, status, taxAmount, taxMinBalance, taxRate, tempPayment, time, accountType, allowIntChange, mobileCollection, fund2Rate);
    }
}
