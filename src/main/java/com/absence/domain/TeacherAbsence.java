package com.absence.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class TeacherAbsence {

    @TableId
    private Integer id;
    private Integer universityId;
    private Long employeeId;
    private Integer curriculumId;
    private byte status;
}
