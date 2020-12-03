package operation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import bookManage.Book;

public class SellerPrint implements Fuction{
    @Override
    public void work(List<Book> bookList,List<String> diary) {
        for(Iterator<Book> it = bookList.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        diary.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"    马老师查阅了秘籍");
    }
}
