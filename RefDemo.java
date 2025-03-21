public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box10 plainbox = new Box10();
        double vol;

        vol = weightbox.volume();
        System.out.println(vol);
        System.out.println(weightbox.weight());
        System.out.println();

        //Assign BoxWeight reference to Box reference

        plainbox = weightbox;

        vol = plainbox.volume(); //OK, volume() defined in box
        System.out.println(vol);

        /*

            The following statement is invalid because plainbox
            does not define a weight member.

         */
//        System.out.println(plainbox.weight);
    }
}
