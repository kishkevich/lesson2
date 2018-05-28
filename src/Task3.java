public class Task3 {
    public static void main (String [] args){
        int a =5;
        int b = 10;
        int r = 15;
        int Sba = a*b;
        double Sr = 3.14*r*r;
        if (Sba < Sr && a<r && b<r){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
