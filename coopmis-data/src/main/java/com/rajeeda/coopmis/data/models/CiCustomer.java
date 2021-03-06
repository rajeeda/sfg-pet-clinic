package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ci_customer", schema = "public", catalog = "db_coopmis")
public class CiCustomer {
    private long id;
    private Short active;
    private String address;
    private String address2;
    private String addressS;
    private Integer branchId;
    private Long centerId;
    private Timestamp createdAt;
    private Integer createdBy;
    private BigDecimal creditLimit;
    private int cusTypeId;
    private Timestamp dateOfB;
    private Integer districtId;
    private Long foId;
    private Long groupId;
    private String initialFor;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private String name;
    private String nameS;
    private String nicNo;
    private String numberCode;
    private Integer positionId;
    private String sex;
    private String title;
    private String titleS;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "active")
    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "address_s")
    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
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
    @Column(name = "center_id")
    public Long getCenterId() {
        return centerId;
    }

    public void setCenterId(Long centerId) {
        this.centerId = centerId;
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
    @Column(name = "credit_limit")
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Basic
    @Column(name = "cus_type_id")
    public int getCusTypeId() {
        return cusTypeId;
    }

    public void setCusTypeId(int cusTypeId) {
        this.cusTypeId = cusTypeId;
    }

    @Basic
    @Column(name = "date_of_b")
    public Timestamp getDateOfB() {
        return dateOfB;
    }

    public void setDateOfB(Timestamp dateOfB) {
        this.dateOfB = dateOfB;
    }

    @Basic
    @Column(name = "district_id")
    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    @Basic
    @Column(name = "fo_id")
    public Long getFoId() {
        return foId;
    }

    public void setFoId(Long foId) {
        this.foId = foId;
    }

    @Basic
    @Column(name = "group_id")
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "initial_for")
    public String getInitialFor() {
        return initialFor;
    }

    public void setInitialFor(String initialFor) {
        this.initialFor = initialFor;
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
    @Column(name = "nic_no")
    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    @Basic
    @Column(name = "number_code")
    public String getNumberCode() {
        return numberCode;
    }

    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode;
    }

    @Basic
    @Column(name = "position_id")
    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "title_s")
    public String getTitleS() {
        return titleS;
    }

    public void setTitleS(String titleS) {
        this.titleS = titleS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CiCustomer that = (CiCustomer) o;
        return id == that.id &&
                cusTypeId == that.cusTypeId &&
                Objects.equals(active, that.active) &&
                Objects.equals(address, that.address) &&
                Objects.equals(address2, that.address2) &&
                Objects.equals(addressS, that.addressS) &&
                Objects.equals(branchId, that.branchId) &&
                Objects.equals(centerId, that.centerId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(creditLimit, that.creditLimit) &&
                Objects.equals(dateOfB, that.dateOfB) &&
                Objects.equals(districtId, that.districtId) &&
                Objects.equals(foId, that.foId) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(initialFor, that.initialFor) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(modifiedBy, that.modifiedBy) &&
                Objects.equals(name, that.name) &&
                Objects.equals(nameS, that.nameS) &&
                Objects.equals(nicNo, that.nicNo) &&
                Objects.equals(numberCode, that.numberCode) &&
                Objects.equals(positionId, that.positionId) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(title, that.title) &&
                Objects.equals(titleS, that.titleS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, active, address, address2, addressS, branchId, centerId, createdAt, createdBy, creditLimit, cusTypeId, dateOfB, districtId, foId, groupId, initialFor, modifiedAt, modifiedBy, name, nameS, nicNo, numberCode, positionId, sex, title, titleS);
    }
}
