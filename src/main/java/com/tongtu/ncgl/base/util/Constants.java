/**
 * 文 件 名 : Constants.java
 * CopyRright (c) 2010-2020:
 * 文件编号：
 * 创 建 人： 代后建
 * 日    期：Sep 25, 2010
 * 修 改 人：
 * 日   期：
 * 描   述：
 * 版 本 号：v1.0
 */
package com.tongtu.ncgl.base.util;
/**
 * 系统静态常量定义
 *

 */
public class Constants {
    //public final static String SESSION_USERID = "SESSION_USERID";
    public final static String SESSION_USER = "user";   //保存当前登录人员的Employee对象
    public final static String SESSION_USER_PRIVILEGE = "SESSION_USER_PRIVILEGE";   //保存当前登录人员的权限串
    public final static String SESSION_USER_TYPE = "SESSION_USER_TYPE";//用户类别
    public final static String LOGINED_USER = "LOGINED_USER";   //保存当前登录人员的Session信息
    public final static String MOBILE_USER = "MOBILE_USER";   //保存手机登录人员的Session信息
    public static final String RANDOMCODEKEY = "RANDOMVALIDATECODEKEY";//放到session中的验证码key
    public final static String SESSION_RESOURSE = "SESSION_USER_RESOURSE"; //保存新用户的资源权限
    /**
     * 页面显示行数
     */
    public final static int PAGE_SIZE = 8;
    /**
     * 状态整数值
     */
    public final static int COMMON_STATUS_ACTIVE = 1; //可用
    public final static int COMMON_STATUS_UNACTIVE = 0; //不可用
    /**
     * admin 操作类型
     */
    public static final int ADMIN_ACTION_ADD = 1; //增加
    public static final int ADMIN_ACTION_UPDATE = 2; //修改
    public static final int ADMIN_ACTION_DELETE = 3; //删除
    public static final int ADMIN_ACTION_FREEZE = 4;
    public static final int ADMIN_ACTION_UNFREEZE = 5;

    /**
     * 默认权限
     */
    public final static String ROLE_DEFAULT_PRIVILEGE = "111111111111111111111111111111111111111111";

    /**
     * 访问类型1-注册，2-登录
     */
    public static final int ACCESS_TYPE_REGISTER = 1;
    public static final int ACCESS_TYPE_LOGIN = 2;
    /**
     * COOKIE最大保存时间
     */
    public static final int COOKIE_MAX_AGE = 2678400;
    /**
     * 用户在session里的变量
     */
    public final static String SESSION_EMPLOYEE = "SESSION_EMPLOYEE";
    public final static String SESSION_USER_NAME = "SESSION_USER_NAME";
    public final static String SESSION_USER_USERID = "SESSION_USER_USERID";
    public final static String SESSION_USER_USERNAME = "SESSION_USER_USERNAME";
    public final static String SESSION_USER_ROLEID = "SESSION_USER_ROLEID";

    /**
     * 员工工作状态
     */
    public final static int WORKING_STATE_SOMEFREE = 1; //1个以下任务
    public final static int WORKING_STATE_SOMEBUSY = 2; //2-3个任务
    public final static int WORKING_STATE_BUSY = 3;    // 3个以上任务

    /**
     * 项目的状态
     */
    public final static int PROJECT_STATE_DOING = 1; //正在进行中
    public final static int PROJECT_STATE_DOEN = 2; //已完成

    /**
     * 项目阶段的结算状态
     */
    public final static int STAGE_SETTLE_ALL = 0; //不区分结算状体
    public final static int STAGE_SETTLE_NO = 1; //未结算
    public final static int STAGE_SETTLE_YES = 2; //已结算

    /**
     * 项目附件保存地址
     */
    public final static String GONGLU_FILE_PATH = "/projectfile/gonglu"; //县乡公路
    public final static String WEIQIAO_FILE_PATH = "/projectfile/weiqiao"; //危桥
    public final static String ANBAO_FILE_PATH = "/projectfile/anbao"; //安保
    public final static String DUKGZ_FILE_PATH = ""; //渡口改造
    public final static String DUKGQ_FILE_PATH = ""; //渡改桥
    public final static String KEYZ_FILE_PATH = ""; //农村客运站
    public final static String ZHAOHT_FILE_PATH = ""; //招呼亭
    public final static String HOUCZ_FILE_PATH = ""; //候车站
    /**
     * 报表名称
     */
    public final static String REPORT_GONGLU = "县乡公路改造年度计划报表";
    public final static String REPORT_WEIQIAO = "危桥改造年度计划报表";
    public static final String REPORT_ROADSHOULD = "路肩硬化年度计划报表";
    public final static String REPORT_USER = "员工列表";
    public final static String REPORT_PROJECT_BACK = "项目回款";
    public final static String REPORT_PROJECT_COST = "项目支出";
    public final static String REPORT_PROJECT_HUMANCOST = "项目人力成本";

    /**
     * 计划类型
     */
    public final static int PLAN_TYPE_ROAD = 1;
    public final static int PLAN_TYPE_BRIDGE = 2;
    public final static int PLAN_TYPE_ANBAO = 3;
    public static final String iconCls = "icon-ok";
    public static final String stateClosed = "closed";
    public static final String stateOpen = "open";
    public static final String departmentName = "领导";
    
    /**
     * 资源类型
     */
    public final static int RESOURSE_FIRDIRECTORY_TYPE = 1; //一级目录资源
    public final static int RESOURSE_SECDIRECTORY_TYPE = 2; //二级目录资源
    public final static int RESOURSE_SERVICE_TYPE = 3;  //服务资源
}
