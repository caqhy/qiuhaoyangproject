package operation;

import bookManage.Book;
import java.util.Iterator;
import java.util.List;

public class BuyerPrint implements Fuction {
    @Override
    public void work(List<Book> bookList,List<String> diary) {
        for (Iterator<Book> it = bookList.iterator(); it.hasNext(); ) {

            System.out.println(it.next());
        }
    }
}
