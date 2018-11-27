package Practice5;

//Create a three-level hierarchy of exceptions. Now create a base-class A with a method that throws an exception at the base of your hierarchy.
// Inherit B from A and override the method so it throws an exception at level two of your hierarchy.
// Repeat by inheriting class C from B. In main(), create a C and upcast it to A, then call the method.

public class ExceptionsHierarchy {

    public static void main(String[] args){
        A array[] = {new A(), new B(), new C()};
        for (A elem : array) {
            elem.catchExp();
        }
        C c = new C();
        ((A) c).catchExp();


    }
}
