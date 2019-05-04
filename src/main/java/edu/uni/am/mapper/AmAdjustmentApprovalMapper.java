package edu.uni.am.mapper;

import edu.uni.am.domain.AmAdjustmentApproval;
import edu.uni.am.domain.AmAdjustmentApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmAdjustmentApprovalMapper {
    int countByExample(AmAdjustmentApprovalExample example);

    int deleteByExample(AmAdjustmentApprovalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmAdjustmentApproval record);

    int insertSelective(AmAdjustmentApproval record);

    List<AmAdjustmentApproval> selectByExample(AmAdjustmentApprovalExample example);

    AmAdjustmentApproval selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmAdjustmentApproval record, @Param("example") AmAdjustmentApprovalExample example);

    int updateByExample(@Param("record") AmAdjustmentApproval record, @Param("example") AmAdjustmentApprovalExample example);

    int updateByPrimaryKeySelective(AmAdjustmentApproval record);

    int updateByPrimaryKey(AmAdjustmentApproval record);
}