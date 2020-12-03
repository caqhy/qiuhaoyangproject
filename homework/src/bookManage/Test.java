package bookManage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import iO.*;
import user.User;

public class Test {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<BuyerInformation>  buyerList = new ArrayList<>();
        List<SellerInformation> sellerList = new ArrayList<>();
        List<String> diary = new ArrayList<>();

        new DiaryInput().input(diary);
        sellerList.addAll(new SellerInput().input());
        buyerList.addAll(new BuyerInput().input());
        bookList.addAll(new BookListInput().input());

        System.out.println("1.卖家");
        System.out.println("2.买家");
        System.out.println("请选择序号确认你的身份：");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        User user;
        if(choose == 1){
             user = new Login().sellerLogin(sellerList);
            diary.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"    马老师成功进入交易平台");
        }else{
             user = new Login().buyerLogin(buyerList);
        }
        while(true){
            int choose2 = user.menu();
            if(choose2 == 0){
                diary.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"    马老师离开了交易平台");
                new BookListOutput().output(bookList);
                new DiaryOutput().output(diary);
                new BuyerOutput().output(buyerList);
                new SellerOutput().output(sellerList);
            }
            user.doOperation(choose2, bookList,diary);
        }

    }

}
