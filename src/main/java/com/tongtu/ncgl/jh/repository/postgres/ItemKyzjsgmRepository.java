package com.tongtu.ncgl.jh.repository.postgres;

import com.tongtu.ncgl.jh.beans.orm.ItemKyzjsgm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 17-1-6下午1:53
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
public interface ItemKyzjsgmRepository extends JpaRepository<ItemKyzjsgm, String>, JpaSpecificationExecutor<ItemKyzjsgm> {
    @Query("select n  from ItemKyzjsgm n  where n.xmid =:xmid order by n.kyzbm")
    public List<ItemKyzjsgm> findByXmid(@Param("xmid") String xmid);

    @Query("select n  from ItemKyzjsgm n  where n.crowid =:crowid ")
    public ItemKyzjsgm findItemByCrowid(@Param("crowid") String crowid);
}
