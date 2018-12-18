package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "it_report_category_language", schema = "public", catalog = "db_coopmis")
public class ItReportCategoryLanguage {
    private Integer id;
    private String categoryNameText;
    private String categoryDescriptionText;
    private String categoryName;
    private Time createdAt;
    private Integer createdBy;
    private Time modifiedAt;
    private Integer modifiedBy;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
        ItReportCategoryLanguage that = (ItReportCategoryLanguage) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(categoryNameText, that.categoryNameText) &&
                Objects.equals(categoryDescriptionText, that.categoryDescriptionText) &&
                Objects.equals(categoryName, that.categoryName) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryNameText, categoryDescriptionText, categoryName, createdAt, createdBy, modifiedAt, modifiedBy);
    }
}
