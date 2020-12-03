package user;

import operation.*;
import java.util.Scanner;

public class Seller extends User{
    public Seller() {
        operation = new Fuction[]{
                new SellerExit(),
                new SellerPrint(),
                new Add(),
                new Del(),
                new Modify(),
                new LookDiary()
        };
    }

    @Override
    public int menu() {
        System.out.println("**********************");
        System.out.println("1.查看全部秘籍");
        System.out.println("2.添加秘籍");
        System.out.println("3.删除秘籍");
        System.out.println("4.修改秘籍");
        System.out.println("5.查看日记");
        System.out.println("0.退出平台");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
