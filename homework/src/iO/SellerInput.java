package iO;

import bookManage.SellerInformation;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SellerInput {
    public List<SellerInformation> input()  {
        List<SellerInformation> sellerList = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("seller"))){
            sellerList = new ArrayList<>();
            Object o = null;
            try {
                o = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            sellerList = (List<SellerInformation>) o;

        }catch ( IOException e){
            e.getStackTrace();
        }
        return sellerList;


    }
}
