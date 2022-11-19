package com.dome.reporttxn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPORTTXN")
public class ReportTxn implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Reporttransactionid")
    private Long Reporttransactionid;
    @Column(name = "Shift")
    private Long Shift;
    @Column(name = "Datecreated")
    private String Datecreated;
    @Column(name = "Createdby")
    private String Createdby;
    @Column(name = "Updatedby")
    private String Updatedby;
    @Column(name = "Updatedate")
    private String Updatedate;
    @Column(name = "Jobtype")
    private String Jobtype;
    @Column(name = "Timeinformed")
    private String Timeinformed;
    @Column(name = "Starttime")
    private String Starttime;
    @Column(name = "Finishtime")
    private String Finishtime;
    @Column(name = "Totaltime")
    private String Totaltime;
    @Column(name = "Stoppagetime")
    private String Stoppagetime;
    @Column(name = "Functionallocation")
    private String Functionallocation;
    @Column(name = "Subfunctionallocation")
    private String Subfunctionallocation;
    @Column(name = "machine")
    private String machine;
    @Column(name = "Detailmachine")
    private String Detailmachine;
    @Column(name = "Problem")
    private String Problem;
    @Column(name = "Cause")
    private String Cause;
    @Column(name = "Bias")
    private String Bias;
    @Column(name = "Action")
    private String Action;
    @Column(name = "Executor1")
    private String Executor1;
    @Column(name = "Executor2")
    private String Executor2;
    @Column(name = "Executorextra")
    private String Executorextra;
    @Column(name = "Condition")
    private String Condition;
    @Column(name = "Reason")
    private String Reason;
    @Column(name = "Note")
    private String Note;

    public ReportTxn() {

    }

    public Long getReporttransactionid() {
        return Reporttransactionid;
    }

    public void setReporttransactionid(Long reporttransactionid) {
        Reporttransactionid = reporttransactionid;
    }

    public Long getShift() {
        return Shift;
    }

    public void setShift(Long shift) {
        Shift = shift;
    }

    public String getDatecreated() {
        return Datecreated;
    }

    public void setDatecreated(String datecreated) {
        Datecreated = datecreated;
    }

    public String getCreatedby() {
        return Createdby;
    }

    public void setCreatedby(String createdby) {
        Createdby = createdby;
    }

    public String getUpdatedby() {
        return Updatedby;
    }

    public void setUpdatedby(String updatedby) {
        Updatedby = updatedby;
    }

    public String getUpdatedate() {
        return Updatedate;
    }

    public void setUpdatedate(String Updatedate) {
        Updatedate = Updatedate;
    }

    public String getJobtype() {
        return Jobtype;
    }

    public void setJobtype(String jobtype) {
        Jobtype = jobtype;
    }

    public String getTimeinformed() {
        return Timeinformed;
    }

    public void setTimeinformed(String timeinformed) {
        Timeinformed = timeinformed;
    }

    public String getStarttime() {
        return Starttime;
    }

    public void setStarttime(String starttime) {
        Starttime = starttime;
    }

    public String getFinishtime() {
        return Finishtime;
    }

    public void setFinishtime(String finishtime) {
        Finishtime = finishtime;
    }

    public String getTotaltime() {
        return Totaltime;
    }

    public void setTotaltime(String totaltime) {
        Totaltime = totaltime;
    }

    public String getStoppagetime() {
        return Stoppagetime;
    }

    public void setStoppagetime(String Stoppagetime) {
        Stoppagetime = Stoppagetime;
    }

    public String getFunctionallocation() {
        return Functionallocation;
    }

    public void setFunctionallocation(String functionallocation) {
        Functionallocation = functionallocation;
    }

    public String getSubfunctionallocation() {
        return Subfunctionallocation;
    }

    public void setSubfunctionallocation(String subfunctionallocation) {
        Subfunctionallocation = subfunctionallocation;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getDetailmachine() {
        return Detailmachine;
    }

    public void setDetailmachine(String detailmachine) {
        Detailmachine = detailmachine;
    }

    public String getProblem() {
        return Problem;
    }

    public void setProblem(String problem) {
        Problem = problem;
    }

    public String getCause() {
        return Cause;
    }

    public void setCause(String cause) {
        Cause = cause;
    }

    public String getBias() {
        return Bias;
    }

    public void setBias(String bias) {
        Bias = bias;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getExecutor1() {
        return Executor1;
    }

    public void setExecutor1(String executor1) {
        Executor1 = executor1;
    }

    public String getExecutor2() {
        return Executor2;
    }

    public void setExecutor2(String executor2) {
        Executor2 = executor2;
    }

    public String getExecutorextra() {
        return Executorextra;
    }

    public void setExecutorextra(String executorextra) {
        Executorextra = executorextra;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public ReportTxn(Long reporttransactionid, Long shift, String datecreated, String createdby, String updatedby,
            String Updatedate, String jobtype, String timeinformed, String starttime, String finishtime,
            String totaltime, String Stoppagetime, String functionallocation, String subfunctionallocation,
            String machine, String detailmachine, String problem, String cause, String bias, String action,
            String executor1, String executor2, String executorextra, String condition, String reason, String note) {
        Reporttransactionid = reporttransactionid;
        Shift = shift;
        Datecreated = datecreated;
        Createdby = createdby;
        Updatedby = updatedby;
        Updatedate = Updatedate;
        Jobtype = jobtype;
        Timeinformed = timeinformed;
        Starttime = starttime;
        Finishtime = finishtime;
        Totaltime = totaltime;
        Stoppagetime = Stoppagetime;
        Functionallocation = functionallocation;
        Subfunctionallocation = subfunctionallocation;
        this.machine = machine;
        Detailmachine = detailmachine;
        Problem = problem;
        Cause = cause;
        Bias = bias;
        Action = action;
        Executor1 = executor1;
        Executor2 = executor2;
        Executorextra = executorextra;
        Condition = condition;
        Reason = reason;
        Note = note;
    }
}
