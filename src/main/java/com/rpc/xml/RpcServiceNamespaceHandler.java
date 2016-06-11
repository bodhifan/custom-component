package com.rpc.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class RpcServiceNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("rpc-consumer", new RpcConsumerBeanDefinitionParser());
    }

}