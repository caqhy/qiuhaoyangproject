package iO;

import bookManage.Book;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class BookListOutput {
    public void output(List<Book> bookList) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book"))) {
            oos.writeObject(bookList);
        }catch ( IOException e){
            e.getStackTrace();
        }
    }
}
