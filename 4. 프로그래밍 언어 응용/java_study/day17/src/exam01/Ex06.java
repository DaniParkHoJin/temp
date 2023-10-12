package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.dat");
             DataInputStream dis = new DataInputStream(fis)) {

            int num = dis.readInt(); // 순서대로, 자료형도 썻던 그대로 해야한다. 섞이면?? 까먹으면??
            boolean result = dis.readBoolean();
            String str = dis.readUTF();

            System.out.printf("number = %d, result = %s, str = %s%n", num, result, str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
