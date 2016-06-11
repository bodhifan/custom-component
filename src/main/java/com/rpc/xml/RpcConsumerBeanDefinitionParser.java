package com.rpc.xml;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import com.rpc.services.imp.EchoServiceImp1;
import org.w3c.dom.Element;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bodhi on 6/11/16.
 */
public class RpcConsumerBeanDefinitionParser implements BeanDefinitionParser {

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        String className = element.getAttribute("interface-name");
        String version = element.getAttribute("version");

        // 实例化一个echo service
        EchoServiceImp1 imp = new EchoServiceImp1(className + "\t" + version);
        RootBeanDefinition definition = new RootBeanDefinition(EchoServiceImp1.class);
        Map<String,String> props = new HashMap<String, String>();
        props.put("msg",className + "\t" + version);
        definition.getPropertyValues().addPropertyValues(props);

        parserContext.getRegistry().registerBeanDefinition(element.getAttribute("id"),definition);
        return  definition;
    }
}
