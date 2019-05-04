package edu.uni.am.mapper;

import edu.uni.am.domain.AmStuLeaveConfirm;
import edu.uni.am.domain.AmStuLeaveConfirmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmStuLeaveConfirmMapper {
    int countByExample(AmStuLeaveConfirmExample example);

    int deleteByExample(AmStuLeaveConfirmExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmStuLeaveConfirm record);

    int insertSelective(AmStuLeaveConfirm record);

    List<AmStuLeaveConfirm> selectByExample(AmStuLeaveConfirmExample example);

    AmStuLeaveConfirm selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmStuLeaveConfirm record, @Param("example") AmStuLeaveConfirmExample example);

    int updateByExample(@Param("record") AmStuLeaveConfirm record, @Param("example") AmStuLeaveConfirmExample example);

    int updateByPrimaryKeySelective(AmStuLeaveConfirm record);

    int updateByPrimaryKey(AmStuLeaveConfirm record);
}