package edu.uni.am.mapper;

import edu.uni.am.domain.AmPersonalDate;
import edu.uni.am.domain.AmPersonalDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmPersonalDateMapper {
    int countByExample(AmPersonalDateExample example);

    int deleteByExample(AmPersonalDateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmPersonalDate record);

    int insertSelective(AmPersonalDate record);

    List<AmPersonalDate> selectByExample(AmPersonalDateExample example);

    AmPersonalDate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmPersonalDate record, @Param("example") AmPersonalDateExample example);

    int updateByExample(@Param("record") AmPersonalDate record, @Param("example") AmPersonalDateExample example);

    int updateByPrimaryKeySelective(AmPersonalDate record);

    int updateByPrimaryKey(AmPersonalDate record);
}