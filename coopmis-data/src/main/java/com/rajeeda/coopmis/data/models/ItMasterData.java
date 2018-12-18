package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "it_master_data", schema = "public", catalog = "db_coopmis")
public class ItMasterData {
    private long id;
    private String name;
    private String nameS;
    private String nameT;
    private String address;
    private String addressS;
    private String addressE;
    private String city;
    private String cityS;
    private String cityT;
    private String registerNum;
    private Date registerDate;
    private String telephone;
    private String fax;
    private String eMail;
    private String limited;
    private String fiscalYear;
    private String dailyDayEnd;
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
    @Column(name = "name_t")
    public String getNameT() {
        return nameT;
    }

    public void setNameT(String nameT) {
        this.nameT = nameT;
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
    @Column(name = "address_s")
    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
    }

    @Basic
    @Column(name = "address_e")
    public String getAddressE() {
        return addressE;
    }

    public void setAddressE(String addressE) {
        this.addressE = addressE;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "city_s")
    public String getCityS() {
        return cityS;
    }

    public void setCityS(String cityS) {
        this.cityS = cityS;
    }

    @Basic
    @Column(name = "city_t")
    public String getCityT() {
        return cityT;
    }

    public void setCityT(String cityT) {
        this.cityT = cityT;
    }

    @Basic
    @Column(name = "register_num")
    public String getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(String registerNum) {
        this.registerNum = registerNum;
    }

    @Basic
    @Column(name = "register_date")
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "e_mail")
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Basic
    @Column(name = "limited")
    public String getLimited() {
        return limited;
    }

    public void setLimited(String limited) {
        this.limited = limited;
    }

    @Basic
    @Column(name = "fiscal_year")
    public String getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Basic
    @Column(name = "daily_day_end")
    public String getDailyDayEnd() {
        return dailyDayEnd;
    }

    public void setDailyDayEnd(String dailyDayEnd) {
        this.dailyDayEnd = dailyDayEnd;
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
        ItMasterData that = (ItMasterData) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(nameS, that.nameS) &&
                Objects.equals(nameT, that.nameT) &&
                Objects.equals(address, that.address) &&
                Objects.equals(addressS, that.addressS) &&
                Objects.equals(addressE, that.addressE) &&
                Objects.equals(city, that.city) &&
                Objects.equals(cityS, that.cityS) &&
                Objects.equals(cityT, that.cityT) &&
                Objects.equals(registerNum, that.registerNum) &&
                Objects.equals(registerDate, that.registerDate) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(eMail, that.eMail) &&
                Objects.equals(limited, that.limited) &&
                Objects.equals(fiscalYear, that.fiscalYear) &&
                Objects.equals(dailyDayEnd, that.dailyDayEnd) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameS, nameT, address, addressS, addressE, city, cityS, cityT, registerNum, registerDate, telephone, fax, eMail, limited, fiscalYear, dailyDayEnd, comment, status, createdAt, modifiedAt, createdBy, modifiedBy);
    }
}
