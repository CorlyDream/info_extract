package cc.corly.dao;

import cc.corly.entity.Rdc;

public interface RdcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rdc record);

    int insertSelective(Rdc record);

    Rdc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rdc record);

    int updateByPrimaryKeyWithBLOBs(Rdc record);

    int updateByPrimaryKey(Rdc record);
}