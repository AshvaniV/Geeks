//Program for Fibonacci numbers : Given a number n, print n-th Fibonacci Number
 //DP: optimized solution of recursive solution
package ds02.dp.level1;

public class DP1 {

    private static int printFibonacciUsingRecursion(int num){
        if(num <= 1)
            return num;
        return printFibonacciUsingRecursion(num-1) + printFibonacciUsingRecursion(num-2);
    }

    private static int printFibonacciUsingDP(int num) {
        int[] store = new int[num +1];
        store[0] = 0;
        store[1] = 1;
        for(int i = 2; i <=num;i++){
            store[i] = store[i-1]+store[i-2];
        }
        return store[num];
    }


    public static void main(String[] args) {
        int num = 5;
        System.out.println(printFibonacciUsingDP(num));

    }
}
/*
                            fib(5)
                      /              \
               fib(4)                 fib(3)
             /        \              /       \
         fib(3)      fib(2)          fib(2)   fib(1)
        /    \       /    \         /      \
  fib(2)   fib(1)  fib(1) fib(0)  fib(1) fib(0)
  /     \
fib(1) fib(0)




We have 2 analysis here which can be used to solve this question by DP
=> A big problem is dividing into several sub problems.
=> We have a solution for sub problem which is repeating in recursive solution ex:
in recursive solution we are calculating fib(2) 3 times, in DP we are calculating it once and saving it to use later

 */