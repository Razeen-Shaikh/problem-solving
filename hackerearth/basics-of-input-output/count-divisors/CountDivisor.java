import java.util.*;

public class CountDivisor {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt(), r = in.nextInt(), k = in.nextInt();
        int count = 0;
        if((l >= 1 && l <= 1000) && (r >= 1 && r <= 1000) && (k >= 1 && k <= 1000)) {
            for(int i = l; i <= r; i++) {
                if(i % k == 0) count++;
            }
            System.out.println(count);
        }
    }
}