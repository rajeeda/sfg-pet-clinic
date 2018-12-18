package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "it_quarter", schema = "public", catalog = "db_coopmis")
public class ItQuarter {
    private long id;
    private String qurterName;
    private Integer branchId;
    private Long fiscalYearId;
    private Date openDate;
    private Date closingDate;
    private String comment;
    private Long status;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    private Integer createdBy;
    private Integer modifiedBy;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "qurter_name")
    public String getQurterName() {
        return qurterName;
    }

    public void setQurterName(String qurterName) {
        this.qurterName = qurterName;
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
    @Column(name = "fiscal_year_id")
    public Long getFiscalYearId() {
        return fiscalYearId;
    }

    public void setFiscalYearId(Long fiscalYearId) {
        this.fiscalYearId = fiscalYearId;
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
    @Column(name = "closing_date")
    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItQuarter itQuarter = (ItQuarter) o;
        return id == itQuarter.id &&
                Objects.equals(qurterName, itQuarter.qurterName) &&
                Objects.equals(branchId, itQuarter.branchId) &&
                Objects.equals(fiscalYearId, itQuarter.fiscalYearId) &&
                Objects.equals(openDate, itQuarter.openDate) &&
                Objects.equals(closingDate, itQuarter.closingDate) &&
                Objects.equals(comment, itQuarter.comment) &&
                Objects.equals(status, itQuarter.status) &&
                Objects.equals(createdAt, itQuarter.createdAt) &&
                Objects.equals(modifiedAt, itQuarter.modifiedAt) &&
                Objects.equals(createdBy, itQuarter.createdBy) &&
                Objects.equals(modifiedBy, itQuarter.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qurterName, branchId, fiscalYearId, openDate, closingDate, comment, status, createdAt, modifiedAt, createdBy, modifiedBy);
    }
}
