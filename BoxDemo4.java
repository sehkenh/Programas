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
        mybox1.height = 10;
        mybox1.depth = 10;

        vol= mybox1.volume();
        System.out.println(vol);
    }
}
