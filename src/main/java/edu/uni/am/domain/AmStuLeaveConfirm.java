package edu.uni.am.domain;

import java.util.Date;

public class AmStuLeaveConfirm {
    private Long id;

    private Long universityId;

    private Long stuAbsenceId;

    private Long studentId;

    private String status;

    private Date datetime;

    private Long byWho;

    private Integer deleted;

    private Long leaveBarId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }

    public Long getStuAbsenceId() {
        return stuAbsenceId;
    }

    public void setStuAbsenceId(Long stuAbsenceId) {
        this.stuAbsenceId = stuAbsenceId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public Long getLeaveBarId() {
        return leaveBarId;
    }

    public void setLeaveBarId(Long leaveBarId) {
        this.leaveBarId = leaveBarId;
    }
}