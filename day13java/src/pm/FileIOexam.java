package pm;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOexam {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("d:/out.txt");
        
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            output.write(data.getBytes());
        }
        
        
        
        output.close(); //8이후로 생략가능
        
        
    }
}