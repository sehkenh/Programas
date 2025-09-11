class Box9{
    double width;
    double height;
    double depth;

    Box9(Box9 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box9(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box9(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box9(double len){
        width = height = depth = len;
    }

    double volume(){//Do not forget to use return in methods
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        Box9 mybox1 = new Box9(10,20,15);
        Box9 mybox2 = new Box9();
        Box9 mybox3 = new Box9(7);

        Box9 myclone = new Box9(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);

        vol = mybox3.volume();
        System.out.println(vol);

        vol = myclone.volume();
        System.out.println(vol);
    }
}
