package com.za.cartoolbox;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextTool implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringContextTool.applicationContext == null) {
            SpringContextTool.applicationContext = applicationContext;
        }
    }

    public static <T> T getBean(Class<T> beanType) {
        return applicationContext.getBean(beanType);
    }

    public static <T> T getBean(String beanName, Class<T> beanType) {
        return applicationContext.getBean(beanName, beanType);
    }

    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }
    
    public static ApplicationContext getApplicationContext()
    {
    	return applicationContext;
    }

}
