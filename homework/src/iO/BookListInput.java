package iO;

import bookManage.Book;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookListInput {
    public List<Book> input()  {

        List<Book> bookList = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book"))){
            bookList = new ArrayList<>();
            Object o = null;
            try {
                o = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            bookList = (List<Book>) o;
        }catch ( IOException e){
            e.getStackTrace();
        }
        return bookList;
    }
}
