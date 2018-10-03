/**
 *Owen Valasek
 *CH3PC2 Car Class
 * 9/28/18
 */
public class Car {
    //declar the fields
    private int yearModel;
    private String make;
    private int speed;
    //create the constructor
    /**
     * Employee class constructor initializes yearModel, make 
     * And speed fields
     */
    public Car(int yM, String m, int s){
        yearModel = yM;
        make = m;
        speed = s;
    }
    //create the accessor and mutator methods
    /**
     *The setYearModel method accepts an argument that is stored
     * In the yearModel field
     */
    public void setYearModel(int yM){
        yearModel = yM;
    }
    /**
     * The setMake method accepts an argument that is stored 
     * In  the make field
     */
    public void setMake(String m){
        make = m;
    }
    /**
     * The setSpeed method accepts an argument that is stored
     * In the speed field
     */
    public void setSpeed (int s){
        speed = s;
    }
    /**
     * The brake method subtracts 5 and returns the value stored 
     * In the Speed field
     */
    public void brake(){
        speed -= 5;
    }
    /**
     * The accelerate method adds 5 and returns the value stored 
     * In the Speed field
     */
    public void accelerate(){
        speed += 5;
    }
    /**
     * The getSpeed method returns the value of the accelerate and 
     * Brake methods
     */
    public int getSpeed(){
         return speed;
    }
}
