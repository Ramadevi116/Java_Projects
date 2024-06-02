package com.barclays.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

//@Configuration
//@EnableAuthorizationServer
//public class AuthorizationServer extends AuthorizationServerConfigurerAdapter {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints.authenticationManager(authenticationManager);
//    }
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients.inMemory()
//                .withClient("sai-client")
//                .secret(passwordEncoder.encode("sai-secret")) // Using PasswordEncoder to encode the client secret
//                .authorizedGrantTypes("authorization_code", "refresh_token", "password")
//                .scopes("read", "write") // Define proper scopes based on your application requirements
//                .accessTokenValiditySeconds(3600) // Set access token validity period
//                .refreshTokenValiditySeconds(1800); // Set refresh token validity period
//    }
//}
//
