package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis(); // 시작 시간
        try (FileInputStream fis = new FileInputStream("specs.zip");
             FileOutputStream fos = new FileOutputStream("copied1.zip")) {

            while (fis.available() > 0) {
                fos.write(fis.read());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        long etime = System.currentTimeMillis(); // 마침 시간
        System.out.printf("소요 시간 : %d%n", etime - stime);

    }
}
