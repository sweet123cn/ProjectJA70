package ProjectB;

import java.io.*;
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
		writeToFile(employees);
        System.out.println("enter filename to display employee information:");
        String nameOfFile = kb.nextLine();
        List<Employee> readEmployees = readFromFile(nameOfFile);
        for(Employee employee: readEmployees) {
            System.out.println(employee);
        }

        kb.close();
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
	public static void writeToFile(List<Employee> employees) {
        Scanner kb1 = new Scanner(System.in);
		System.out.println("Please enter the fileName to store employee information:");
        String fileName = kb1.nextLine();
        System.out.println("the information will store in " + fileName);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName +".txt", true));
            for(Employee employee: employees) {
                oos.writeObject(employee);
            }oos.close();

            System.out.println("adding complete");
        } catch (IOException e) {
            System.out.println("something wrong");
            e.printStackTrace();
        }

    }

    public static List<Employee> readFromFile(String fileName) throws ClassNotFoundException {
        List<Employee> employees = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(fileName+".txt");
            ObjectInputStream ois = new ObjectInputStream(fileIn);
            while (true) {
                try {
                    Employee employee = (Employee) ois.readObject();
                    employees.add(employee);
                } catch (EOFException e) {
                    break; 
                }
            }
            ois.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
        return employees;
        }
}
