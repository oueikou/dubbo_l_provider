package com.dubbo.provider;

import org.springframework.stereotype.Service;

import com.dubbo.test.DubboProviderTestService;

@Service("dubboProviderTestServiceImpl")
public class DubboProviderTestServiceImpl implements DubboProviderTestService{

	public String getHelloWord() {
		return "HelloWord";
	}

}
