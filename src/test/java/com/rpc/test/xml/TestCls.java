package com.rpc.test.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.rpc.services.EchoService;

import java.text.SimpleDateFormat;

/**
 * Created by bodhi on 6/11/16.
 */
public class TestCls {

    public static  void  main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/application-context.xml");
        EchoService service = context.getBean("consumer1",EchoService.class);

        service.echo();

    }
}
