package com.wcfvol.rpc.rpcserver.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("server.xml");
    }
}