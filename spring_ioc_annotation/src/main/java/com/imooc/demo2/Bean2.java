package com.imooc.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean2")
@Scope("prototype") //@note 多例模式，不加为单例
public class Bean2 {

}
