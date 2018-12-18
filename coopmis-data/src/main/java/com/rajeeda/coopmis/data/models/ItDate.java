package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "it_date", schema = "public", catalog = "db_coopmis")
public class ItDate {
    private long id;
    private Date date;
    private Integer branchId;
    private Long fiscalYearId;
    private Long monthId;
    private Boolean dayEndStatus;
    private Boolean dayOpenStatus;
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
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    @Column(name = "month_id")
    public Long getMonthId() {
        return monthId;
    }

    public void setMonthId(Long monthId) {
        this.monthId = monthId;
    }

    @Basic
    @Column(name = "day_end_status")
    public Boolean getDayEndStatus() {
        return dayEndStatus;
    }

    public void setDayEndStatus(Boolean dayEndStatus) {
        this.dayEndStatus = dayEndStatus;
    }

    @Basic
    @Column(name = "day_open_status")
    public Boolean getDayOpenStatus() {
        return dayOpenStatus;
    }

    public void setDayOpenStatus(Boolean dayOpenStatus) {
        this.dayOpenStatus = dayOpenStatus;
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
        ItDate itDate = (ItDate) o;
        return id == itDate.id &&
                Objects.equals(date, itDate.date) &&
                Objects.equals(branchId, itDate.branchId) &&
                Objects.equals(fiscalYearId, itDate.fiscalYearId) &&
                Objects.equals(monthId, itDate.monthId) &&
                Objects.equals(dayEndStatus, itDate.dayEndStatus) &&
                Objects.equals(dayOpenStatus, itDate.dayOpenStatus) &&
                Objects.equals(comment, itDate.comment) &&
                Objects.equals(status, itDate.status) &&
                Objects.equals(createdAt, itDate.createdAt) &&
                Objects.equals(modifiedAt, itDate.modifiedAt) &&
                Objects.equals(createdBy, itDate.createdBy) &&
                Objects.equals(modifiedBy, itDate.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, branchId, fiscalYearId, monthId, dayEndStatus, dayOpenStatus, comment, status, createdAt, modifiedAt, createdBy, modifiedBy);
    }
}
