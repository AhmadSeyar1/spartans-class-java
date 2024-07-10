package week_11.day_3;

public class StackAndHeap {

    /*
    Think of the heap as a large warehouse where you can store items for long duration.
    These items can be of various sizes, and they can stay there as long as needed.
    The stack, on the other hand, is like a backpack you carry. You can quickly put in and
    take out items (like when you're hiking), but it's limited in space, and you only keep
    what you immediately need.

    Programming Explanation:
    In Java, memory management primarily occurs in two main areas: the Heap and Stack.
    They serve different purposes and have distinct characteristics:

    Heap:
    1. Storage: All object instances and arrays are stored in the heap.
    2. The lifetime of objects in the heap is not automatically managed. Once no
    references point to an object, it becomes eligible for garbage collection, but it
    is not immediately destroyed.
    3. Size: Typically larger than the stack. Its size can be adjusted with JVM parameters

    Stack:
    1. Storage: Local variables, primitive data types, and method call references are
    stored in the stack.
    2. Lifetime: Variables in the stack exist only within the scope of the block of code
    in which they are defined. Once the execution scope (e.g., method) exists, those
    variables are automatically destroyed.
    3. Size: Limited in size and typically smaller than the heap. An overflow of the
    stack (due to, say, an unchecked recursion) can lead to a StackOverflowError.

     */
}
