package package01;

public class Airplane {

    private String brand;
	private double price;
    private int horsepower;
	
    // default constructor
    public Airplane() {
		this.brand = "Boing";
		this.price = 10000000;
        this.horsepower = 10000;
	}

    // parameter constructor
	public Airplane(String brand, double price, int horsepower) {
		
        this.brand = brand;
		this.price = price;
		this.horsepower = horsepower;
	}
	
	//copy constructor
    public Airplane(Airplane airplane) {
		
		this.brand = airplane.brand;
		this.price = airplane.price;
		this.horsepower = airplane.horsepower;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	@Override
	public String toString() {
		return "[ This airplane is manufactured by " + brand + ", costs " + price + "$, and horsepower is " + horsepower + " ]";
	}
	
    @Override
    public boolean equals(Airplane airplane) {
        if (airplane == null || airplane.getClass() != this.getClass())
        {
            return false;
        }
        else if (this.brand == airplane.brand && this.price == airplane.price && this.horsepower == airplane.horsepower)
        {
            return true;
        }         
         
    }

}
