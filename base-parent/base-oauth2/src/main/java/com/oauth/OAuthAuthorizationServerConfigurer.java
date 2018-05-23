package com.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

@Configuration
public class OAuthAuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		// TODO Auto-generated method stub
		clients.inMemory()
			.withClient("api")
			.secret("secret")
			.authorizedGrantTypes("authorization_code") 
			.scopes("app");
	}
	
	//localhost:8800/oauth/authorize?client_id=api&response_type=code&redirect_uri=http://www.baidu.com
	//http://localhost:8800/oauth/token?client_id=api&grant_type=authorization_code&redirect_uri=http://baidu.com&code=4RZvXD
	//user :	secret

}
