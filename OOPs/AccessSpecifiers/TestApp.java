class Account {
    //Data Security
    private double balance;

    //methods :: public
    public double getBalance(double balance){

        //perform authentication
        boolean result = validate("sachin", "sachin123");

        //withdrawing the money
        if(result){
            this.balance = this.balance - balance;
            return balance;

        }
        else{
            //throw a message to user:
            System.out.println("Invalid username/password! try again...");
            return 0.0;
        }
    }

    //methods :: public
    public void setBalance(double balance){

        //perform authentication
        boolean result = validate("sachin", "sachin123");

        if(result){
            //deposit the money
            this.balance = this.balance + balance;
            System.out.println("Credited to the account");
        }
        else {
            //throw a message to user:
            System.out.println("Invalid username/password! try again...");
        }
    }

    //method :: private
    private boolean validate(String userName, String password){
        //logic for authentication
        return userName.equalsIgnoreCase("sachin") && password.equals("sachin123");
    }
}
public class TestApp{
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000.0);

        double balance = acc.getBalance(500.0);
        System.out.println("Withdrawing :: "+balance + " Amount");
    }
}
