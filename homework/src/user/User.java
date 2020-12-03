package user;

import bookManage.Book;
import operation.Fuction;
import java.util.List;

public abstract class User {
    protected Fuction[] operation;
    public abstract int menu();
    public void doOperation(int choose, List<Book> bookList,List<String> diary){
            operation[choose].work(bookList, diary);
    }
}
