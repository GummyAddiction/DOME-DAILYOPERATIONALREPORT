package com.dome.reporttxn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FUNCTIONALLOCATION")
public class FunctionalLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FUNCTIONALLOCATIONID")
    private Long functionallocationid;

    @Column(name ="NAME")
    private String name;

    @Column(name = "CREATEDBY")
    private String createdBy;

    @Column(name = "CREATEDDATE")
    private String createdDate;

    @Column(name = "UPDATEDBY")
    private String updateBy;

    @Column(name = "UPDATEDATE")
    private String updateDate;

    public Long getFunctionallocationid() {
        return functionallocationid;
    }

    public void setFunctionallocationid(Long functionallocationid) {
        this.functionallocationid = functionallocationid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public FunctionalLocation(Long functionallocationid, String name, String createdBy, String createdDate,
            String updateBy, String updateDate) {
        this.functionallocationid = functionallocationid;
        this.name = name;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
    }

    
    public FunctionalLocation(){
  
    }
}
