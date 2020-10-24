import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeightedMean {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double msum = 0;
        double sum = 0;
        List<Double> X = new ArrayList<>();
        List<Double> W = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            X.add(in.nextDouble());
        }
        for (int i = 0; i < N; i++) {
            W.add(in.nextDouble());
        }
        for (int i = 0; i < N; i++) {
            msum += (X.get(i) * W.get(i));
            sum += W.get(i);
        }
        double wmean = msum / sum;
        System.out.printf("%.1f", wmean);
    }
}