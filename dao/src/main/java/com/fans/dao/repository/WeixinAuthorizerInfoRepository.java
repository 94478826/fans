package com.fans.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.fans.domain.weixin.WeixinAuthorizationInfo;
import com.fans.domain.weixin.WeixinAuthorizerInfo;

public interface WeixinAuthorizerInfoRepository extends CrudRepository<WeixinAuthorizerInfo, Long> {

	WeixinAuthorizerInfo findByAppid(String appid);

}
