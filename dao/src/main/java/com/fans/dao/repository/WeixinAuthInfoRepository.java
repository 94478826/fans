package com.fans.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.fans.domain.weixin.WeixinAuthorizationInfo;

public interface WeixinAuthInfoRepository extends CrudRepository<WeixinAuthorizationInfo, Long> {

	WeixinAuthorizationInfo findByAuthorizerAppid(String authorizer_appid);

}
