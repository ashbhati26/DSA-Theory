public class AccessSpecifiers {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.username = "ashish";
        myAccount.setPassword("abcdefgh");
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}