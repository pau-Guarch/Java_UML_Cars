package Cars_UML;


public class Seat extends Car{

    private String distributor;

    public Seat(String color, int speed, Engine motor, String distributor){
        super(color, speed, motor);
        this.distributor=distributor;
    }

    public void SeatStartDemo(){
        System.out.println("Overview: Distributor= "+this.distributor+".");
        super.carInfo();
        super.startEngine();
    }
    public void SeatStopDemo(){
        System.out.println("Overview: Distributor= "+this.distributor+".");
        super.carInfo();
        super.stopEngine();
    }

    public void setMotor(Engine motor) {
        super.setMotor(motor);
    }
   
    public Engine getMotor() {
        return super.getMotor();
    }

}
