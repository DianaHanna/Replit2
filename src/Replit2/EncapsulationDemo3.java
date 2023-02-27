package Replit2;

public class EncapsulationDemo3 {
    private String empName="John";
    private int empAge=30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;

    }
    public static void main(String[] args) {

        EncapsulationDemo demo=new EncapsulationDemo();
        System.out.println("Employee Name: "+demo.getEmpName());
        System.out.println("Employee Age: "+demo.getEmpAge());
    }

}


