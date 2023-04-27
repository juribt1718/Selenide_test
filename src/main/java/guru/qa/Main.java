package guru.qa;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!! " + "\n");
        //Arithmetic operations
        int aInt = 5/3;
        int bInt =5%3;
        int a=12,b=40;
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a / b = "+(a/b));
        System.out.println("b / a = "+(b/a));

        //int and double types
        System.out.println("Let's play with int and double types");
        int i1 = 100;
        double d1 = 1.5;
        System.out.println("int i = "+i1);
        System.out.println("double d = "+d1);
        System.out.println("i + d = "+(i1+d1));
        System.out.println("i / d = "+(i1/d1));
        System.out.println("i * d = "+(i1*d1));
        //Переполнение
        byte BigByte = Byte.MAX_VALUE;
        System.out.println("Byte max value: "+BigByte);
        int int2 = Integer.MAX_VALUE;
        int2 ++;
        System.out.println("Int max value: "+int2);

        String y = "Yuri";
        System.out.println("Деление 5/3 =" + aInt +"\n");
        System.out.println("Остаток от деления 5/3 =" + bInt +"\n");
        System.out.println("Boolean operations " +(3>2) + " " +(3==3) +  "\n");

        if (y instanceof String){
            System.out.println("This is really String!!\n");
        };
        Integer arg = 42;
        printInt(arg);
    }
    public static void printInt(int arg){
        System.out.println("### printInt: " + arg +"\n");

    }
}
