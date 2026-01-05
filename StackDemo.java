class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    
    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

   
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
        System.out.println(item + " pushed into stack");
    }

   
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

  
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    
    public boolean isEmpty() {
        return top == -1;
    }
}


public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Is stack empty? " + s.isEmpty());
    }
}
