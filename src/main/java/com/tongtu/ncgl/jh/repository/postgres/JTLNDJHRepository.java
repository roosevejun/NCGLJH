package com.tongtu.ncgl.jh.repository.postgres;

import com.tongtu.ncgl.jh.beans.orm.ItemNdjh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JTLNDJHRepository extends JpaRepository<ItemNdjh, String> {

    @Query("select n  from ItemNdjh n  where n.crowid =:crowid ")
    public ItemNdjh findItemNdjhByCrowid(@Param("crowid") String crowid);

    @Query("select n  from ItemNdjh n  where n.xmid =:xmid ")
    public List<ItemNdjh> findItemNdjhByXmid(@Param("xmid") String xmid);

}
