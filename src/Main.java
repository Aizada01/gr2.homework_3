import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] fractionalNumber = {6.1, -8.3, 4.5, 7.2, -6.6, 2.3, 14.7, -5.7, 3.9, -6.4, -1.1, -7.8, 11.6, 2.3, 15.4};
        double average = 0.0;
        int count = 0;
        for(int i = 0; i < fractionalNumber.length; i++ ){
          if (fractionalNumber[i] < 0) {
              for (int i1 = i + 1; i < fractionalNumber.length; i++) {
                  if (fractionalNumber [i] > 0) {
                      average += fractionalNumber[i];
                      count ++;}
              }
                  }
              }
                System.out.println(+ average/count);
    }
        }

        