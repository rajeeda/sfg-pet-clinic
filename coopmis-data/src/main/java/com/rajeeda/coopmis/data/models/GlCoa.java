package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_coa", schema = "public", catalog = "db_coopmis")
public class GlCoa {
    private int id;
    private int accTypId;
    private Timestamp createdAt;
    private Integer createdBy;
    private String description;
    private short filter;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private String name;
    private String nameS;
    private Short status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "acc_typ_id")
    public int getAccTypId() {
        return accTypId;
    }

    public void setAccTypId(int accTypId) {
        this.accTypId = accTypId;
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
    @Column(name = "filter")
    public short getFilter() {
        return filter;
    }

    public void setFilter(short filter) {
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
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlCoa glCoa = (GlCoa) o;
        return id == glCoa.id &&
                accTypId == glCoa.accTypId &&
                filter == glCoa.filter &&
                Objects.equals(createdAt, glCoa.createdAt) &&
                Objects.equals(createdBy, glCoa.createdBy) &&
                Objects.equals(description, glCoa.description) &&
                Objects.equals(modifiedAt, glCoa.modifiedAt) &&
                Objects.equals(modifiedBy, glCoa.modifiedBy) &&
                Objects.equals(name, glCoa.name) &&
                Objects.equals(nameS, glCoa.nameS) &&
                Objects.equals(status, glCoa.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accTypId, createdAt, createdBy, description, filter, modifiedAt, modifiedBy, name, nameS, status);
    }
}
