package com.xzoliver.used_market.dao;

import com.xzoliver.used_market.entity.Managers;
import com.xzoliver.used_market.entity.ManagersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagersDao {
    long countByExample(ManagersExample example);

    int deleteByExample(ManagersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Managers record);

    int insertSelective(Managers record);

    List<Managers> selectByExample(ManagersExample example);

    Managers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Managers record, @Param("example") ManagersExample example);

    int updateByExample(@Param("record") Managers record, @Param("example") ManagersExample example);

    int updateByPrimaryKeySelective(Managers record);

    int updateByPrimaryKey(Managers record);
}