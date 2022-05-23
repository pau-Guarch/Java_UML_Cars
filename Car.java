package Cars_UML;

public class Car {

    private String color;
    private int speed;
    private Engine motor;

    public Car(String color, int speed, Engine motor){
        this.color = color;
        this.speed=speed;
        this.motor=motor;
    }

    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setMotor(Engine motor) {
        this.motor = motor;
    }
    public Engine getMotor() {
        return motor;
    }
    public void carInfo(){
        System.out.println("Car Info: Car color= "+this.color+" Ax Speed= "+this.speed+" Km.");
    }
    public void startEngine(){
        this.motor.startEngine();
        System.out.println("Started: "+this.motor.getState());
        System.out.println("Stopped: "+!this.motor.getState());
    }
    public void stopEngine(){
        this.motor.stopEngine();
        if(!this.motor.getState()){
            System.out.println("Started: "+this.motor.getState());
            System.out.println("Stopped: "+!this.motor.getState());
        }else{
            System.out.println("Started: "+!this.motor.getState());
            System.out.println("Stopped: "+this.motor.getState());
        }
    }
}