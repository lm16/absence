package edu.uni.am.mapper;

import edu.uni.am.domain.AmLeaveBarPicture;
import edu.uni.am.domain.AmLeaveBarPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmLeaveBarPictureMapper {
    int countByExample(AmLeaveBarPictureExample example);

    int deleteByExample(AmLeaveBarPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmLeaveBarPicture record);

    int insertSelective(AmLeaveBarPicture record);

    List<AmLeaveBarPicture> selectByExample(AmLeaveBarPictureExample example);

    AmLeaveBarPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmLeaveBarPicture record, @Param("example") AmLeaveBarPictureExample example);

    int updateByExample(@Param("record") AmLeaveBarPicture record, @Param("example") AmLeaveBarPictureExample example);

    int updateByPrimaryKeySelective(AmLeaveBarPicture record);

    int updateByPrimaryKey(AmLeaveBarPicture record);
}