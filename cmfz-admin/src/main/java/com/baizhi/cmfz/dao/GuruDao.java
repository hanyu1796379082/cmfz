package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Guru;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuruDao {

    public List<Guru> selectAllGuru(@Param("page") Integer page,@Param("rows") Integer rows);

    public int selectGuruCount();

    public int insertGuru(Guru guru);

    public int updateGuru(Guru guru);
}
