package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "it_report_category", schema = "public", catalog = "db_coopmis")
public class ItReportCategory {
    private Long id;
    private String description;
    private String categoryName;
    private Timestamp createdAt;
    private Time modifiedAt;
    private Time createdBy;
    private Time modifiedBy;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
    public Time getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Time modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Basic
    @Column(name = "created_by")
    public Time getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Time createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "modified_by")
    public Time getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Time modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItReportCategory that = (ItReportCategory) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(description, that.description) &&
                Objects.equals(categoryName, that.categoryName) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, categoryName, createdAt, modifiedAt, createdBy, modifiedBy);
    }
}
