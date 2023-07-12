package projectB;

import java.io.FileInputStream;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		//demonstrate if invalid input ,set default value
		Date d1 = new Date(13, 14, 2015);
		d1.dateOK();
		//create employee objects and add  information to a repertory (arraylist).

		Date d2 = new Date(10, 35, 2016);
		d2.dateOK();
		Date d3 = new Date(9, 1, 999);
		d3.dateOK();
		Date d4 = new Date(6, 1, 2014);
		d3.dateOK();
		Employee e1 = new Employee("Max", 10001, d1, "manager");
		Employee e2 = new Employee("Tom", 10002, d2, "staff");
		Employee e3 = new Employee("Jerry", 10003, d2, "staff");

		System.out.println(e1);

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		// demo getEmployeeAfter method to returns all employees hired after a particular Date
		getEmployeesAfter(d4, employees);


		//implement the method writeToFile and readFromFile that allow to write and read

		writeToFile();
		readFromFile();

	}

	public static ArrayList<Employee> getEmployeesAfter(Date mmddyy, List<Employee> employees) {
		ArrayList<Employee> employeesAfter = new ArrayList<>();
		System.out.println("These are employees hired after " + mmddyy);
		for (Employee em : employees) {
			if (em.getHireDate().comparedateAfterDate(mmddyy)) {
				System.out.println(em);
				employeesAfter.add(em);
			}
		}
		return employeesAfter;
	}

//	public static void writeToFile(List<Employee> employees) {
//
//		String fileName = "employees.txt";
//		ObjectOutputStream os = null;
//		try { 
//				os = new ObjectOutputStream(new FileOutputStream(fileName));
//			os.writeObject(employees);
//			System.out.println("Employees written to file successfully.");
//		} catch (IOException e) {
//			System.out.println("Error writing employees to file: " + e.getMessage());
//		}
//	}
//
//	public static List<Employee> readFromFile() throws ClassNotFoundException{
//		List<Employee> employees = new ArrayList<>();
//		try {
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.txt"));
//				employees = (List<Employee>) ois.readObject();
//            System.out.println("Employees read from file successfully.");
//		} catch (IOException e) {
//			System.out.println("Error reading employees from file: " + e.getMessage());
//		}
//		return employees;
//	}

	public static void writeToFile() {
		String name, position;
		int id;
		String hireDate;
		char ch1, ch2, ch3;
		Scanner kb = new Scanner(System.in);

		System.out.println("Please enter the fileName :");
		String fileName = kb.next();
		System.out.println("the information will storen in " + fileName);
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream(fileName));
			System.out.println("enter Id to continue or enter -1 if you want to exit");

			id = kb.nextInt();

			while (id != -1) {
				String cl = kb.nextLine();
				System.out.println("Name: ");
				name = kb.next();
				oos.writeInt(id);
				oos.writeChar('\t');
				oos.writeUTF(name);
				oos.writeChar(' ');
				System.out.println("hireDatedd-mm-yy: ");
				hireDate = kb.next();
				oos.writeUTF(hireDate);
				oos.writeChar(' ');
				System.out.println("position: ");
				position = kb.next();
				oos.writeUTF(position);
				System.out.println("added one employee to list");
				System.out.println("enter another id number to continue or enter -1 if you want to exit");
				id = kb.nextInt();
			}

			// save
			System.out.println("adding complete");
			oos.close();

		} catch (IOException e) {

			System.out.println("something wrong");
			System.out.println("terminate");
			System.exit(0);
		}

	}

	public static void readFromFile() throws ClassNotFoundException {
		String name, position;
		int id;
		String hireDate;
		char ch1, ch2, ch3;
		Scanner kb = new Scanner(System.in);
		System.out.println("Which binary file you want to read");
		String fileName = kb.next();
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			try {

				while (true) {
					id = ois.readInt();
					ch1 = ois.readChar();
					name = ois.readUTF();
					ch2 = ois.readChar();
					hireDate = ois.readUTF();
					ch3 = ois.readChar();
					position = ois.readUTF();

					System.out.println("" + id + ch1 + name + ch2 + hireDate + ch3 + position);
				}

			} catch (EOFException e) {
				System.out.println("reading the file is finish");
				System.exit(0);
			}
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found wrong");
			System.out.println("terminate");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("something wrong");
			System.out.println("terminate");
			System.exit(0);
		}
	}
}
