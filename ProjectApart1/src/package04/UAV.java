package package04;

import package01.Airplane;

public class UAV extends Airplane{

    protected double weight;
    protected double price;
    
    // default constructor
    public UAV() {
        super();
		this.weight = 100;
		this.price = 499;
	}

    // parameter constructor
	public UAV(String brand, double price, int horsepower, double weight) {
		
        super(brand, price, horsepower);
		this.weight = weight;
        this.price = price;
	}
	
	//copy constructor
    public UAV(UAV uav) {
		super(uav);
		this.weight = uav.weight;
		this.price = uav.price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    @Override
	public String toString() {
		return "[ This UAV is manufactured by " + this.brand + ", costs " + this.price + "$, and horsepower is " + this.horsepower + 
               ", weight is " + this.weight + " ]";
	}
	
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        else
        {
			UAV uav = (UAV) obj;
			return this.brand.equals(uav.brand) && this.price == uav.price && this.horsepower == uav.horsepower && this.weight == uav.weight;
        }         
         
    }

}
