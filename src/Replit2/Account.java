package Replit2;

public class Account {
    private long acc_no;
    private String name;
    private String email;
    private double amount;

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public static void main(String[] args) {
        Account account=new Account();
        account.setAcc_no(7560504000l);
        account.setName("Sumair");
        account.setEmail("sumair@syntax.com");
        account.setAmount(50000.0);
        System.out.println(account.getAcc_no()+" "+account.getName()+" "+account.getEmail()+" "+account.getAmount());
    }

}
