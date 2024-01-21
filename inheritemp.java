import java.util.Scanner;
public class inheritemp 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Enter the number of persons: ");
            n = sc.nextInt();

            System.out.println();

            student[] s = new student[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the details of students: ");
                s[i] = new student();
                s[i].getSdata();
            }
            for(int i=0;i<n;i++){
                System.out.println("Details of students: ");
                s[i].disSData();
            }
            System.out.println();


            employee[] e = new employee[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the details of employees: ");
                e[i] = new employee();
                e[i].getEdata();
            }
            for(int i=0;i<n;i++){
                System.out.println("Details of Employees: ");
                e[i].disEData();
            }


            float max=0;
            int ind=0;
            for(int i=0;i<n;i++)
            {
                if(e[i].dept.compareTo("sales")==0 && e[i].desig.compareTo("manager")==0){
                     if(e[i].salary>max){
                        max=e[i].salary;
                        ind=i;
                     }
                }
            }
            if(max==0){
            System.out.print("There are no managers in sales department");
            }
            else
            {
                System.out.print("Highest paid manager in sales department");
                e[ind].disData();
                e[ind].disEData();
            }
             sc.close();
        }
    }


class person{
    String name,gender;
    int age;
    public void getData(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            name = sc.next();
            System.out.print("Enter gender: ");
            gender = sc.next();
            System.out.println("Enter age: ");
            age = sc.nextInt();
            // sc.nextLine();
             
        }
    public void disData(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.print("Age: "+age);
        System.out.println();
    }
}


class student extends person{
    int usn;
    String branch;
    public void getSdata(){
        getData();
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter USN: ");
            usn = sc.nextInt();
            System.out.print("Enter branch: ");
            branch = sc.next();
            sc.nextLine();
        }
    public void disSData(){
        disData();
        System.out.println("USN: "+usn);
        System.out.println("Branch: "+branch);
        System.out.println();
    }
}
class employee extends person{
    int empId;
    String dept;
    String desig;
    float salary;
    public void getEdata(){
        getData();
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter EmpId: ");
            empId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter department: ");
            dept = sc.next();
            System.out.print("Enter designation: ");
            desig = sc.next();
            System.out.print("Enter salary: ");
            salary = sc.nextFloat();
            sc.nextLine();
        }
    public void disEData(){
        disData();
        System.out.println("Emp ID: "+empId);
        System.out.println("Department: "+dept);
        System.out.print("Designation: "+desig);
        System.out.print("Salary: "+salary);
        System.out.println();
    }
}