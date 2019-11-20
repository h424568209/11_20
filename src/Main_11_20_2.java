import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_11_20_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            String s = GetSequeOddNum(num);
            System.out.println(s);
        }
    }

    private static String GetSequeOddNum(int num) {
        StringBuilder res = new StringBuilder();
        if(num == 1){
            return "1";
        }
        if(num == 0){
            return "0";
        }
        int n = (int) Math.pow(num,3);
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1 ; i < n ; i+=2 ){
            queue.add(i);
            sum += i;
          while(sum > n){
             sum -=  queue.poll();
          }
          if(sum == n && queue.size() == num){
              break;
          }

        }

        while(!queue.isEmpty()){
            res.append(queue.poll()).append("+");
        }
        res.deleteCharAt(res.length()-1);
        return  res.toString();
    }
}
