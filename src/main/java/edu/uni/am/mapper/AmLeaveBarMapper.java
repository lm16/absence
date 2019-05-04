package edu.uni.am.mapper;

import edu.uni.am.domain.AmLeaveBar;
import edu.uni.am.domain.AmLeaveBarExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AmLeaveBarMapper {

    @Select("select * from am_leave_bar where id=#{id}")
    AmLeaveBar getById(Long id);
    /*

     */
    int countByExample(AmLeaveBarExample example);

    int deleteByExample(AmLeaveBarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmLeaveBar record);

    int insertSelective(AmLeaveBar record);

    List<AmLeaveBar> selectByExample(AmLeaveBarExample example);

    AmLeaveBar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmLeaveBar record, @Param("example") AmLeaveBarExample example);

    int updateByExample(@Param("record") AmLeaveBar record, @Param("example") AmLeaveBarExample example);

    int updateByPrimaryKeySelective(AmLeaveBar record);

    int updateByPrimaryKey(AmLeaveBar record);
}