package com.cybersoft.demospringboot.config;

import com.cybersoft.demospringboot.model.UserModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Class dùng để config bean, khi khởi chạy prj thì khởi tạo bean đưa lên container ngay đầu tiên
public class BeanConfig {

    @Bean
    public UserModel userModel(){
        UserModel userModel = new UserModel();
        userModel.setName("Nguyen Van A");
        userModel.setAge("18");

        return userModel;
    }

}
