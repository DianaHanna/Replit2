package Replit2;

public class EncapsulationDemo {
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public static void main(String[] args) {

        EncapsulationDemo demo=new EncapsulationDemo();
        demo.setEmpName("John");
        demo.setEmpAge(30);
        System.out.println("Employee Name: "+demo.getEmpName());
        System.out.println("Employee Age: "+demo.getEmpAge());
    }
}
