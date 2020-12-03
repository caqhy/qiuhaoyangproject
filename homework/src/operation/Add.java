package operation;

import bookManage.Book;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Add implements Fuction{
    @Override
    public void work(List<Book> bookList,List<String> diary) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scanner.nextLine();
        System.out.println("请输入价格");
        int prize = scanner.nextInt();
        bookList.add(new Book(name,prize,true));
        System.out.println("秘籍已加入");
        diary.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"    马老师添加< "+name+" >秘籍");

    }
}
