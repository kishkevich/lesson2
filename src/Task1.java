    public class Task1 {
        public static void main (String [] args){
            String str = new String ("HeloWorld");
            int n = str.length();
            System.out.println ("Количество символов в строке " + n);
            if (n/2 == 1){
                int mid = str.length()/2;
                String part1 = str.substring(0,mid);
                String  part2 = str.substring(mid);
                System.out.println(part1);
                System.out.println(part2);
            }
            if (n/2 != 1){
                int mid = (str.length()+1)/2;
                String part1 = str.substring(0,mid);
                String  part2 = str.substring(mid);
                System.out.println(part1);
                System.out.println(part2);
            }
        }}
