package org.java.service;

public class DubboServiceImpl implements DubboService {

	@Override
	public String sayHi(String str) {
		return "hello Dubbo hello "+str;
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

}
