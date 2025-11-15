import java.util.Scanner;
import java.util.function.*;

interface Calci{
    public int Numbers(int a,int b);
}
public class Lambda_Calculator {
    public static void main(String[] args) throws MaxinputException, MaxMultiplierException, CannotDivideByZeroException, InvalidInputException {
        Calci AddNumbers=(a,b)->a+b;
        Calci SubNumbers=(a,b)->a-b;
        Calci MulNumbers=(a,b)->a*b;
        Calci DivNumbers=(a,b)->a/b;

        BiPredicate<Integer,Integer> MaxNum=(a, b)->a>=100000 || b>=100000;
        BiPredicate<Integer,Integer> MaxMul=(a,b)->a>=7000||b>=7000;
        BiPredicate<Integer,Integer> ZeroDiv=(a,b)->a==0||b==0;
        Predicate<String> WrongSign=Sign->Sign.equals("+")||Sign.equals("-")||Sign.equals("*")||Sign.equals("/");

        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose an Operator From the Given List of Operators : \n1. + for addition\n2. _ for subraction\n3. * for multiplication\n4. / for division");
        s=sc.next();

        System.out.format("Enter a number = ");
        int a=sc.nextInt();
        System.out.format("Enter another number =");
        int b=sc.nextInt();
        int c=0;

        if(MaxNum.test(a,b)){throw new MaxinputException();}
        if(s.equals("*")&&MaxMul.test(a,b)){throw new MaxMultiplierException();}
        if(ZeroDiv.test(a,b)){throw new CannotDivideByZeroException();}
        if(!WrongSign.test(s)){throw new InvalidInputException();}

        if(s.equals("+")){c= AddNumbers.Numbers(a,b);}
        if(s.equals("-")){c=SubNumbers.Numbers(a,b);}
        if(s.equals("*")){c=MulNumbers.Numbers(a,b);}
        if(s.equals("/")){c=DivNumbers.Numbers(a,b);}
        Consumer<Integer> Show=ans-> System.out.format("the answer is %d",ans);
        Show.accept(c);
    }
}
