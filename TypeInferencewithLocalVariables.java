public class TypeInferencewithLocalVariables {
}
/*
    Beginning with JDK 10, it is now possible to let the compiler infer
    the type of local variable based on the type of its initializer.

    double avg = 10.0;

    var avg = 10.0;

    Local variable type inference has become a common part of the contemporary programming environment.

    int var = 1; in this case, var is simply a user-defined identifier.

    var myArray = new int [10] VALID.

    var[] myArray = new int [10] WRONG!
    var myArray[] = new int [10] WRONG!
    var counter; WRONG!, no initializer.

    ### Using the full declaration syntax also makes it very clear at glance            ###
    ### what type of variable is being created, which is important for the sample code. ###
 */
