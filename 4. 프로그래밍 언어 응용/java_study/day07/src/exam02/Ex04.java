package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipFile;

public class Ex04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a2.txt");
            fis.close(); // IOException
            System.out.println("자원 해제!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 예외가 발생하든 안하든 무조건 실행되는 코드
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("자원 해제!");
        }
    }
}

