package com.cybersoft.demospringboot.config;

import com.cybersoft.demospringboot.model.AccountModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PoJoConfig {

    @Bean
    public AccountModel accountModel(){
        AccountModel accountModel = new AccountModel();
        return accountModel;
    }

}
