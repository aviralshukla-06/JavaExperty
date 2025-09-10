
public class Encalsulate {
    private String name = "Aviral";
    private String position = "Backend Developer";
    private int empId = 34567;
    private int salary = 1500000;

    public void getEmpDetail() {
        System.out
                .println("Name: " + name + "\nPosition: " + position + "\nempId: " + empId + "\nSalary: " + salary);
    }

    public void setEmpDetail(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Encalsulate myEmp = new Encalsulate();
        myEmp.setEmpDetail("Devops Engineer", 2000000);
        myEmp.getEmpDetail();
    }
}