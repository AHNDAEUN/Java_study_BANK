package com.iu.start.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Car {
	//   카는 엔진이 없으면 x
	// Car는 Engine에 의존적
	//1.
	//priavat Engine engine = new Engine();
	//2.
	//Car car = new Car();
	// car.engine = new Engine();
	private Engine engine;
	private LeftWheel leftwheel;
	private RightWheel rightwheel;
	
	
	//3.
	//public Car() {
		//this.engine new Engine); ①
	
	/*public Car(Engine engine) {
		this.engine=engine; ②*/
		
		
		public Car( LeftWheel leftwheel, RightWheel righrwheel) {
			this.leftwheel =leftwheel;
			this.rightwheel=righrwheel;
	}	
		
	// Engine engine =new Engine();
		//Car car = new Car(engine);

		//4.
	{
		this.engine = new Engine();
		
	}
	
	//5.

	

	public Engine getEngine() {
		return engine;
	}
  
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	//5.
// Car car = new Car();
	//Engine engine = new Engine();
	//car.setEngine(engine);




}


