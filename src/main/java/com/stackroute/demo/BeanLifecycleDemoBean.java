package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("some destruction work");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("some initialization work");
    }

//    Custom methods
    public void customInit(){
        System.out.println("calling Init method");
    }
    public void customDestroy(){
        System.out.println("calling Destroy Method");
    }
}
