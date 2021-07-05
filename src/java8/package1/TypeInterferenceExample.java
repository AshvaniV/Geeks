package java8.package1;

public class TypeInterferenceExample {
    public static void main(String[] args) {
        //Generic way to write lambda to find String length
        ICalculateStringLength LengthLambda = (String S) -> S.length();
        //we can reduce length of above code as below
        //ICalculateStringLength LengthLambda = S -> S.length();
        // this is similar to above line just more improved way to write
        //ICalculateStringLength LengthLambda = String::length;
        System.out.println(LengthLambda.getLength("India is a great country"));
    }

    interface ICalculateStringLength {
        int getLength(String S);
    }
}
//Type inferring is the ability of compiler to find what is the input argument type,
//  what is the return type. we reduce code length using this property