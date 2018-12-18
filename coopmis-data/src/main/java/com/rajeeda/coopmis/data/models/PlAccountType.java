package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pl_account_type", schema = "public", catalog = "db_coopmis")
public class PlAccountType {
    private int id;
    private String accountType;
    private Timestamp createdAt;
    private Integer createdBy;
    private BigDecimal fdLoanAmount;
    private BigDecimal fdLoanRateGap;
    private BigDecimal feeRate;
    private BigDecimal fund1Rate;
    private BigDecimal fund2Rate;
    private int glCoaId;
    private Integer glFeeNo;
    private Integer glFund1;
    private Integer glFund2;
    private Integer glIntNo;
    private Integer glPenNo;
    private Integer glTaxNo;
    private BigDecimal intRateMax;
    private BigDecimal intRateMin;
    private Integer interestType;
    private Integer interestUpdatePolicy;
    private BigDecimal minimumBalance;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private String name;
    private String nameS;
    private Integer passdueType;
    private Integer penDays;
    private BigDecimal penRate;
    private Integer penaltyType;
    private BigDecimal periodMax;
    private BigDecimal periodMin;
    private Integer repaymentType;
    private BigDecimal taxMinBalance;
    private BigDecimal taxRate;
    private Boolean allowIntChange;
    private Boolean mobileCollection;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "fd_loan_amount")
    public BigDecimal getFdLoanAmount() {
        return fdLoanAmount;
    }

    public void setFdLoanAmount(BigDecimal fdLoanAmount) {
        this.fdLoanAmount = fdLoanAmount;
    }

    @Basic
    @Column(name = "fd_loan_rate_gap")
    public BigDecimal getFdLoanRateGap() {
        return fdLoanRateGap;
    }

    public void setFdLoanRateGap(BigDecimal fdLoanRateGap) {
        this.fdLoanRateGap = fdLoanRateGap;
    }

    @Basic
    @Column(name = "fee_rate")
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
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
    @Column(name = "fund_2_rate")
    public BigDecimal getFund2Rate() {
        return fund2Rate;
    }

    public void setFund2Rate(BigDecimal fund2Rate) {
        this.fund2Rate = fund2Rate;
    }

    @Basic
    @Column(name = "gl_coa_id")
    public int getGlCoaId() {
        return glCoaId;
    }

    public void setGlCoaId(int glCoaId) {
        this.glCoaId = glCoaId;
    }

    @Basic
    @Column(name = "gl_fee_no")
    public Integer getGlFeeNo() {
        return glFeeNo;
    }

    public void setGlFeeNo(Integer glFeeNo) {
        this.glFeeNo = glFeeNo;
    }

    @Basic
    @Column(name = "gl_fund_1")
    public Integer getGlFund1() {
        return glFund1;
    }

    public void setGlFund1(Integer glFund1) {
        this.glFund1 = glFund1;
    }

    @Basic
    @Column(name = "gl_fund_2")
    public Integer getGlFund2() {
        return glFund2;
    }

    public void setGlFund2(Integer glFund2) {
        this.glFund2 = glFund2;
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
    @Column(name = "int_rate_max")
    public BigDecimal getIntRateMax() {
        return intRateMax;
    }

    public void setIntRateMax(BigDecimal intRateMax) {
        this.intRateMax = intRateMax;
    }

    @Basic
    @Column(name = "int_rate_min")
    public BigDecimal getIntRateMin() {
        return intRateMin;
    }

    public void setIntRateMin(BigDecimal intRateMin) {
        this.intRateMin = intRateMin;
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
    @Column(name = "interest_update_policy")
    public Integer getInterestUpdatePolicy() {
        return interestUpdatePolicy;
    }

    public void setInterestUpdatePolicy(Integer interestUpdatePolicy) {
        this.interestUpdatePolicy = interestUpdatePolicy;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "name_s")
    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
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
    @Column(name = "pen_days")
    public Integer getPenDays() {
        return penDays;
    }

    public void setPenDays(Integer penDays) {
        this.penDays = penDays;
    }

    @Basic
    @Column(name = "pen_rate")
    public BigDecimal getPenRate() {
        return penRate;
    }

    public void setPenRate(BigDecimal penRate) {
        this.penRate = penRate;
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
    @Column(name = "period_max")
    public BigDecimal getPeriodMax() {
        return periodMax;
    }

    public void setPeriodMax(BigDecimal periodMax) {
        this.periodMax = periodMax;
    }

    @Basic
    @Column(name = "period_min")
    public BigDecimal getPeriodMin() {
        return periodMin;
    }

    public void setPeriodMin(BigDecimal periodMin) {
        this.periodMin = periodMin;
    }

    @Basic
    @Column(name = "repayment_type")
    public Integer getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(Integer repaymentType) {
        this.repaymentType = repaymentType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlAccountType that = (PlAccountType) o;
        return id == that.id &&
                glCoaId == that.glCoaId &&
                Objects.equals(accountType, that.accountType) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(fdLoanAmount, that.fdLoanAmount) &&
                Objects.equals(fdLoanRateGap, that.fdLoanRateGap) &&
                Objects.equals(feeRate, that.feeRate) &&
                Objects.equals(fund1Rate, that.fund1Rate) &&
                Objects.equals(fund2Rate, that.fund2Rate) &&
                Objects.equals(glFeeNo, that.glFeeNo) &&
                Objects.equals(glFund1, that.glFund1) &&
                Objects.equals(glFund2, that.glFund2) &&
                Objects.equals(glIntNo, that.glIntNo) &&
                Objects.equals(glPenNo, that.glPenNo) &&
                Objects.equals(glTaxNo, that.glTaxNo) &&
                Objects.equals(intRateMax, that.intRateMax) &&
                Objects.equals(intRateMin, that.intRateMin) &&
                Objects.equals(interestType, that.interestType) &&
                Objects.equals(interestUpdatePolicy, that.interestUpdatePolicy) &&
                Objects.equals(minimumBalance, that.minimumBalance) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(modifiedBy, that.modifiedBy) &&
                Objects.equals(name, that.name) &&
                Objects.equals(nameS, that.nameS) &&
                Objects.equals(passdueType, that.passdueType) &&
                Objects.equals(penDays, that.penDays) &&
                Objects.equals(penRate, that.penRate) &&
                Objects.equals(penaltyType, that.penaltyType) &&
                Objects.equals(periodMax, that.periodMax) &&
                Objects.equals(periodMin, that.periodMin) &&
                Objects.equals(repaymentType, that.repaymentType) &&
                Objects.equals(taxMinBalance, that.taxMinBalance) &&
                Objects.equals(taxRate, that.taxRate) &&
                Objects.equals(allowIntChange, that.allowIntChange) &&
                Objects.equals(mobileCollection, that.mobileCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountType, createdAt, createdBy, fdLoanAmount, fdLoanRateGap, feeRate, fund1Rate, fund2Rate, glCoaId, glFeeNo, glFund1, glFund2, glIntNo, glPenNo, glTaxNo, intRateMax, intRateMin, interestType, interestUpdatePolicy, minimumBalance, modifiedAt, modifiedBy, name, nameS, passdueType, penDays, penRate, penaltyType, periodMax, periodMin, repaymentType, taxMinBalance, taxRate, allowIntChange, mobileCollection);
    }
}
