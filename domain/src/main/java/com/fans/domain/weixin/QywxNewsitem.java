package com.fans.domain.weixin;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述：</b>QywxNewsitem:图文素材新闻; InnoDB free: 130048 kB<br>
 * 实体定义规则
 * 字段不允许存在基本类型，必须都是包装类型(因为基本类型有默认值)
 * 基本数据类型  包装类 byte Byte boolean Boolean short Short char Character int Integer long Long float Float double  Double 
 * @author zhoujf
 * @since：2016年03月24日 18时59分46秒 星期四 
 * @version:1.0
 */
public class QywxNewsitem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "QywxNewsitem [id=" + id + ", title=" + title + ", author="
				+ author + ", imagePath=" + imagePath + ", content=" + content
				+ ", templateid=" + templateid + ", description=" + description
				+ ", orderNo=" + orderNo + ", url=" + url + ", hdid=" + hdid
				+ ", createName=" + createName + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", updateName=" + updateName
				+ ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
	}
	
}
