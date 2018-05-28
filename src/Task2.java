public class Task2 {
    public static void main(String[] args) {
        String num = "98079";
        int last = num.length() - 1;
        char ch = num.charAt(last);
        if (ch == '7') {
            System.out.println("there is 7");
        } else if (ch != '7') {
            System.out.println("no 7");
        }
    }
}
