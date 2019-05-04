package com.absence.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public class StuAbsencePage<StuAbsence> extends Page<StuAbsence> {


    private Integer selecInt;
    private String selectStr;

    public StuAbsencePage(long current, long size){
        super(current, size);
    }
}
