import java.util.Scanner ;
class Factorial {
    public long calc(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
class ECalculator {
    public double compute ( int n ){
        Factorial fact = new Factorial () ;
        double e = 1.0 ;
        for ( int i = 1 ; i <= n ; i++ ) {
            e += 1.0 / fact.calc(i);
        }
        return e ;
    }
}

public class Main {
    public static void main ( String[] args ){
        Scanner sc = new Scanner(System.in)  ;
        int n = sc.nextInt() ;
        ECalculator calc = new ECalculator() ;
        double result = calc.compute(n ) ;
        System.out.printf("%.2f" , result ) ;
    }

}