package Heap_Stack_JVM;

import java.util.Stack;

public class Primitive_Type {


    public static void main(String[] args) {
       String a = "Hello";
       int b = 5;
        System.out.println(System.identityHashCode(a));// get address of Object value
        System.out.println(System.identityHashCode(b));

        // Stack is a LIFO (Last In First Out) data structure
        Stack<String> name = new Stack<>();
        name.push("Phát");
        name.push("Tấn");
        name.push("Chu");

        System.out.println(name.pop());
        System.out.println(name.pop());
        System.out.println(name.pop());


//        System.out.println("Sum: " + (obj.a + obj.b));
    }
}
