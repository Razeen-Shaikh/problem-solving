import java.util.*;

class BricksGame {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = n;
        String name = "";
        if(n >= 1 && n <= 10000) {
            for(int i=1; i<n; i++) {
                if(t <= 0) {
                    name = "Motu";
                    break;
                }
                    t -= i;
                if(t <= 0) {
                    name = "Patlu";
                    break;
                }
                    t -=2*i;
            }
        }
        System.out.println(name);
    }
}