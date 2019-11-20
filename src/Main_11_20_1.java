import java.util.Arrays;
import java.util.Scanner;

public class Main_11_20_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
          int []arr = new int[10];
          int k = 0 ;
          for(int i = 0 ;  i < s.length(); i++){
              if(s.charAt(i)!= ' '&& k < 10) {
                  arr[k++] = s.charAt(i)-'0';
              }
          }
          StringBuilder res = new StringBuilder();
          int min = 0;
          for(int i = 1 ; i < arr.length ; i++){
              if(arr[i]!=0){
                  min = i ;
                  arr[i]--;
                  break;
              }
          }
          if(min == 0 ){
              System.out.println(0);
              return;
          }
          res.append(min);
          for(int i = 0; i < arr.length ; i++){
              for(int j = 0 ; j < arr[i];j++) {
                  res.append(i);
              }
          }
            System.out.println(res);
        }
    }
}
