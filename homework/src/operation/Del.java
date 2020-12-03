package operation;

import bookManage.Book;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Del implements Fuction{
    @Override
    public void work(List<Book> bookList,List<String> diary) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要删除的秘籍");
        String del = scanner.nextLine();
        int flag = 0;
        for(int i = 0;i < bookList.size();i++){
            Book book = bookList.get(i);
            if(book.getName().equals(del)){
                bookList.remove(book);
                System.out.println("删除该秘籍成功");
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("未找到该秘籍或你给的书籍价格太低");
            diary.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "    马老师进行删除秘籍操作失败");
        }else {
            diary.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "    马老师删除< " + del + " >秘籍");
        }
    }
}
