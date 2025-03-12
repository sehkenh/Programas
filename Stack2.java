class Stack2 {
    private int [] stck = new int [10];
    private int tos;

    Stack2() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class TestStack2 {
    public static void main(String[] args) {
        Stack2 mystack1 = new Stack2();
        Stack2 mystack2 = new Stack2();

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Popping elements from mystack1" + mystack1.pop());
        System.out.println("Popping elements from mystack2" + mystack2.pop());

//        mystack1.tos =-2;
//        mystack2.stck[3] = 100;
    }
}