package operation;

import bookManage.Book;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LookDiary implements Fuction{
    @Override
    public void work(List<Book> bookList, List<String> diary) {
        for(int i = 0;i<diary.size();i++){
            System.out.println(diary.get(i));
        }
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"    马老师查看了操作日记");

    }
}
