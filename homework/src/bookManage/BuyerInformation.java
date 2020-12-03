package bookManage;

import java.io.Serializable;
import java.util.Objects;

public class BuyerInformation implements Serializable {
    private static final long serialVersionUID = -1445664470366543695L;
    private String account;
    private String password;

    public BuyerInformation(String account, String password) {
        this.account = account;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuyerInformation that = (BuyerInformation) o;
        return Objects.equals(account, that.account) &&
                Objects.equals(password, that.password);
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
