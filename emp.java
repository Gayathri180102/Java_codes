// 2.	Write a java program to create an Employee database which stores following information about the Employee: Name, Emp_id, department, age, and designation. Perform the following operations:
// a.	Read and display the details of at least five Employees.
// b.	Calculate and display the sum of salary of all the employees of “sales” department.
// c.	Retrieve the details of “highest paid manager” in the purchase department.

import java.util.Scanner;

class Employee {
    int ID;
    String Ename;
    String Dname;
    String Designation;
    int salary;
}

class emp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of employees");
        n = sc.nextInt();
        System.out.println();
        Employee arr[] = new Employee[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = new Employee();
            System.out.print("Enter ID: ");
            arr[i].ID = sc.nextInt();
            System.out.print("Enter Name: ");
            arr[i].Ename = sc.next();
            System.out.print("Enter Department: ");
            arr[i].Dname = sc.next();
            System.out.print("Enter Designation: ");
            arr[i].Designation = sc.next();
            System.out.print("Enter Salary: ");
            arr[i].salary = sc.nextInt();
            System.out.println();
        }

        // Displaying all the records
        System.out.println();
        System.out.println("---------------------DETAILS OF ALL THE EMPLOYEES---------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee number " + (i + 1));
            System.out.println("Employee ID: " + arr[i].ID);
            System.out.println("Employee name: " + arr[i].Ename);
            System.out.println("Employee department: " + arr[i].Dname);
            System.out.println("Employee designation: " + arr[i].Designation);
            System.out.println("Employee salary: " + arr[i].salary);
            System.out.println();
        }

        // Sum of Salaries of Sales Manager
        System.out.print("The sum of salaries of employees of the sales department: ");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i].Dname).compareToIgnoreCase("sales") == 0)
                sum = sum + arr[i].salary;
        }

        System.out.println(sum);

        int max = 0, flag = 0, present = 0;
        // Highest paid manager
        for (int i = 0; i < n; i++) {
            if ((arr[i].Designation).compareToIgnoreCase("manager") == 0
                    && (arr[i].Dname).compareToIgnoreCase("purchase") == 0) 
            {
                if (arr[i].salary > max) {
                    max = arr[i].salary;
                    flag = i;
                    present = 1;
                }
            } 
            else 
            {
                System.out.println("No purchase manager present");
            }
        }
        if (present == 1) {
            System.out.println("Details of the Highest Paid Purchase Manager");
            System.out.println("Employee ID: " + arr[flag].ID);
            System.out.println("Employee name: " + arr[flag].Ename);
            System.out.println("Employee department: " + arr[flag].Dname);
            System.out.println("Employee designation: " + arr[flag].Designation);
            System.out.println("Employee salary: " + arr[flag].salary);
            System.out.println();
        }
        sc.close();
    }
}