package com.tongtu.ncgl.jh.beans.sys;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;


import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;


/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 13-3-28上午10:26
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Table(name = "Users", schema = "dbo")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Entity
public class Appuser implements Serializable {

    @Column(name = "UserID", nullable = false, insertable = true, updatable = true, length = 38, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appuserId;
    @Column(name = "Name", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    @Basic
    private String appuserName;
    @Column(name = "LoginName", nullable = false, insertable = false, updatable = false, length = 100, precision = 0)
    @Basic
    private String appuserLoginName;
    @Column(name = "Password", nullable = false, insertable = false, updatable = false, length = 50, precision = 0)
    @Basic
    private String appuserPwd;
    @Column(name = "DepartID", nullable = false, insertable = true, updatable = true, length = 38, precision = 0)
    @Basic
    private Long departId;
}