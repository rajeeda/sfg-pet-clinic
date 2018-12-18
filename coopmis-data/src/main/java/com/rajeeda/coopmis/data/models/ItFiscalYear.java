package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "it_fiscal_year", schema = "public", catalog = "db_coopmis")
public class ItFiscalYear {
    private long id;
    private String fiscalYearName;
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
    @Column(name = "fiscal_year_name")
    public String getFiscalYearName() {
        return fiscalYearName;
    }

    public void setFiscalYearName(String fiscalYearName) {
        this.fiscalYearName = fiscalYearName;
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
        ItFiscalYear that = (ItFiscalYear) o;
        return id == that.id &&
                Objects.equals(fiscalYearName, that.fiscalYearName) &&
                Objects.equals(openDate, that.openDate) &&
                Objects.equals(closingDate, that.closingDate) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fiscalYearName, openDate, closingDate, comment, status, createdAt, modifiedAt, createdBy, modifiedBy);
    }
}
