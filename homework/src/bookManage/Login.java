package bookManage;

import user.*;
import java.util.List;
import java.util.Scanner;


public class Login{
    public User sellerLogin(List<SellerInformation> sellerList) {
        System.out.println("1.登陆");
        System.out.println("2.注册");
        System.out.println("请选择序号：");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        scanner.nextLine();
        if (choose == 2) {
                if (sellerList.size() == 1) {
                    System.out.println("卖家已创建账号");
                    System.out.println("（为了马老师的信息安全，只能注册一个账号，忘记账号请咨询人工客服）");
                    System.out.println("（联系方式：QQ）");
                }else{
                    System.out.println("请输入你的新账号");
                    String newAccount = scanner.nextLine();
                    System.out.println("请输入你的新密码");
                    String newPassword = scanner.nextLine();
                    sellerList.add(new SellerInformation(newAccount,newPassword));
                    System.out.println("恭喜您成为新用户");
                }
        }

            System.out.println("请输入你的账号");
            String account = scanner.nextLine();
            System.out.println("请输入你的密码");
            String password = scanner.nextLine();
            int flag = 0;
            SellerInformation seller = new SellerInformation(account,password);
            for (int i = 0; i < sellerList.size(); i++) {
                if (sellerList.get(i).equals(seller)) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("登录成功");
            }else{
                System.out.println("登陆失败，账号或密码错误");
                System.exit(0);
            }
            return new Seller();

    }


    public User buyerLogin(List<BuyerInformation>  buyerList) {
        System.out.println("1.登陆");
        System.out.println("2.注册");
        System.out.println("请选择序号：");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        scanner.nextLine();
        if (choose == 2) {
            System.out.println("请输入你的新账号");
            String newAccount = scanner.nextLine();
            System.out.println("请输入你的新密码");
            String newPassword = scanner.nextLine();
            buyerList.add(new BuyerInformation(newAccount,newPassword));
            System.out.println("恭喜您成为新用户");
        }
        System.out.println("请输入你的账号");
        String account = scanner.nextLine();
        System.out.println("请输入你的密码");
        String password = scanner.nextLine();
        BuyerInformation buyer = new BuyerInformation(account, password);
        int flag = 0;
        for (int i = 0; i < buyerList.size(); i++) {
            if (buyerList.get(i).equals(buyer)) {
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("登录成功");
        }else{
            System.out.println("登陆失败，账号或密码错误");
            System.exit(0);
        }
        return new Buyer();
    }
}
