import java.util.HashSet;

public class Services {

  HashSet<Emp> empSet = new HashSet<Emp>();
  Emp emp1 = new Emp(1, "Darshan1", 20, "IT", "Developer", 20000);
  Emp emp2 = new Emp(2, "Darshan2", 21, "Admin", "DevOps Eng", 20000);
  Emp emp3 = new Emp(3, "Darshan3", 22, "CO", "Tester", 20000);

  public Services() {
    empSet.add(emp1);
    empSet.add(emp2);
    empSet.add(emp3);
  }

  public void viewAllEmps() {
    for (Emp emp : empSet) {
      System.out.println(emp);
    }
  }

  public static void main(String[] args) {

    
  }
}
