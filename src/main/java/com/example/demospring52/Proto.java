package com.example.demospring52;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// Singleton에서 Prototype을 참조할때
@Component @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Component @Scope(value = "prototype")
public class Proto {


}

