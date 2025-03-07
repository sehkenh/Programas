/*

    Here, Box uses a constructor to initialize the dimensions of a box.

 */
class Box6{
    double width;
    double height;
    double depth;

    Box6(){
        System.out.println("Creating Box...");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume(){
        return width*height*depth;
    }
}
public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();

        double vol;

        vol = mybox1.volume();
        System.out.println(vol);
    }
}
