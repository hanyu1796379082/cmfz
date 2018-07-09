package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Guru;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuruDao {

    public List<Guru> selectAllGuru(@Param("page") Integer page,@Param("rows") Integer rows);

    public List<Guru> selectGuruByFname(@Param("name") String name ,@Param("page") Integer page,@Param("rows") Integer rows);

    public int selectGuruByFnameCount(@Param("name") String fname);

    public int selectGuruCount();

    public int insertGuru(Guru guru);

    public int updateGuru(Guru guru);

    public int insertGurus(@Param("gurus")List<Guru> gurus);
}
