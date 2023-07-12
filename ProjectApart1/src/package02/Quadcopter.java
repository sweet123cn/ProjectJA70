package package02;

public class Quadcopter extends Helicopter{

    private int maxFlyingSpeed;
    
    // default constructor
    public Quadcopter() {
        super();
		this.maxFlyingSpeed = 20;
	}

    // parameter constructor
	public Quadcopter(String brand, double price, int horsepower, int noOfCylinders, int creationYear, int passengerCapacity,int maxFlyingSpeed) {
		
        super(brand, price, horsepower,noOfCylinders,creationYear,passengerCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
		
	}
	
	//copy constructor
    public Quadcopter(Quadcopter quadcopter) {
		super(quadcopter);
		this.maxFlyingSpeed = quadcopter.maxFlyingSpeed;
	}

    public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}

	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	@Override
	public String toString() {
		return "[ This Quadcopter is manufactured by " + this.brand + ", costs " + this.price + "$, and horsepower is " + this.horsepower + 
               ", number of cylinders is " + this.noOfCylinders + ", it can carry " + this.passengerCapacity + " passengers, and created at " + this.creationYear + 
               " MAXIMUM flying speed is " + this.maxFlyingSpeed + " ]";
	}
	
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        else
        {
            Quadcopter quadcopter = (Quadcopter) obj;
            return this.brand.equals(quadcopter.brand) && this.price == quadcopter.price && this.horsepower == quadcopter.horsepower 
                 && this.noOfCylinders == quadcopter.noOfCylinders && this.creationYear == quadcopter.creationYear 
                 && this.passengerCapacity == quadcopter.passengerCapacity && this.maxFlyingSpeed == quadcopter.maxFlyingSpeed;
        }         
         
    }

}
