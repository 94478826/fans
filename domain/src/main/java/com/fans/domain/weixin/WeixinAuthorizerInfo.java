package com.fans.domain.weixin;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the weixin_authorizer_info database table.
 * 
 */
@Entity
@Table(name="weixin_authorizer_info")
@NamedQuery(name="WeixinAuthorizerInfo.findAll", query="SELECT w FROM WeixinAuthorizerInfo w")
public class WeixinAuthorizerInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String alias;

	private String appid;

	@Column(name="business_info")
	private String business_info;

	@Column(name="head_img")
	private String head_img;

	private String miniprograminfo;

	@Column(name="nick_name")
	private String nick_name;

	@Column(name="principal_name")
	private String principal_name;

	@Column(name="qrcode_url")
	private String qrcode_url;

	@Column(name="service_type_info")
	private String service_type_info;

	private String signature;

	@Column(name="user_name")
	private String user_name;

	@Column(name="verify_type_info")
	private String verify_type_info;

	public WeixinAuthorizerInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getBusiness_info() {
		return business_info;
	}

	public void setBusiness_info(String business_info) {
		this.business_info = business_info;
	}

	public String getHead_img() {
		return head_img;
	}

	public void setHead_img(String head_img) {
		this.head_img = head_img;
	}

	public String getMiniprograminfo() {
		return miniprograminfo;
	}

	public void setMiniprograminfo(String miniprograminfo) {
		this.miniprograminfo = miniprograminfo;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getPrincipal_name() {
		return principal_name;
	}

	public void setPrincipal_name(String principal_name) {
		this.principal_name = principal_name;
	}

	public String getQrcode_url() {
		return qrcode_url;
	}

	public void setQrcode_url(String qrcode_url) {
		this.qrcode_url = qrcode_url;
	}

	public String getService_type_info() {
		return service_type_info;
	}

	public void setService_type_info(String service_type_info) {
		this.service_type_info = service_type_info;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getVerify_type_info() {
		return verify_type_info;
	}

	public void setVerify_type_info(String verify_type_info) {
		this.verify_type_info = verify_type_info;
	}

}