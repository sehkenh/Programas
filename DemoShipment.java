//Extend BoxWeight to include shipping costs.

//Start with Box

class Box12{
    private double width;
    private double height;
    private double depth;

    //construct clone of an object

    Box12(Box12 ob){//pass object to constructor
      width = ob.width;
      height = ob.height;
      depth = ob.depth;
    }

    //constructor used when all dimensions specified

    Box12(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //constructor used when no dimensions specified

    Box12(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //Constructor used when cube is created

    Box12(double len){
        width = height = depth = len;
    }

    //compute and return volume

    double volume(){
        return width * height * depth;
    }
}

//Add weight
class BoxWeight3 extends Box12{
    double weight;//weight of box

    //construct clone of an object

    BoxWeight3(BoxWeight3 ob){
        super(ob);
        weight = ob.weight;
    }

    //constructor when all parameters are specified
    BoxWeight3(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    //default constructor
    BoxWeight3(){
        super();
        weight = -1;
    }

    //constructor used when sube is created
    BoxWeight3(double len, double m){
        super(len);//Here it takes len from the superclass
        weight = m;
    }
}

//Add shipping costs.
class Shipment extends BoxWeight3{
    double cost;

    //Construct clone of an object

    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    //constructor when all parameters are specified

    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    // default constructor

    Shipment(){
        super();
        cost = -1;
    }

    //Constructor used when cube is created

    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println(vol);
        System.out.println(shipment1.weight);
        System.out.println("$" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println(vol);
        System.out.println(shipment2.weight);
        System.out.println("$" + shipment2.cost);
        System.out.println();
    }
}
