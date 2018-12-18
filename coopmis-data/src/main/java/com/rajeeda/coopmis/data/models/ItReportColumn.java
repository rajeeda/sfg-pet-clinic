package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "it_report_column", schema = "public", catalog = "db_coopmis")
public class ItReportColumn {
    private Long id;
    private Integer reportNameId;
    private String columnName;
    private Short visibleStatus;
    private String categoryNameText;
    private String categoryDescriptionText;
    private Time createdAt;
    private Integer createdBy;
    private Time modifiedAt;
    private Integer modifiedBy;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "report_name_id")
    public Integer getReportNameId() {
        return reportNameId;
    }

    public void setReportNameId(Integer reportNameId) {
        this.reportNameId = reportNameId;
    }

    @Basic
    @Column(name = "column_name")
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Basic
    @Column(name = "visible_status")
    public Short getVisibleStatus() {
        return visibleStatus;
    }

    public void setVisibleStatus(Short visibleStatus) {
        this.visibleStatus = visibleStatus;
    }

    @Basic
    @Column(name = "category_name_text")
    public String getCategoryNameText() {
        return categoryNameText;
    }

    public void setCategoryNameText(String categoryNameText) {
        this.categoryNameText = categoryNameText;
    }

    @Basic
    @Column(name = "category_description_text")
    public String getCategoryDescriptionText() {
        return categoryDescriptionText;
    }

    public void setCategoryDescriptionText(String categoryDescriptionText) {
        this.categoryDescriptionText = categoryDescriptionText;
    }

    @Basic
    @Column(name = "created_at")
    public Time getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Time createdAt) {
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
    @Column(name = "modified_at")
    public Time getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Time modifiedAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItReportColumn that = (ItReportColumn) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(reportNameId, that.reportNameId) &&
                Objects.equals(columnName, that.columnName) &&
                Objects.equals(visibleStatus, that.visibleStatus) &&
                Objects.equals(categoryNameText, that.categoryNameText) &&
                Objects.equals(categoryDescriptionText, that.categoryDescriptionText) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reportNameId, columnName, visibleStatus, categoryNameText, categoryDescriptionText, createdAt, createdBy, modifiedAt, modifiedBy);
    }
}
