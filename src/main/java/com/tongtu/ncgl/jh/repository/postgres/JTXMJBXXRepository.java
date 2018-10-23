package com.tongtu.ncgl.jh.repository.postgres;

import com.tongtu.ncgl.jh.beans.orm.ItemXmjbxx;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JTXMJBXXRepository extends JpaRepository<ItemXmjbxx, String> {

    @Query(value = "select x from ItemXmjbxx  x  where x.xmbm=:xmbm")
    public ItemXmjbxx findXmbjxxByXmbm(@Param("xmbm") String xmbm);

    @Query(value = "select x from ItemXmjbxx  x  where x.xzqh=:xzqh order by x.xmlxdm,x.xmid ")
    public Page<ItemXmjbxx> findXmjbxxByXzqh(@Param("xzqh") String xzqh, Pageable pageable);

    @Query(value = "select x from ItemXmjbxx  x  where x.xmid=:xmid")
    public ItemXmjbxx findXmbjxxByXmid(@Param("xmid") String xmid);

}
