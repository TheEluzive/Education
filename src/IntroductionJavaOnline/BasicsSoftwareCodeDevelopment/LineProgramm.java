package IntroductionJavaOnline.BasicsSoftwareCodeDevelopment;

public class LineProgramm {
    public static void main(String[] args) {

        System.out.println(first(8,2,1));
        System.out.println(second(3, 2, 1));
    }

    public static int first(int a, int b, int c){
        return (a-3)*b/2+c;
    }

    public static double second(int a, int b, int c){
        return (b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a - Math.pow(a,3)*c - 1/Math.pow(b,2);
    }
}
