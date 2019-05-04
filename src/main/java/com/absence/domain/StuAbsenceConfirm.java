package com.absence.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class StuAbsenceConfirm {

    @TableId
    private Integer id;
    private Integer universityId;
    private Integer stuAbsenceId;
    private Long studentId;
    private byte status;

}
