package operation;

import bookManage.Book;
import java.util.List;

public class SellerExit implements Fuction{
    @Override
    public void work(List<Book> bookList,List<String> diary) {
        System.out.println("退出成功，欢迎下次再来");
        System.exit(0);
    }
}
