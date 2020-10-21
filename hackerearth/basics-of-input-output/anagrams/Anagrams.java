import java.util.*;

class Anagrams {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int j=0; j<t; j++) {
            String a = in.next();
            String b = in.next();
            int[] aletters = new int[26];
            int[] bletters = new int[26];
            int count = 0;

            int i = 0;
            while(i < a.length()) {
                aletters[a.charAt(i)-'a']++;
                i++;
            }
            i=0;
            while(i < b.length()){
                bletters[b.charAt(i)-'a']++;
                i++;
            }

            for(i=0; i<26; i++) {
                if(aletters[i] > bletters[i]) 
                    count += aletters[i] - bletters[i];
                else if(bletters[i] > aletters[i])
                    count += bletters[i] - aletters[i];
            }
            System.out.println(count);
        }
    }
}
