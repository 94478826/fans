package com.fans.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fans.domain.weixin.WeixinAccessTokenEntity;

public interface WeixinAccessTokenRepository extends CrudRepository<WeixinAccessTokenEntity, Long> {
	
	@Query("select g from WeixinAccessTokenEntity g where appid=?1 and TIMESTAMPDIFF(SECOND,now(),addTime)<(expires_in-600)" )
	WeixinAccessTokenEntity findByAppid(String appid);

}
