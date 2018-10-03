/**
 * Owen Valasek
 * CH3PC3 Personal Info Class
 * 10/3/18
 */
public class PersonalInfo {
    //declare the fields
    private String name;
    private String address;
    private String phoneNumber;
    //create the constructor
    /**
     * Personal Info constructor initializes name, address
     * And phoneNumber fields
     */
    public PersonalInfo(String n, String a, String pN){
        name = n;
        address = a;
        phoneNumber = pN;
    }
    //create the accessor and mutator methods
    /**
     * The setName method accepts an argument that is stored 
     * In the Name field
     */
    public void setName(String n){
        name = n;
    }
    /**
     * The setAddress method accepts an argument that is stored
     * In the Address field
     */
    public void setAddress(String a){
        address = a;
    }
    /**
     * The setPhoneNumber method accepts an argument that is stored 
     * In the PhoneNumber field
     */
    public void setPhoneNumber(String pN){
        phoneNumber = pN;
    }
    /**
     * The getName method returns the value of the Name methods
     */
    public String getName(){
        return name;
    }
    /**
     * The getAddress method returns the value of the Address methods
     */
    public String getAddress(){
        return address;
    }
    /**
     * The getPhoneNumber method returns the value of the phoneNumber methods
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
