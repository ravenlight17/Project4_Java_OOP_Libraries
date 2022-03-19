public class SmartPhone {

    String manufacturer;    // company
    String model;            // specific model
    String os;    // operating system android, ios, linux...
    int memory;            // memory in GB
    String color;            // primary color
    int cameraLenses;        // number of camera lenses
    double price;            // how much does it cost
    double screenSize;       //Size of the phone display


    //Constructor code that runs when an instance of this class is created.
    public SmartPhone(String manufacturer, String model, String os, int memory,
                      String color, int cameraLenses, double price,
                      double screenSize) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.cameraLenses = cameraLenses;
        this.price = price;
        this.screenSize = screenSize;
    }

    //Method used to display all the values in a smartphone object created
    @Override
    public String toString() {
      return "--------------------" +
       "Manufacturer: " + manufacturer +
        "Model: " + model +
        "Operating System: " + os +
        "Storage: " + memory +
        "Color: " + color +
        "Number of Camera Lenses: " + cameraLenses +
        "Price: " + price +
        "Screen Size: " + screenSize;


    }

    //Returns the Operating System:
    public String getType() {
        return this.os;
    }

//     This method will display all the values in any Smartphone object that we create.
    public String print() {
        return
                ("--------------------\n " +
                        "Manufacturer: " + this.manufacturer +
                        "\n Model: " + this.model +
                        "\n Operating System: " + this.os +
                        "\n Storage: " + this.memory +
                        "\n Color: " + this.color +
                        "\n Number of Camera Lenses: " + this.cameraLenses +
                        "\n Price: " + this.price +
                        "\n Screen Size: " + this.screenSize);
    }



}
