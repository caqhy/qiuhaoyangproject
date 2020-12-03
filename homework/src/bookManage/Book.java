package bookManage;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private static final long serialVersionUID = 8257760905792856058L;
    private String name;
    private int prize;
    private boolean status;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, int prize, boolean status) {
        this.name = name;
        this.prize = prize;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public String toString() {
        return "["+name+" , 价格:"+prize+" , "+(status ? "未售卖":"已售卖")+"]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
