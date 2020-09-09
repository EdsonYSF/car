package com.za.carsso.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@Configuration
@EnableAuthorizationServer
public class OauthServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void configure(final  AuthorizationServerSecurityConfigurer security){
        security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
    }

    @Override
    public void configure(final  ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("handleCilentId")//用户名
                .secret(passwordEncoder.encode("secret"))//密码
                .authorizedGrantTypes("authorization_code")//授权码模式
                .scopes("user_info") //授权范围
                .autoApprove(true)//开启自动授权
                .redirectUris("http://localhost:9091/login", "http://localhost:9094/login")
                .accessTokenValiditySeconds(10);//设置超时时间
    }


}
