package com.fans.domain.weixin;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the weixin_authorization_info database table.
 * 
 */
/**
 * @author xuyr
 *
 */
@Entity
@Table(name="weixin_authorization_info")
@NamedQuery(name="WeixinAuthorizationInfo.findAll", query="SELECT w FROM WeixinAuthorizationInfo w")
public class WeixinAuthorizationInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="authorizer_access_token")
	private String authorizer_access_token;

	@Column(name="authorizer_appid")
	private String authorizerAppid;

	@Column(name="authorizer_refresh_token")
	private String authorizer_refresh_token;

	@Column(name="expires_in")
	private int expires_in;

	@Column(name="func_info")
	private String func_info;
	
	@Column(name="authorization_code")
	private String authorization_code;

	public WeixinAuthorizationInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getAuthorizer_access_token() {
		return authorizer_access_token;
	}

	public void setAuthorizer_access_token(String authorizer_access_token) {
		this.authorizer_access_token = authorizer_access_token;
	}

	public String getAuthorizerAppid() {
		return authorizerAppid;
	}

	public void setAuthorizerAppid(String authorizerAppid) {
		this.authorizerAppid = authorizerAppid;
	}

	public String getAuthorizer_refresh_token() {
		return authorizer_refresh_token;
	}

	public void setAuthorizer_refresh_token(String authorizer_refresh_token) {
		this.authorizer_refresh_token = authorizer_refresh_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	public String getFunc_info() {
		return func_info;
	}

	public void setFunc_info(String func_info) {
		this.func_info = func_info;
	}

	public String getAuthorization_code() {
		return authorization_code;
	}

	public void setAuthorization_code(String authorization_code) {
		this.authorization_code = authorization_code;
	}



}