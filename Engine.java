package Cars_UML;

public class Engine {
    private boolean state;

    public Engine(boolean state){
        this.state = state;
    }

    public void startEngine(){
        this.state=true;
    }
    public void stopEngine(){
        this.state=false;
    }
    public boolean getState(){
        return this.state;
    }
    
}
