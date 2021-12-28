public class Main {

    public static void main(String[] args){

        JohnInternationalBank bank = new JohnInternationalBank(123456, 677.34, "Jonathan", "jonathanlbt@gmail.com", "1198677-9123");

        bank.deposit(150);
        System.out.println("My balance is R$" + bank.getBalance());
        bank.setAnumber(14425);
        bank.setCustomer("John Supper");
        System.out.println("The name of the customer is " + bank.getCustomer());
        System.out.println("Bank account number: " + bank.getAnumber());
        bank.setEmail("jonathanlbt@gmail.com");
        bank.setPhone("1198677-9123");
        bank.deposit(488.89);
        System.out.println("Client: " + bank.getCustomer());
        System.out.println("Bank account number: " + bank.getAnumber());
        System.out.println("Phone number: " + bank.getPhone());
        System.out.println("E-mail: " + bank.getEmail());
        System.out.println("Your current balance is: R$" + bank.getBalance());
        bank.withdrawal(300);
        bank.withdrawal(338.89);
        System.out.println("Your current balance is: R$" + bank.getBalance());

    }
}
