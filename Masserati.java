package Cars_UML;

import javax.sound.sampled.SourceDataLine;

public class Masserati extends Car{
   
    private int year;
    private String designer;

    public Masserati(String color, int speed, Engine motor, int year, String designer){
        super(color, speed, motor);
        this.year= year;
        this.designer=designer;
    }

    public void MaseratiStartDemo(){
        System.out.println("Overview: Designer= "+this.designer+" Production="+year);
        super.carInfo();
        super.startEngine();
    }
    public void MaseratiStopDemo(){
        System.out.println("Overview: Designer= "+this.designer+" Production="+year);
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
