package package05;

import package04.UAV;

public class AgriculturalDrone extends UAV{

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCarryCapacity() {
		return carryCapacity;
	}

	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}

    @Override
	public String toString() {
		return "[ This AgriculturalDrone is manufactured by " + this.brand + ", costs " + this.price + "$, and horsepower is " + this.horsepower + 
               ", weight is " + this.weight + ", It can carry up to " + this.carryCapacity + " Kg ]";
	}
	
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        else
        {
            AgriculturalDrone agriculturalDrone = (AgriculturalDrone) obj;
			return this.brand.equals(agriculturalDrone.brand) && this.price == agriculturalDrone.price && this.horsepower == agriculturalDrone.horsepower 
                 && this.weight == agriculturalDrone.weight && this.carryCapacity == agriculturalDrone.carryCapacity;
        }         
         
    }

}
