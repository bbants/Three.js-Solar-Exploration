package com.nullpointerexception.model.mock;

import com.nullpointerexception.model.Service.DemoService;

/**
 * Created by ss on 2017/9/21.
 */
public class MockDemo implements DemoService {

    @Override
    public void sayHello() {
        System.out.println("Mock Hello.");
    }
}
