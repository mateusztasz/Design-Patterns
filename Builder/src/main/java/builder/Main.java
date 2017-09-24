package builder;

// 1) First of all you need to create a static nested class and then copy all the arguments from the outer
//    class to the Main class. We should follow the naming convention and if the class name is Computer
//    then builder class should be named as ComputerBuilder.
//
// 2) Java Main class should have a public constructor with all the required attributes as parameters.
//
// 3) Java Main class should have methods to set the optional parameters and it should return the same
//    Main object after setting the optional attribute.
//
// 4) The final step is to provide a build() method in the builder class that will return the Object needed
//    by client program. For this we need to have a private constructor in the Class with Main class as argument.
//

public class Main {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(comp);
    }
}
