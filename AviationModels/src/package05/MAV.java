package package05;

import package04.UAV;

public class  MAV extends UAV{

    private String model;
    private double size;

    // default constructor
    public MAV() {
        super();
		this.model = "MICO001";
        this.size = 20;
	}

    // parameter constructor
	public MAV(String brand, double price, int horsepower, double weight, String model, double size) {
		
        super(brand, price, horsepower,weight);
		this.model = model;
        this.size = size;
	}
	
	//copy constructor
    public MAV(MAV mav) {
		super(mav);
		this.model = mav.model;
		this.size = mav.size;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

    @Override
	public String toString() {
		return "[ This MAV is manufactured by " + this.brand + ", costs " + this.price + "$, and horsepower is " + this.horsepower + 
               ", weight is " + this.weight + "g, the model is " + this.model + ", size is no more than " + this.size + " cm ]";
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        else
		{ 
			MAV mav = (MAV) obj;
			return this.brand.equals(mav.brand) && this.price == mav.price && this.horsepower == mav.horsepower 
                 && this.weight == mav.weight && this.model.equals(mav.model) && this.size == mav.size;
        
        }         
         
    }

}
