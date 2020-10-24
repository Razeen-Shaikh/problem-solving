import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StandardDeviation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double sdsum = 0;
        int N = in.nextInt();
        List<Double> X = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            X.add(in.nextDouble());
            sum += X.get(i);
        }
        double mean = sum / N;
        for (int i = 0; i < N; i++) {
            sdsum += ((X.get(i) - mean) * (X.get(i) - mean));
        }
        double sd = sdsum / N;
        System.out.printf("%.1f", Math.sqrt(sd));
    }
}