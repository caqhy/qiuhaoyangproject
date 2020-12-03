package iO;

import bookManage.SellerInformation;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SellerOutput {
        public void output(List<SellerInformation> sellerList){
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("seller"))) {
                oos.writeObject(sellerList);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
}
