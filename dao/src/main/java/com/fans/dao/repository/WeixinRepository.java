package com.fans.dao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fans.domain.weixin.WeixinOpenAccountEntity;

public interface WeixinRepository extends CrudRepository<WeixinOpenAccountEntity, Long> {

	List<WeixinOpenAccountEntity> findByAppid(String appid);

}
