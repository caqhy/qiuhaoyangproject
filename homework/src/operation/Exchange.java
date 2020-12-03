package operation;

import bookManage.Book;
import java.util.List;
import java.util.Scanner;

public class Exchange implements Fuction{
    @Override
    public void work(List<Book> bookList,List<String> diary) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要交换的秘籍");
        System.out.println("卖家规定的交换条件：");
        System.out.println("用一本价格更高的秘籍来交换，卖家将无条件同意，其他情况均不允许");
        System.out.println("请输入你想要的秘籍名");
        String sellerBook = scanner.nextLine();
        System.out.println("请输入你的秘籍名");
        String buyerBook = scanner.nextLine();
        System.out.println("请输入你的秘籍价格");
        int buyerPrize = scanner.nextInt();
        int flag = 0;
        for(int i = 0;i < bookList.size();i++){
            Book book = bookList.get(i);
            if(book.getName().equals(sellerBook)){
                if(book.getPrize()<buyerPrize && book.isStatus()) {
                    bookList.get(i).setName(buyerBook);
                    bookList.get(i).setPrize(buyerPrize);
                    flag = 1;
                    System.out.println("交换成功，恭喜你");
                }
            }
        }
        if(flag == 0) {
            System.out.println("交换失败");
        }
    }
}
