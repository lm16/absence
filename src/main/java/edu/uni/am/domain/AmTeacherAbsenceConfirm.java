package edu.uni.am.domain;

import java.util.Date;

public class AmTeacherAbsenceConfirm {
    private Long id;

    private Long universityId;

    private Long employeeAbsenceId;

    private Long studentId;

    private Byte status;

    private Date datetime;

    private Long byWho;

    private Integer deleted;

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

    public Long getEmployeeAbsenceId() {
        return employeeAbsenceId;
    }

    public void setEmployeeAbsenceId(Long employeeAbsenceId) {
        this.employeeAbsenceId = employeeAbsenceId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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