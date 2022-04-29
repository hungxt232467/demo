public class Employee {
    String empid;
    String empname;
    int salary;
    float commission;
    public Employee(String id, String name, int sal) {
        empid = id;
        empname = name;
        salary = sal;
    }
    public void calcCommission(float sales) {
        if (sales>10000)
            commission = salary*20/100;
        else
            commission = 0;
    }
    public void calcCommission(int overtime) {
        if (overtime>8)
            commission = salary/30;
        else
            commission = 0;
    }
    public void displayDetails() {
        System.out.println("Employee ID:"+empid);
        System.out.println("Employee Name:"+empname);
        System.out.println("Slary:"+salary);
        System.out.println("Commission:"+commission);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee objEmp = new Employee("E001","MariaNemeth", 4000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();
    }
}

