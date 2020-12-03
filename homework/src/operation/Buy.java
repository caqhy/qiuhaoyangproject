package operation;

import bookManage.Book;
import java.util.List;
import java.util.Scanner;

public class Buy implements Fuction{
    @Override
    public void work(List<Book> bookList, List<String> diary) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要购买的秘籍");
        String buy = scanner.nextLine();
        int flag = 0;
        for(int i = 0;i < bookList.size();i++){
            Book book = bookList.get(i);
            if(book.getName().equals(buy) && bookList.get(i).isStatus()){
                bookList.get(i).setStatus(false);
                System.out.println("购买该秘籍成功");
                System.out.println("您支付了："+book.getPrize());
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("未找到秘籍或秘籍已售完");
        }
    }
}
