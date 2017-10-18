package com.ayman.messagingapp;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

public class Main {
    @Value("${spring.datasource.url}")
  private String dbUrl;
    
    @Autowired
  private DataSource dataSource;

    
    public static void main(String[] args) throws Exception {
    SpringApplication.run(Main.class, args);
  }
    
    @RequestMapping("/")
  String index() {
    return "index";
  }
    
}
