package com.tongtu.ncgl.jh.repository.sqlserver;

import com.tongtu.ncgl.jh.beans.sys.Appuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AppuserRepository extends JpaRepository<Appuser, Long> {
    @Query("select case when appuser is not null then true else false end from Appuser appuser where appuser.appuserLoginName=:appuserLoginName and appuser.appuserPwd=:appuserPwd")
    public Boolean checkAppuserLogin(@Param("appuserLoginName") String appuserLoginName, @Param("appuserPwd") String appuserPwd);

    @Query("select  appuser  from Appuser appuser where appuser.appuserLoginName=:appuserLoginName")
    public Appuser loadAppuserByLoginName(@Param("appuserLoginName") String appuserLoginName);
}
