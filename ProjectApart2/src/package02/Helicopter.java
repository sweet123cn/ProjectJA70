package package02;

import package01.Airplane;

public class Helicopter extends Airplane{

    protected int noOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;
    
    // default constructor
    public Helicopter() {
        super();
		this.noOfCylinders = 4;
		this.creationYear = 2020;
        this.passengerCapacity = 6;
	}

    // parameter constructor
	public Helicopter(String brand, double price, int horsepower, int noOfCylinders, int creationYear, int passengerCapacity) {
		
        super(brand, price, horsepower);
		this.noOfCylinders = noOfCylinders;
		this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
	}
	
	//copy constructor
    public Helicopter(Helicopter helicopter) {
		super(helicopter);
		this.noOfCylinders = helicopter.noOfCylinders;
		this.creationYear = helicopter.creationYear;
        this.passengerCapacity = helicopter.passengerCapacity;
	}

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public String toString() {
		return "[ This Helicopter is manufactured by " + this.brand + ", costs " + this.price + "$, and horsepower is " + this.horsepower + 
               ", number of cylinders is " + this.noOfCylinders + ", it can carry " + this.passengerCapacity + " passengers, and created at " + this.creationYear + " ]";
	}
	
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        else
        {
            Helicopter helicopter = (Helicopter) obj;
			return this.brand.equals(helicopter.brand) && this.price == helicopter.price && this.horsepower == helicopter.horsepower 
                 && this.noOfCylinders == helicopter.noOfCylinders && this.creationYear == helicopter.creationYear 
                 && this.passengerCapacity == helicopter.passengerCapacity;
        }         
         
    }
}
