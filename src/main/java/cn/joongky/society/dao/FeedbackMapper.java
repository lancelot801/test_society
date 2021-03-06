package cn.joongky.society.dao;

import cn.joongky.society.pojo.Feedback;
import cn.joongky.society.pojo.FeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FeedbackMapper {
    int countByExample(FeedbackExample example);

    int deleteByExample(FeedbackExample example);

    int deleteByPrimaryKey(String feedbackId);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    List<Feedback> selectByExampleWithRowbounds(FeedbackExample example, RowBounds rowBounds);

    List<Feedback> selectByExample(FeedbackExample example);

    Feedback selectByPrimaryKey(String feedbackId);

    int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}