package exam02;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int num3 = num1 / num2;
            System.out.println(num3);

            String str = null;
            System.out.println(str.toUpperCase()); //NullPointException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) { // 항상 마지막에 넣어야 한다. 위에서부터 체크되어 오기 때문이다.
            System.out.println(e.getMessage());
        }
        System.out.println("중요한 코드!");
    }
}
