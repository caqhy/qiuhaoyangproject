package user;

import operation.*;
import java.util.Scanner;

public class Buyer extends User{
    public Buyer() {
        operation = new Fuction[]{
                new BuyerExit(),
                new BuyerPrint(),
                new Exchange(),
                new Buy()
        };
    }
    @Override
    public int menu() {
        System.out.println("*********************");
        System.out.println("1.查阅所有秘籍");
        System.out.println("2.交换秘籍");
        System.out.println("3.购买秘籍");
        System.out.println("0.退出平台");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
