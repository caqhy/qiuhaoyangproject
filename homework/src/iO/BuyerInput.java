package iO;

import bookManage.BuyerInformation;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BuyerInput {
    public List<BuyerInformation> input(){
        List<BuyerInformation> buyerList = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("buyer"))){
            buyerList = new ArrayList<>();
            Object o = null;
            try {
                o = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            buyerList = (List<BuyerInformation>) o;
        }catch ( IOException e){
            e.getStackTrace();
        }
        return buyerList;
    }
}
