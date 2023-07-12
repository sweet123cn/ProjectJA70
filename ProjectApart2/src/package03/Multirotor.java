package package03;

import package02.Helicopter;

public class Multirotor extends Helicopter{

    private int noOfRotors;
    
    // default constructor
    public Multirotor() {
        super();
		this.noOfRotors = 6;
	}

    // parameter constructor
	public Multirotor(String brand, double price, int horsepower, int noOfCylinders, int creationYear, int passengerCapacity,int noOfRotors) {
		
        super(brand, price, horsepower,noOfCylinders,creationYear,passengerCapacity);
		this.noOfRotors = noOfRotors;
		
	}
	
	//copy constructor
    public Multirotor(Multirotor multirotor) {
		super(multirotor);
		this.noOfRotors = multirotor.noOfRotors;
	}

	public int getNoOfRotors() {
		return noOfRotors;
	}

	public void setNoOfRotors(int noOfRotors) {
		this.noOfRotors = noOfRotors;
	}

	@Override
	public String toString() {
		return "[ This Multirotor is manufactured by " + this.brand + ", costs " + this.price + "$, and horsepower is " + this.horsepower + 
               ", number of cylinders is " + this.noOfCylinders + ", it can carry " + this.passengerCapacity + " passengers, and created at " + this.creationYear + 
               " number of rotors is " + this.noOfRotors + " ]";
	}
	
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        else
        {
            Multirotor multirotor = (Multirotor) obj;
            return this.brand.equals(multirotor.brand) && this.price == multirotor.price && this.horsepower == multirotor.horsepower 
                 && this.noOfCylinders == multirotor.noOfCylinders && this.creationYear == multirotor.creationYear 
                 && this.passengerCapacity == multirotor.passengerCapacity && this.noOfRotors == multirotor.noOfRotors;
        }         
         
    }

}
