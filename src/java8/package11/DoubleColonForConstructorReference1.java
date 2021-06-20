package java8.package11;

public class DoubleColonForConstructorReference1 {
    public static void main(String[] args) {

        //Student st = new Student();                  //Here it will call default constructor of Student

//lambda
        functionalReference fr1 = () ->
                new Student();                          //implementation of functional interface's method and then call
        fr1.getStudent();

//constructor reference
        functionalReference fr2 = Student::new;         //implementation of functional interface's method and then call
        fr2.getStudent();
    }
}

interface functionalReference {
    Student getStudent();
}

/*
Here also concept is simple, first provide implementation for functional interface and then call it's method.
The only difference here is instead of generic method implementation we are creating Student's object in method implementation
and then call it's method as old concept.

The main thing which we have to remember here is, if we create object of Student here directly using Student class reference
then it will provide implementation of constructor here only.(in our example we are printing a line)
But while providing implementation of function interface using lambda/double colon, we are just creating implementation
and then putting it's reference as method reference to functional interface, it will actually create object when we will
call functional method.
*/