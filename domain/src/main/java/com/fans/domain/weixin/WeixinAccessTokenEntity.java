package com.fans.domain.weixin;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weixin_accesstoken")
public class WeixinAccessTokenEntity implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;
	
	private String appid;
	
	private String access_token;//凭证
	private int expires_in;//凭证有效时间
	private Timestamp addTime;//添加时间
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="ID",nullable=false)
	public java.lang.Long getId(){
		return this.id;
	}

	public void setId(java.lang.Long id){
		this.id = id;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  appid
	 */
	@Column(name ="appid",nullable=true,length=200)
	public java.lang.String getAppid(){
		return this.appid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  appid
	 */
	public void setAppid(java.lang.String appid){
		this.appid = appid;
	}
	
	@Column(name="access_token")
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String accessToken) {
		access_token = accessToken;
	}
	@Column(name="expires_in")
	public int getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(int expiresIn) {
		expires_in = expiresIn;
	}
	@Column(name="addtime")
	public Timestamp getAddTime() {
		return addTime;
	}
	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}
	
}
