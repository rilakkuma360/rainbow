package com.consumer.movie;

import org.springframework.stereotype.Component;

@Component
public class FeignClientFallback implements UserFeignClient {

	@Override
	public User findById(Long id) {
		User user = new User();
		user.setId(-1L);
		user.setUsername("默认用户");
		user.setName("默认用户");
		user.setName("默认用户");
		return user;
	}

}
