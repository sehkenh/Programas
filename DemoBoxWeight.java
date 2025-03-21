//This program uses inheritance to extend box

class Box10{
    double width;
    double height;
    double depth;

    //Construct clone of an object

    Box10(Box10 ob) {//pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //Constructor used when all dimensions specified

    Box10(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Constructor used when no dimensions specified
    Box10() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //Constructor used when cube is created

    Box10(double len) {
        width = height = depth = len;
    }

    //Compute and return volume
    double volume() {
        return width * height * depth;
    }
}

//Here, Box is extended to include weight.

class BoxWeight extends Box10 {
    double weight; //weight of box

    //Constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);
    }
}
