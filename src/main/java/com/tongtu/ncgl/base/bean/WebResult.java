package com.tongtu.ncgl.base.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 13-3-15上午11:17
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
@XmlRootElement(name = "result")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebResult {

    private String code;
    private String message;
    private Object data;

    public void setResultInfo(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public void setResultInfo(String message) {
        //To change body of created methods use File | Settings | File Templates.
        this.message = message;
        this.data = null;
    }
}
