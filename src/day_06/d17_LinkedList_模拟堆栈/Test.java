package day_06.d17_LinkedList_模拟堆栈;

public class Test {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.add("a");
        myStack.add("b");
        myStack.add("c");


        System.out.println("myStack.get() = " + myStack.get());
        System.out.println("myStack.get() = " + myStack.get());
        System.out.println("myStack.get() = " + myStack.get());
    }
}
