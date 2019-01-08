package com.sample.designpatterns;

public class FactoryDesignPatternImpl extends FactoryDesignPattern{

	@Override
	public DAOInterface createDAO() {
		
		return  new DAOEample();
	}
	

}
