package operation;

import bookManage.Book;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Modify implements  Fuction{
    @Override
    public void work(List<Book> bookList,List<String> diary) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要修改的秘籍");
        String modify = scanner.nextLine();
        int i = 0;
        int flag = 0;
        for(;i < bookList.size();i++){
            Book book = bookList.get(i);
            if(book.getName().equals(modify)){
                System.out.println("已找到 < "+modify+" >");
                flag = 1;
                System.out.println("请重新输入秘籍名");
                book.setName(scanner.nextLine());
                System.out.println("请重新输入秘籍价格");
                book.setPrize(scanner.nextInt());
                System.out.println("修改成功");
            }
        }
        if(flag == 0){
            System.out.println("未找到秘籍");
            diary.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "    马老师修改秘籍操作失败");
        }else {
            diary.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "    马老师修改了秘籍的信息");
        }
    }
}
