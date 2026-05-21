package exercises.hackerrank;



public class Day02HackerRankJavaLoops2 {
    public static void main(String[] args) {
        for (int n = 1; n < 9999999; n++) {
           double firstEquation = 0 + 1 * 2;
            int n1 = n - 1;
            double secondEquation = Math.pow(2,n1) * 2;
            System.out.println(firstEquation + secondEquation);
        }

    }

}
