package com.example.demo1;

public class Car {
    private String carType;
    private IEngine engine;

    public Car(IEngine engine) { // constructor takes argument so we need dependancy for this in bean
        this.engine = engine;
    }

    public String getCarType() {
        return carType;
    }

    public IEngine getEngine() {
        return engine;
    }
}
