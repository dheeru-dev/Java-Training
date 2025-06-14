//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BankAccount {
    String accountHolder;
    String accountNum;
    private double balance;

    //constructor
    public BankAccount(String accountHolder, String accountNum){
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = 0.0;
    }
    public String getAccountNum(){
        return accountNum;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    /*
    public String SetAccountHolder() {
    }
    public String SetAccountNum() {
    } */
    public static void main(String[] args) {
        //System.out.printf("Welcome!");
        BankAccount b1 = new BankAccount("Ram", "B10004");
        BankAccount b2 = new BankAccount("Kumar", "B10003");
        //b1.accountHolder = "Dheeraj";
        //b1.accountNum = "B10005";
        System.out.println("b1:"+b1.accountHolder+","+b1.accountNum+","+b1.balance);
        System.out.println("b1:"+b1.getAccountHolder()+","+b1.getAccountNum());
        System.out.println("b2:"+b2.getAccountHolder()+","+b2.getAccountNum());
        }
}