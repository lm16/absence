package com.absence.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class TeacherAbsenceConfirm {

    @TableId
    private Integer id;
    private Integer universityId;
    private Integer employeeAbsenceId;
    private Long studentId;
    private byte status;

}
