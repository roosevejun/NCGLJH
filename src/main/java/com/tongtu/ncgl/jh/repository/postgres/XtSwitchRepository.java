package com.tongtu.ncgl.jh.repository.postgres;


import com.tongtu.ncgl.jh.beans.orm.XtSwitch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 13-3-4下午2:53
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
public interface XtSwitchRepository extends JpaRepository<XtSwitch, String>, JpaSpecificationExecutor<XtSwitch> {
	  @Query(value="select x  from  XtSwitch  x  where x.code =:code and x.status='true'")
	  public  XtSwitch getXtSwitchByCode(@Param("code") String code);
	 @Query(value="select x  from XtSwitch  x  where x.parent =:parent and x.code =:code ")
     public  XtSwitch findXtSwitchByCode(@Param("parent") String parent, @Param("code") String code);
}
