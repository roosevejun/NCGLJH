package com.tongtu.ncgl.jh.repository.postgres;

import com.tongtu.ncgl.jh.beans.orm.ItemDkjsgm;
import com.tongtu.ncgl.jh.beans.orm.ItemLxjsgm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 17-1-6下午12:30
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
public interface ItemLxjsgmRepository extends JpaRepository<ItemLxjsgm,String>, JpaSpecificationExecutor<ItemLxjsgm> {
    /***
     * 根据CROEID查找到了对应的记录
     */
    @Query("select n  from ItemLxjsgm n  where n.crowid =:crowid ")
    public ItemLxjsgm findItemByCrowid(@Param("crowid") String crowid);
    /**
     * 根据xmid查找到相对应的路线建设规模
     */
    @Query("select l  from ItemLxjsgm l  where   l.xmid =:xmid order by l.lxbm")
   public  List<ItemLxjsgm>   findByXmid(@Param("xmid") String xmid);

}
