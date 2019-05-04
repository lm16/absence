package edu.uni.am.mapper;

import edu.uni.am.domain.AmClassAdjustment;
import edu.uni.am.domain.AmClassAdjustmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmClassAdjustmentMapper {
    int countByExample(AmClassAdjustmentExample example);

    int deleteByExample(AmClassAdjustmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmClassAdjustment record);

    int insertSelective(AmClassAdjustment record);

    List<AmClassAdjustment> selectByExample(AmClassAdjustmentExample example);

    AmClassAdjustment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmClassAdjustment record, @Param("example") AmClassAdjustmentExample example);

    int updateByExample(@Param("record") AmClassAdjustment record, @Param("example") AmClassAdjustmentExample example);

    int updateByPrimaryKeySelective(AmClassAdjustment record);

    int updateByPrimaryKey(AmClassAdjustment record);
}