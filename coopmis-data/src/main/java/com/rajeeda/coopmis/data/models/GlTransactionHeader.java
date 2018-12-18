package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_transaction_header", schema = "public", catalog = "db_coopmis")
public class GlTransactionHeader {
    private long id;
    private String adress;
    private Timestamp chequeDate;
    private String chequeNum;
    private Date confirmDate;
    private String correctionNote;
    private String correctionRefTrnCode;
    private String correctionType;
    private Timestamp createdAt;
    private Integer createdBy;
    private String description;
    private int glBranchId;
    private String memNumber;
    private Timestamp modifiedAt;
    private Integer modifiedBy;
    private String name;
    private String nicNo;
    private Integer oldIdTemp;
    private Boolean print;
    private Short status;
    private String time;
    private BigDecimal totalAmount;
    private String transactionCode;
    private String type;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "cheque_date")
    public Timestamp getChequeDate() {
        return chequeDate;
    }

    public void setChequeDate(Timestamp chequeDate) {
        this.chequeDate = chequeDate;
    }

    @Basic
    @Column(name = "cheque_num")
    public String getChequeNum() {
        return chequeNum;
    }

    public void setChequeNum(String chequeNum) {
        this.chequeNum = chequeNum;
    }

    @Basic
    @Column(name = "confirm_date")
    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    @Basic
    @Column(name = "correction_note")
    public String getCorrectionNote() {
        return correctionNote;
    }

    public void setCorrectionNote(String correctionNote) {
        this.correctionNote = correctionNote;
    }

    @Basic
    @Column(name = "correction_ref_trn_code")
    public String getCorrectionRefTrnCode() {
        return correctionRefTrnCode;
    }

    public void setCorrectionRefTrnCode(String correctionRefTrnCode) {
        this.correctionRefTrnCode = correctionRefTrnCode;
    }

    @Basic
    @Column(name = "correction_type")
    public String getCorrectionType() {
        return correctionType;
    }

    public void setCorrectionType(String correctionType) {
        this.correctionType = correctionType;
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
    @Column(name = "gl_branch_id")
    public int getGlBranchId() {
        return glBranchId;
    }

    public void setGlBranchId(int glBranchId) {
        this.glBranchId = glBranchId;
    }

    @Basic
    @Column(name = "mem_number")
    public String getMemNumber() {
        return memNumber;
    }

    public void setMemNumber(String memNumber) {
        this.memNumber = memNumber;
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
    @Column(name = "nic_no")
    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    @Basic
    @Column(name = "old_id_temp")
    public Integer getOldIdTemp() {
        return oldIdTemp;
    }

    public void setOldIdTemp(Integer oldIdTemp) {
        this.oldIdTemp = oldIdTemp;
    }

    @Basic
    @Column(name = "print")
    public Boolean getPrint() {
        return print;
    }

    public void setPrint(Boolean print) {
        this.print = print;
    }

    @Basic
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "total_amount")
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Basic
    @Column(name = "transaction_code")
    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlTransactionHeader that = (GlTransactionHeader) o;
        return id == that.id &&
                glBranchId == that.glBranchId &&
                Objects.equals(adress, that.adress) &&
                Objects.equals(chequeDate, that.chequeDate) &&
                Objects.equals(chequeNum, that.chequeNum) &&
                Objects.equals(confirmDate, that.confirmDate) &&
                Objects.equals(correctionNote, that.correctionNote) &&
                Objects.equals(correctionRefTrnCode, that.correctionRefTrnCode) &&
                Objects.equals(correctionType, that.correctionType) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(description, that.description) &&
                Objects.equals(memNumber, that.memNumber) &&
                Objects.equals(modifiedAt, that.modifiedAt) &&
                Objects.equals(modifiedBy, that.modifiedBy) &&
                Objects.equals(name, that.name) &&
                Objects.equals(nicNo, that.nicNo) &&
                Objects.equals(oldIdTemp, that.oldIdTemp) &&
                Objects.equals(print, that.print) &&
                Objects.equals(status, that.status) &&
                Objects.equals(time, that.time) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(transactionCode, that.transactionCode) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adress, chequeDate, chequeNum, confirmDate, correctionNote, correctionRefTrnCode, correctionType, createdAt, createdBy, description, glBranchId, memNumber, modifiedAt, modifiedBy, name, nicNo, oldIdTemp, print, status, time, totalAmount, transactionCode, type);
    }
}
