//This program includes a method inside the box class.

class Box3{ //Main class
    double width;
    double height;
    double depth;

    //Display volume of the box. This is the method within the main class Box3
    void volume(){ //Actually, the method is like "main", in others programming languages is called function.
        System.out.print("Volume is ");
        System.out.println(width*height*depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        //assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //assign different values to mybox2's instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //Display volume of first box
        mybox1.volume();

        //Display volume of 2nd box
        mybox2.volume();
    }
}
