package day_06.d16_LinkedList_ๆจกๆ้ๅ;

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
