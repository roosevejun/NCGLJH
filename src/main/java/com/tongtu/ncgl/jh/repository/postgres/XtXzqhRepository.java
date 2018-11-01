package com.tongtu.ncgl.jh.repository.postgres;

import com.tongtu.ncgl.jh.beans.orm.XtXzqh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 13-2-28上午11:30
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
public interface XtXzqhRepository extends JpaRepository<XtXzqh, Integer>, JpaSpecificationExecutor<XtXzqh> {
    @Query(value = "select x from XtXzqh  x  where x.xzqhjb=:xzqhjb order by x.sortnum,x.xzqh ")
    public List<XtXzqh> findByXzqhjb(@Param("xzqhjb") Integer xzqhjb);
    public List<XtXzqh> findByXzqhjbAndXzqhLike(Integer xzqhjb, String xzqh);
    public XtXzqh findByXzqh(String xzqh);
    public XtXzqh findByXzqhLike(String xzqh);
    @Query(value = "select x from XtXzqh  x  where x.sjxzqh=:sjxzqh order by x.sortnum,x.xzqhjb,x.xzqh ")
    public List<XtXzqh> findBySjxzqhOrderByXzqhjbAscXzqhAsc(@Param("sjxzqh") Integer sjxzqh);
}
