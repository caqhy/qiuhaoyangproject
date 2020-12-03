package iO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DiaryOutput {
    public void output(List<String> diary){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("diary"))) {
            for(int i = 0;i< diary.size();i++) {
                bw.write(diary.get(i));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
