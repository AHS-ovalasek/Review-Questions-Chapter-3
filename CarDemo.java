/**
 * Owen Valasek
 * CH3PC2 Car Class
 * Programming III - AP CS
 * 9/28/18
 */
public class CarDemo {

    public static void main(String[] args) {
        Car Ford = new Car(2001, "Ford Focus", 50);
        
        int yM;
        String make;
        int s;
        
        System.out.println(Ford.getSpeed());
        Ford.accelerate();
        System.out.println(Ford.getSpeed());
        Ford.accelerate();
        System.out.println(Ford.getSpeed());
        Ford.accelerate();
        System.out.println(Ford.getSpeed());
        Ford.accelerate();
        System.out.println(Ford.getSpeed());
        Ford.accelerate();
        System.out.println(Ford.getSpeed());
        
        Ford.brake();
        System.out.println(Ford.getSpeed());
        Ford.brake();
        System.out.println(Ford.getSpeed());
        Ford.brake();
        System.out.println(Ford.getSpeed());
        Ford.brake();
        System.out.println(Ford.getSpeed());
        Ford.brake();
        System.out.println(Ford.getSpeed());
    }

}
