package iO;

import bookManage.BuyerInformation;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class BuyerOutput {
    public void output(List<BuyerInformation> buyerList) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("buyer"))){
            oos.writeObject(buyerList);
        }catch (IOException e) {
                e.printStackTrace();
        }
    }

}
