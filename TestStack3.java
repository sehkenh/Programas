// Improved stack class that uses the length array member.
class Stack4 {
    private int[] stck;
    private int tos;

    //allocate and initialize stack
    Stack4(int size){
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item){
        if(tos == stck.length-1){
            System.out.println("Stack is full");
        }
        else{
            stck[++tos] = item;
        }
    }

    //Pop an item from the stack
    int pop(){
        if(tos < 0){
            System.out.println("Stack is underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class TestStack3 {
    public static void main(String[] args) {
        Stack4 mystack1 = new Stack4(5);
        Stack4 mystack2 = new Stack4(8);

        for(int i = 0; i < 5; i++) mystack1.push(i);
        for(int i = 0; i < 8; i++) mystack2.push(i);

        for(int i = 0; i < 5; i++) {
            System.out.println("Popped " + mystack1.pop());
        }

        for(int i = 0; i < 8; i++) {
            System.out.println("Popped " + mystack2.pop());
        }

    }
}
