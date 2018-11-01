package com.tongtu.ncgl.jh.repository.postgres;

import com.tongtu.ncgl.jh.beans.orm.ItemLxjsgm;
import com.tongtu.ncgl.jh.beans.orm.ItemQljsgm;
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
public interface ItemQljsgmRepository extends JpaRepository<ItemQljsgm, String>, JpaSpecificationExecutor<ItemQljsgm> {

    @Query("select n  from ItemQljsgm n  where n.xmid =:xmid order by n.qlbm")
    public List<ItemQljsgm> findByXmid(@Param("xmid") String xmid);

    /***
     * 根据CROEID查找到了对应的记录
     */
    @Query("select n  from ItemQljsgm n  where n.crowid =:crowid ")
    public ItemQljsgm findItemByCrowid(@Param("crowid") String crowid);
}
