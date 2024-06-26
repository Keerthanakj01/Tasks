
public class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getDouble(){
        return salary;
    }

    public void EmpDetails(){
        System.out.println("Employee id:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary:"+salary);  
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001,"Arun", 100000);
        Employee emp2 = new Employee(1002,"Arjun", 100000);
        Employee emp3 = new Employee(1003,"baalu", 100000);

        System.out.println("Employee 1 Details:");
       emp1.EmpDetails();

        System.out.println();

        System.out.println("Employee 2 Details:");
        emp2.EmpDetails();

        System.out.println();

        System.out.println("Employee 3 Details:");
        emp3.EmpDetails();
}
}
