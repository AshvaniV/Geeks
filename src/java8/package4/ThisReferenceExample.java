package java8.package4;

/*This class is to demonstrate the use of 'this' keyword in java7 with anonymous inner class and java8 lambda.
* this keyword represents an instance related values not class related values so can't be accessed from static methods*/

public class ThisReferenceExample implements Process{
    @Override
    public void process(int i) {
        System.out.println("Value of i is "+i);
    }

    public void doProcess(int i, Process P) {
        P.process(i);
    }

    public void execute() {
        doProcess(50, (i) -> {
            System.out.println("the value of i in execute() "+i);
            System.out.println("the value of this keyword in execute() " +this);
        });
    }



    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        //java 7 start
      /*  thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
*//*even though main() is static method, this is accessible here, because 'this' is getting used in anonymous inner class*//*
                System.out.println("the value of this is "+this);
            }
        });*/
        //java7 end

        //java8 start
        thisReferenceExample.doProcess(20, (i) -> System.out.println("yes i am in lambda expression "));
 /*lambda expression doesn't override 'this' reference keyword like anonymous inner class so we can't use it. here 'this'
 * keyword is not getting override as in anonymous inner class concept. It is still referring to static main() method,
 * from where actually we are using it.
 * But if we have another method in this class like execute() which is getting called from main and there we are calling
 * doProcess() method then there we can use 'this' keyword which will indicate ThisReferenceExample's object */
        //thisReferenceExample.doProcess(20, (i) -> System.out.println("the value of this is "+this));
        thisReferenceExample.execute();
    }
}
