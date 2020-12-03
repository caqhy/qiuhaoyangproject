package bookManage;

import java.io.Serializable;
import java.util.Objects;

public class SellerInformation implements Serializable {
    private static final long serialVersionUID = -5500770256614717489L;
    private String account;
    private String password;

    public SellerInformation(String account, String password) {
        this.account = account;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellerInformation that = (SellerInformation) o;
        return Objects.equals(account, that.account) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
