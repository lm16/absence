package edu.uni.am.domain;

import java.util.Date;

public class AmAdjustmentApproval {
    private Long id;

    private Long classAdjustmentId;

    private Long employeeId;

    private String result;

    private String content;

    private Long preApprovalId;

    private Date datetime;

    private Long byWho;

    private Integer deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClassAdjustmentId() {
        return classAdjustmentId;
    }

    public void setClassAdjustmentId(Long classAdjustmentId) {
        this.classAdjustmentId = classAdjustmentId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getPreApprovalId() {
        return preApprovalId;
    }

    public void setPreApprovalId(Long preApprovalId) {
        this.preApprovalId = preApprovalId;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Long getByWho() {
        return byWho;
    }

    public void setByWho(Long byWho) {
        this.byWho = byWho;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}