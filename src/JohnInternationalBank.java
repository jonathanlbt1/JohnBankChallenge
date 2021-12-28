public class JohnInternationalBank {

    private int anumber = 0;
    private double balance = 0;
    private String customer;
    private String email;
    private String phone;


    public JohnInternationalBank(int anumber, double balance, String customer, String email, String phone) {
        this.anumber = anumber;
        this.balance = balance;
        this.customer = customer;
        this.email = email;
        this.phone = phone;
    }


    public int getAnumber(){
        return anumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomer(){
        return customer;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }


    public void setAnumber(int anumber){
        this.anumber = anumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomer(String customer){
        this.customer = customer;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }


    public void deposit(double dpValue){
        this.balance += dpValue;
    }
    public void withdrawal(double wlValue){
        if (this.balance >= wlValue){
            this.balance -= wlValue;
            System.out.println("Your new balance is R$ " + this.balance);
        }else{
            System.out.println("Insuficient funds");
        }
    }



}
