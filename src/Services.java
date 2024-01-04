import java.util.HashSet;
import java.util.Scanner;

public class Services extends EmployeeServices{

  int id;
  int updateChoice;
  String name;
  int age;
  String department;
  String designation;
  double salary;
  boolean found = false;

  Scanner sc = new Scanner(System.in);

  HashSet<Emp> empSet = new HashSet<Emp>();
  Emp emp1 = new Emp(1, "Darshan1", 20, "Developer", "IT", 20000);
  Emp emp2 = new Emp(2, "Darshan2", 21, "DevOps Eng", "Admin", 20000);
  Emp emp3 = new Emp(3, "Darshan3", 22, "Tester", "CO", 20000);

  //constructor
  public Services() {
    empSet.add(emp1);
    empSet.add(emp2);
    empSet.add(emp3);
  }

  @Override
  void viewAllEmps() {
    for (Emp emp : empSet) {
      System.out.println(emp);
    }
  }

  // 2.view emp
  @Override
 void viewEmp() {
    System.out.println("Enter ID: ");
    id = sc.nextInt();
        found = false;
    for (Emp emp : empSet) {
      if (emp.getId() == id) {
        System.out.println(emp);
        found = true;
      }
    }
    if (!found) {
      System.out.println("Employee with this id is not present");
    }
  }

   @Override
  public void updateEmployee() {
    for (Emp emp : empSet) {
      System.out.println(emp);
    }

    System.out.println("Enter ID: ");
    id = sc.nextInt();
    found = false;
    for (Emp emp : empSet) {
      if (emp.getId() == id) {
        found = true;
        System.out.println(emp);
        System.out.println(
          "You can only change/update these Fields - \n1. Name\n2. Age\n3. Department\n4. Designation\n5. Salary "
        );
        System.out.println("Which Field do you want to update!");
        updateChoice = sc.nextInt();
        switch (updateChoice) {
          case 1:
            System.out.println("Enter the new name");
            emp.setName(sc.next());
            break;
          case 2:
            System.out.println("Enter the age");
            emp.setAge(sc.nextInt());
            break;
          case 3:
            System.out.println("Enter the department");
            emp.setDepartment(sc.next());
            break;
          case 4:
            System.out.println("Enter the new Designation");
            emp.setDesignation(sc.next());
            break;
          case 5:
            System.out.println("Enter the new salary");
            emp.setSalary(sc.nextDouble());
            break;
          default:
            System.out.println("Wrong choice");
            break;
        }
        System.out.println("Updated Details of Employee are");
        System.out.println(emp);
      }
    }
    if (!found) {
      System.out.println("Employee with this id is not present");
    } else {
      System.out.println("Employee details updated successfully !!");
    }
  }

  //deleteEmployee
   @Override
  public void deleteEmployee() {
    System.out.println("Enter ID: ");
    id = sc.nextInt();
    Emp empDelete = null;
    found = false;
    for (Emp emp : empSet) {
      if (emp.getId() == id) {
        found = true;
        empDelete = emp;
      }
    }
    if (!found) {
      System.out.println("Employee with this id is not present");
    } else {
      empSet.remove(empDelete);
      System.out.println("Deleted successfully !!");
    }
  }

  //add employee
   @Override
  public void AddEmployee() {
   System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("enter Designation");
		designation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter sal");
		salary=sc.nextDouble();
		
		Emp emp=new Emp(id, name, age, designation, department, salary);
		
		empSet.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");
  }

  public static void main(String[] args) {}
}
