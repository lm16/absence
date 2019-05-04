package edu.uni.am.mapper;

import edu.uni.am.domain.AmTeacherAbsenceConfirm;
import edu.uni.am.domain.AmTeacherAbsenceConfirmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmTeacherAbsenceConfirmMapper {
    int countByExample(AmTeacherAbsenceConfirmExample example);

    int deleteByExample(AmTeacherAbsenceConfirmExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmTeacherAbsenceConfirm record);

    int insertSelective(AmTeacherAbsenceConfirm record);

    List<AmTeacherAbsenceConfirm> selectByExample(AmTeacherAbsenceConfirmExample example);

    AmTeacherAbsenceConfirm selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmTeacherAbsenceConfirm record, @Param("example") AmTeacherAbsenceConfirmExample example);

    int updateByExample(@Param("record") AmTeacherAbsenceConfirm record, @Param("example") AmTeacherAbsenceConfirmExample example);

    int updateByPrimaryKeySelective(AmTeacherAbsenceConfirm record);

    int updateByPrimaryKey(AmTeacherAbsenceConfirm record);
}