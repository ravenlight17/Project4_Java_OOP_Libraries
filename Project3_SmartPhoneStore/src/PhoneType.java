import java.util.ArrayList;

public class PhoneType {

    // For the state of this object we need a list of smartphones
    private ArrayList<SmartPhone> MySmartPhones;


    // To construct or build our library we need to initialize the variables
    // in our state, in this case initialize `MySmartPhones` so we have an instance
    // of a list and not only the template of the list.
    public PhoneType() {
        this.MySmartPhones = new ArrayList<>();
    }

    // Then we create the behavior/functionality we want our PhoneType to have
    // We implemented a way to get phones, by passing a type to look for

    // The return type of this method is SmartPhone, because that is what
    // we get back when we call this function an instance of SmartPhone
    // and String type is the type and name of the parameter it receives
    // since this method filters by type it needs a type to filter by.
    public SmartPhone getPhoneByType(String type) {
        SmartPhone returnSmartPhone = null;

        // Go through our array trying to find the Operating System
        // Each time the program is looking at the phones in the array it is going to
        // assign it temporarily to the variable `currentBook`
        for (SmartPhone currentSmartPhone :
                this.MySmartPhones) {

            // We use currentSmartPhone to see if it matches the type we are looking for
            if (currentSmartPhone.getType().equalsIgnoreCase(type)) {
                // if the types are equal the program prints out the smartphone
                System.out.println(currentSmartPhone.print());
            }

            //if the smartphone doesn't match the type then the program is going to move on to
            // the next smartphone in the list.
        }
        return returnSmartPhone;

    }
    //Adds a new smartphone to the inventory
    public void addSmartPhone(SmartPhone smartphone) {
        this.MySmartPhones.add(smartphone);
    }

}