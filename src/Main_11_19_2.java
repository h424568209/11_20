import java.util.Scanner;

public class Main_11_19_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String n1 = scanner.next();
            String n2 = scanner.next();
            String res =  AddLongInteger( n1 , n2);
            System.out.println(res);
        }
    }

    private static String AddLongInteger(String n1, String n2) {
        int carry = 0;
        if(n1.length() < n2.length()){
            String t = n1;
            n1 = n2;
            n2 = t;
        }
        int began = 0 ;
        int end = n2.length()-1;
        int ends = n1.length()-1;
        StringBuilder res = new StringBuilder();
        while(began<=end && began<=ends){
            int num = (n1.charAt(ends)-'0')+(n2.charAt(end) - '0') + carry;
            if(num>=10){
                int t = num%10;
                res.append(t);
                carry = num/10;
            }else{
                res.append(num+carry);
            }
            ends--;
            end--;
        }
        for(int i = ends ; i >=0 ; i--){
            carry = (n1.charAt(i)-'0'+carry)/10;
            res.append((n1.charAt(i)-'0'+carry)%10);
        }
        if(carry >0){
            res.append(carry);
        }
        res =  res.reverse();
        String m = "";
        for(int i = 0 ; i < res.length() ; i++){
            m += res.charAt(i);
        }
        return m;
    }
}
