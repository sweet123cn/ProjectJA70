package driver;

import package01.Airplane;
import package02.Helicopter;
import package02.Quadcopter;
import package03.Multirotor;
import package04.UAV;
import package05.MAV;
import package05.AgriculturalDrone;

public class Driver {

	//findLeastAndMostExpensiveUAV() to find the least and most expensive object  
	//if there is only one object, then it is the least and the most expensive object the same time
	public static <T extends Airplane> void findLeastAndMostExpensiveUAV(T[] flyingObjects) {
		T leastExpensive = null;
		T mostExpensive = null;
		for (int i = 0; i < flyingObjects.length; i++) {
			//save the least expensive object
			if (leastExpensive == null || flyingObjects[i].getPrice() < leastExpensive.getPrice()) {
				leastExpensive = flyingObjects[i];
			}

			//save the most expensive object
			if (mostExpensive == null || flyingObjects[i].getPrice() > mostExpensive.getPrice()) {
				mostExpensive = flyingObjects[i];
			}
		}

		//out put the result
		if (leastExpensive != null) {
			System.out.println("The least expensive flying object is: " + leastExpensive.getBrand() + " the price is $" + leastExpensive.getPrice());
		} else {
			System.out.println("No flying objects were found in the array.");
		}
		if (mostExpensive != null) {
			System.out.println("The most expensive flying object is: " + mostExpensive.getBrand() + " the price is $" + mostExpensive.getPrice());
		} else {
			System.out.println("No flying objects were found in the array.");
		}
	}

	public static void main(String[] args) {

		//make the instance to objects
		//parameter constructor
		Airplane airplane1 = new Airplane("Boeing", 150000.0, 1200);
		Helicopter helicopter1 = new Helicopter("Bell", 100000.0, 800, 6, 2022, 5);
		Quadcopter quadcopter1 = new Quadcopter("DJI", 2000.0, 100, 4, 2023, 1, 60);
		Multirotor multirotor1 = new Multirotor("Parrot", 1000.0, 50, 4, 2023, 1, 4);
		UAV uav1 = new UAV("brand1", 5000, 2, 1.5);
		AgriculturalDrone agriculturalDrone1 = new AgriculturalDrone("Yamaha", 10000.0, 500, 2.0,10);
		MAV mav1 = new MAV("Hoverfly",299.0, 5, 100.0, "Cybertrunk", 20);

		//default constructor
		Airplane airplane2 = new Airplane();
		Helicopter helicopter2 = new Helicopter();
		Quadcopter quadcopter2 = new Quadcopter();
		Multirotor multirotor2 = new Multirotor();
		UAV uav2 = new UAV();
		AgriculturalDrone agriculturalDrone2 = new AgriculturalDrone();
		MAV mav2 = new MAV();

		//copy constructor
		MAV mav3 = new MAV(mav2);
		Airplane airplane3 = new Airplane(airplane1);

		Helicopter helicopter3 = new Helicopter(helicopter2);
		Quadcopter quadcopter3 = new Quadcopter(quadcopter1);
		Multirotor multirotor3 = new Multirotor(multirotor2);
		UAV uav3 = new UAV(uav1);
		AgriculturalDrone agriculturalDrone3 = new AgriculturalDrone(agriculturalDrone2);

		//output all objects
		System.out.println(airplane1 + "\n" + helicopter1 + "\n" + quadcopter1 + "\n" + multirotor1 + "\n" + uav1 + "\n"
				+ agriculturalDrone1 + "\n" + mav1 + "\n" + airplane2 + "\n" + helicopter2 + "\n" + quadcopter2 + "\n"
				+ multirotor2 + "\n" + uav2 + "\n" + agriculturalDrone2 + "\n" + mav2 + "\n" + airplane3 + "\n" + helicopter3 + "\n" + quadcopter3 + "\n" + multirotor3 + "\n" + uav3 + "\n"
				+ agriculturalDrone3 + "\n" + mav3 + "\n");

		// equals():same class and similar values
		if (airplane1.equals(airplane3)) {
			System.out.println("airplane1 is equals to airplane3");
		} else {
			System.out.println("airplane1 is not equals to airplane3");
		}

		if (quadcopter3.equals(quadcopter1)) {
			System.out.println("quadcopter3 is equals to quadcopter1");
		} else {
			System.out.println("quadcopter3 is not equals to quadcopter1");
		}

		// equals():different class
		if (airplane1.equals(helicopter1)) {
			System.out.println("airplane1 is equals to helicopter1 ");
		} else {
			System.out.println("airplane1 is not equals to helicopter1");
		}

		if (uav1.equals(quadcopter1)) {
			System.out.println("uav1 is equals to quadcopter1 ");
		} else {
			System.out.println("uav1 is not equals to quadcopter1");
		}

		// equals():same class and different values
		if (agriculturalDrone1.equals(agriculturalDrone3)) {
			System.out.println("agriculturalDrone1 is equals to agriculturalDrone3");
		} else {
			System.out.println("agriculturalDrone1 is not equals to agriculturalDrone3");
		}

		if (multirotor3.equals(multirotor1)) {
			System.out.println("multirotor3 is equals to multirotor1");
		} else {
			System.out.println("multirotor3 is not equals to multirotor1");
		}

		//save objects into the array with UAV
		Airplane[] flyingObject1 = { airplane1, helicopter1, quadcopter1, multirotor1, uav1, agriculturalDrone1, mav1,
				airplane2, helicopter2, quadcopter2, multirotor2, uav2, agriculturalDrone2, mav1, airplane3, mav3,
				helicopter3 };

		// without UAV
		Airplane[] flyingObject2 = { airplane1, helicopter1, quadcopter1, multirotor1, agriculturalDrone1, mav1,
				airplane2, helicopter2, quadcopter2, multirotor2, agriculturalDrone2, mav1, airplane3, mav3,
				helicopter3 };

		//call findLeastAndMostExpensiveUAV()
		findLeastAndMostExpensiveUAV(flyingObject1);
		findLeastAndMostExpensiveUAV(flyingObject2);

	}

}
