package driver;

import package01.Airplane;
import package02.Helicopter;
import package02.Quadcopter;
import package03.Multirotor;
import package04.UAV;
import package05.MAV;
import package05.AgriculturalDrone;

public class Driver {
	public static <T extends Airplane> Airplane[] copyFlyingObjects(T[] flyingObjects) {

		Airplane[] copyArray = new Airplane[flyingObjects.length];
		for (int i = 0; i < flyingObjects.length; i++) {
			copyArray[i] = flyingObjects[i];
		}
		return copyArray;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane airplane1 = new Airplane("Boeing", 150000.0, 1200);
		Helicopter helicopter1 = new Helicopter("Bell", 100000.0, 800, 6, 2022, 5);
		Quadcopter quadcopter1 = new Quadcopter("DJI", 2000.0, 100, 4, 2023, 1, 60);
		Multirotor multirotor1 = new Multirotor("Parrot", 1000.0, 50, 4, 2023, 1, 4);
		UAV uav1 = new UAV("brand1", 1.5, 0, 5000.0);
		AgriculturalDrone agriculturalDrone1 = new AgriculturalDrone("Yamaha", 10000.0, 1500, 2.0, 10);
		MAV mav1 = new MAV("Hoverfly", 0.1, 0, 500.0, "Cybertrunk", 0.05);

		Airplane airplane2 = new Airplane();
		Helicopter helicopter2 = new Helicopter();
		Quadcopter quadcopter2 = new Quadcopter();
		Multirotor multirotor2 = new Multirotor();
		UAV uav2 = new UAV();
		AgriculturalDrone agriculturalDrone2 = new AgriculturalDrone();
		MAV mav2 = new MAV();
		MAV mav3 = new MAV(mav2);
		Airplane airplane3 = new Airplane(airplane1);
		Helicopter helicopter3 = new Helicopter(helicopter2);
		Airplane[] flyingObject1 = { airplane1, helicopter1, quadcopter1, multirotor1, uav1, agriculturalDrone1, mav1,
				airplane2, helicopter2, quadcopter2, multirotor2, uav2, agriculturalDrone2, mav2, airplane3, mav3,
				helicopter3 };
		copyFlyingObjects(flyingObject1);
		System.out.println("This is original array:");
		for (Airplane object : flyingObject1) {
			System.out.println(object);
		}
		System.out.println("\nThis is copy array:");
		for (int i = 0; i < copyFlyingObjects(flyingObject1).length; i++) {
			System.out.println(copyFlyingObjects(flyingObject1)[i]);
		}
	}

}
