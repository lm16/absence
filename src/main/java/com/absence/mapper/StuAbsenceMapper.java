package com.absence.mapper;

import com.absence.domain.StuAbsence;
import com.absence.page.StuAbsencePage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StuAbsenceMapper extends BaseMapper<StuAbsence> {

//    IPage<StuAbsence> ipageStuAbsence(@Param("pg")StuAbsencePage<StuAbsence> page);

//    List<StuAbsence> listStuAbsence
}
