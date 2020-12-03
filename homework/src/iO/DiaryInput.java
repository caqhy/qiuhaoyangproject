package iO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DiaryInput {
    public void input(List<String> diary) {
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("diary"))){
            while((line = br.readLine()) != null){
                diary.add(line);
            }
        }catch ( IOException e){
            e.getStackTrace();
        }

    }
}
