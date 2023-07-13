package driver;

import package01.Airplane;
import package02.Helicopter;
import package02.Quadcopter;
import package03.Multirotor;
import package04.UAV;
import package05.MAV;
import package05.AgriculturalDrone;

//copyFlyingObjects(): pass array of objects, and return the new array
public class Driver {
	public static <T extends Airplane> Airplane[] copyFlyingObjects(T[] flyingObjects) {

		Airplane[] copyArray = new Airplane[flyingObjects.length];
		for (int i = 0; i < flyingObjects.length; i++) {
			copyArray[i] = flyingObjects[i];
		}
		return copyArray;

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
		MAV mav1 = new MAV("Hoverfly",399.0, 5, 100.0, "Cybertrunk", 20);

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

		Airplane[] flyingObject1 = { airplane1, helicopter1, quadcopter1, multirotor1, uav1, agriculturalDrone1, mav1,
				airplane2, helicopter2, quadcopter2, multirotor2, uav2, agriculturalDrone2, mav2, airplane3, mav3,
				helicopter3 };

		//output source objects
		System.out.println("========================================");
		for (Airplane object : flyingObject1) {
			System.out.println(object);
		}
		
		//call copyFlyingObjects method
		Airplane[] copyResultArray = copyFlyingObjects(flyingObject1);

		//output result objects
		System.out.println("========================================");
		for (Airplane object : copyResultArray) {
			System.out.println(object);
		}
    
	}

}
