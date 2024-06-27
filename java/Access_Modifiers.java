import java.util.*;
class Account{
    public String name;
    protected String email;
    private String password;

    // getters and setters: using this Private Modifiers are access.
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "SBI";
        a1.email = "sbi883883@gmail.com";
        // a1.password = "Coder@18";
        a1.setPassword("Coder@18");
        System.out.println(a1.getPassword());
    }
    
}
