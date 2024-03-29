import java.util.Scanner;

public class App {

  public static void menu() {
    System.out.println(
      "----Welcome to Employee Management System----" +
      "\n1. Add Employee" +
      "\n2. View Employee" +
      "\n3. Update Employee" +
      "\n4. Delete Employee" +
      "\n5. View All Employee" +
      "\n6. Exist"
    );
  }

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    EmployeeServices services = new Services(); //updcasting
    do {
      App.menu();
      System.out.println("Enter your Choice");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Add Employee");
          services.AddEmployee();
          break;
        case 2:
          System.out.println("View Employee");
          services.viewEmp();
          break;
        case 3:
          System.out.println("Update Employee");
          services.updateEmployee();
          break;
        case 4:
          System.out.println("Delete Employee");
          services.deleteEmployee();
          break;
        case 5:
          System.out.println("View All Employee");
           services.viewAllEmps();
          break;
        case 6:
          System.out.println("Thank you for using Application!");
          System.exit(0);
          break;
        default:
          System.out.println("Please Enter valid Choice");
          break;
      }
      System.out.println();
    } while (true);
  }
}
