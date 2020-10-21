import java.util.*;

class Zoos {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = s;
        int countZ = 0, countO = 0;

        if(t.length() <= 20) {
            for(int i=0; i<t.length(); i++) {
                if(t.charAt(i) == 122 || t.charAt(i) == 90) countZ++;
                else if(t.charAt(i) == 111 || t.charAt(i) == 79) countO++;
            }
        }
        if(countO == 2*countZ) System.out.println("Yes");
        else System.out.println("No");
    }
}