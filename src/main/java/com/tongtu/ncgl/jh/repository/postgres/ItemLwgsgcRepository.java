package com.tongtu.ncgl.jh.repository.postgres;

import com.tongtu.ncgl.jh.beans.orm.ItemLwgsgc;
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
public interface ItemLwgsgcRepository extends JpaRepository<ItemLwgsgc, String>, JpaSpecificationExecutor<ItemLwgsgc> {
    @Query(value = "select x from ItemLwgsgc  x  where x.xmpici in (:xmpici) order by x.xmlxdm,x.xxblxdm")
    public List<ItemLwgsgc> findByXmpici(@Param("xmpici") List<Integer> xmpici);

}
