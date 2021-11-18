import java.io.Serializable;

public class Account implements Serializable {
    protected String userName;
    protected String password;

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
