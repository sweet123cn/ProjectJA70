package driver;

import package01.Airplane;

public class Driver {

	public static <T extends Airplane> void findLeastAndMostExpensiveUAV(T[] flyingObjects) {
		T leastExpensive = null;
		T mostExpensive = null;
		for (int i = 0; i < flyingObjects.length; i++) {
			if (leastExpensive == null || flyingObjects[i].getPrice() < leastExpensive.getPrice()) {
				leastExpensive = flyingObjects[i];
			}
			if (mostExpensive == null || flyingObjects[i].getPrice() > mostExpensive.getPrice()) {
				mostExpensive = flyingObjects[i];
			}
		}

		if (leastExpensive != null) {
			System.out.println("The least expensive flying object is: " + leastExpensive.toString());
		} else {
			System.out.println("No flying objects were found in the array.");
		}
		if (mostExpensive != null) {
			System.out.println("The most expensive flying object is: " + mostExpensive.toString());
		} else {
			System.out.println("No flying objects were found in the array.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane airplane1 = new Airplane("Boeing", 150000.0, 1200);
		Helicopter helicopter1 = new Helicopter("Bell", 100000.0, 800, 6, 2022, 5);
		Quadcopter quadcopter1 = new Quadcopter("DJI", 2000.0, 100, 4, 2023, 1, 60);
		Multirotor multirotor1 = new Multirotor("Parrot", 1000.0, 50, 4, 2023, 1, 4);
		UAV uav1 = new UAV(1.5, 5000.0);
		AgriculturalDrone agriculturalDrone1 = new AgriculturalDrone(2.0, 10000.0, "Yamaha", 10);
		MAV mav1 = new MAV(0.1, 500.0, "Hoverfly", 0.05);

		Airplane airplane2 = new Airplane();
		Helicopter helicopter2 = new Helicopter();
		Quadcopter quadcopter2 = new Quadcopter();
		Multirotor multirotor2 = new Multirotor();
		UAV uav2 = new UAV();
		AgriculturalDrone agriculturalDrone2 = new AgriculturalDrone();
		MAV mav2 = new MAV();
		MAV mav3 = new MAV(mav2);
		Airplane airplane3 = new Airplane(airplane1);
		Helicopter helicopter3 = new Helicopter("Bell", 100000.0, 800, 8, 2022, 5);

		System.out.println(airplane1 + "\n" + helicopter1 + "\n" + quadcopter1 + "\n" + multirotor1 + "\n" + uav1 + "\n"
				+ agriculturalDrone1 + "\n" + mav1 + "\n" + airplane2 + "\n" + helicopter2 + "\n" + quadcopter2 + "\n"
				+ multirotor2 + "\n" + uav2 + "\n" + agriculturalDrone2 + "\n" + mav2 + "\n" + airplane3);

		// same class and similar values
		if (airplane1.equals(airplane3)) {
			System.out.println("airplane1 is equals to airplane 3");
		} else {
			System.out.println("airplane1 is not equals to airplane 3");
		}
		// // different class
		if (airplane1.equals(helicopter1)) {
			System.out.println("airplane1 is equals to helicopter 1 ");
		} else {
			System.out.println("airplane1 is not equals to helicopter 1");
		}

		// same class and different values
		if (airplane1.equals(airplane2)) {
			System.out.println("airplane1 is equals to airplane 2");
		} else {
			System.out.println("airplane1 is not equals to airplane 2");
		}

		Airplane[] flyingObject1 = { airplane1, helicopter1, quadcopter1, multirotor1, uav1, agriculturalDrone1, mav1,
				airplane2, helicopter2, quadcopter2, multirotor2, uav2, agriculturalDrone2, mav2, airplane3, mav3,
				helicopter3 };

		// without UAV
		Airplane[] flyingObject2 = { airplane1, helicopter1, quadcopter1, multirotor1, agriculturalDrone1, mav1,
				airplane2, helicopter2, quadcopter2, multirotor2, agriculturalDrone2, mav2, airplane3, mav3,
				helicopter3 };

		findLeastAndMostExpensiveUAV(flyingObject1);
		findLeastAndMostExpensiveUAV(flyingObject2);

	}

}
