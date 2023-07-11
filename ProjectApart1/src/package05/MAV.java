package package05;

import package04.UAV;

public class  MAV extends UAV{

    private String brand;
    private int carryCapacity;

    // default constructor
    public AgriculturalDrone() {
        super();
		this.brand = "AgriFlyer";
        this.carryCapacity = 50;
	}

    // parameter constructor
	public AgriculturalDrone(String brand, double price, int horsepower, double weight,int carryCapacity) {
		
        super(brand, price, horsepower,weight);
		this.brand = brand;
        this.carryCapacity = carryCapacity;
	}
	
	//copy constructor
    public AgriculturalDrone(AgriculturalDrone agriculturalDrone) {
		super(agriculturalDrone);
		this.brand = agriculturalDrone.brand;
		this.carryCapacity = agriculturalDrone.carryCapacity;
	}

}
