package edu.uni.am.mapper;

import edu.uni.am.domain.AmLeaveApproval;
import edu.uni.am.domain.AmLeaveApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmLeaveApprovalMapper {
    int countByExample(AmLeaveApprovalExample example);

    int deleteByExample(AmLeaveApprovalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmLeaveApproval record);

    int insertSelective(AmLeaveApproval record);

    List<AmLeaveApproval> selectByExample(AmLeaveApprovalExample example);

    AmLeaveApproval selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmLeaveApproval record, @Param("example") AmLeaveApprovalExample example);

    int updateByExample(@Param("record") AmLeaveApproval record, @Param("example") AmLeaveApprovalExample example);

    int updateByPrimaryKeySelective(AmLeaveApproval record);

    int updateByPrimaryKey(AmLeaveApproval record);
}