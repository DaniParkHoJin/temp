package exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        int size = names.size();
        for (int i = 0; i < size; i++) {
                names.poll();
        }


        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }


    }
}
