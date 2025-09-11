class Box4{
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
    }
}
public class BoxDemo4 {
    public static void main(String[] args) {
        double vol;
        Box4 mybox1 = new Box4();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        vol= mybox1.volume();
        System.out.println(vol);
    }
}
/*

    The preceding program can be written a bit more efficiently because
    there is actually no need for the vol variable. The call to volume()
    could have been used in println() statement directly, as shown here:

    System.out.println("Volume is " + mybox1.volume())

*/