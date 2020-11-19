package com.readspring.myannotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class FirstParser implements BeanDefinitionParser {

    private static final String ACTION = "say";
    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        String sayWord = element.getAttribute(ACTION);
        System.out.println(sayWord);
        return null;
    }
}
