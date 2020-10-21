import java.util.*;

class ToggleString {
    public static void main(String args[] ) throws Exception {
       Scanner in = new Scanner(System.in);
       String S = in.next();
       String s = S, toggle = "";

       for(int i = 0; i < s.length(); i++) {
           if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
               String x = "";
               x += s.charAt(i);
               toggle += x.toLowerCase();
           } else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
               String x = "";
               x += s.charAt(i);
               toggle += x.toUpperCase();
           }
        }
        System.out.println(toggle);
    }
}