package Replit2;

public class EncapsulationDemo2 {
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
        EncapsulationDemo2 demo2=new EncapsulationDemo2();
        demo2.setEmpName("Mario");
        demo2.setEmpAge(32);
        System.out.println("Employee Name: "+demo2.getEmpName());
        System.out.println("Employee Age: "+demo2.getEmpAge());
    }
}
