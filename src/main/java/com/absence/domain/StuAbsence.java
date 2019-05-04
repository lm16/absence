package com.absence.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class StuAbsence {

    @TableId
    private Integer id;
    private Integer universityId;
    private Long studentId;
    private Integer curriculumId;
    private byte status;

}
