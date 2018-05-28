public class Task5 {
    public static void main(String[] args) {
        String str = "####???###??";
        String newStr = str.replace("?", "HELLO");
        String newStr1 = newStr.replace("#", "");
        System.out.println(newStr1);
    }
}
