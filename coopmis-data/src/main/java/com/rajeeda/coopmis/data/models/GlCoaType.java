package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_coa_type", schema = "public", catalog = "db_coopmis")
public class GlCoaType {
    private int id;
    private String cashFNote;
    private String category;
    private String categoryS;
    private Timestamp createdAt;
    private String createdBy;
    private Short filter;
    private Timestamp modifiedAt;
    private String modifiedBy;
    private String noteNum;
    private String subCategory;
    private String subCategoryS;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cash_f_note")
    public String getCashFNote() {
        return cashFNote;
    }

    public void setCashFNote(String cashFNote) {
        this.cashFNote = cashFNote;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "category_s")
    public String getCategoryS() {
        return categoryS;
    }

    public void setCategoryS(String categoryS) {
        this.categoryS = categoryS;
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
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "filter")
    public Short getFilter() {
        return filter;
    }

    public void setFilter(Short filter) {
        this.filter = filter;
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
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Basic
    @Column(name = "note_num")
    public String getNoteNum() {
        return noteNum;
    }

    public void setNoteNum(String noteNum) {
        this.noteNum = noteNum;
    }

    @Basic
    @Column(name = "sub_category")
    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    @Basic
    @Column(name = "sub_category_s")
    public String getSubCategoryS() {
        return subCategoryS;
    }

    public void setSubCategoryS(String subCategoryS) {
        this.subCategoryS = subCategoryS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlCoaType glCoaType = (GlCoaType) o;
        return id == glCoaType.id &&
                Objects.equals(cashFNote, glCoaType.cashFNote) &&
                Objects.equals(category, glCoaType.category) &&
                Objects.equals(categoryS, glCoaType.categoryS) &&
                Objects.equals(createdAt, glCoaType.createdAt) &&
                Objects.equals(createdBy, glCoaType.createdBy) &&
                Objects.equals(filter, glCoaType.filter) &&
                Objects.equals(modifiedAt, glCoaType.modifiedAt) &&
                Objects.equals(modifiedBy, glCoaType.modifiedBy) &&
                Objects.equals(noteNum, glCoaType.noteNum) &&
                Objects.equals(subCategory, glCoaType.subCategory) &&
                Objects.equals(subCategoryS, glCoaType.subCategoryS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cashFNote, category, categoryS, createdAt, createdBy, filter, modifiedAt, modifiedBy, noteNum, subCategory, subCategoryS);
    }
}
