// Returning an object

class Test11{
    int a;

    Test11(int i){
        a = i;
    }

    Test11 incrByTen(){
        Test11 temp = new Test11(a+10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args){
         Test11 ob1 = new Test11(2);
         Test11 ob2;

         ob2 = ob1.incrByTen();
         System.out.println("ob1.a = " + ob1.a);//temp = 2
         System.out.println("ob2.a = " + ob2.a);//Add +10 to the first number

         ob1 = ob2.incrByTen();
         System.out.println("ob1.a = " + ob1.a); //Here it takes the second result an add +10
    }
}
