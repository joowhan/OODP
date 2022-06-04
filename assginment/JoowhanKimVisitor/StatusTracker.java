import java.util.Random;
public class StatusTracker {
    
    private String engine = "";
    private String motor = "";
    private String brake = "";
    Random rand = new Random();
    int num = 4;
    private int ran1 = rand.nextInt(num)+1;
    private int ran2 = rand.nextInt(num)+1;
    private int ran3 = rand.nextInt(num)+1;
    private static StatusTracker singleton = new StatusTracker();
    private StatusTracker(){      
    }
    public static StatusTracker statusTracker(){
        return singleton;
    }

    public String engineCheck(){
        if(ran1==1) engine = "oil";
        else if(ran1 ==2) engine = "irregularPower";
        else if(ran1 ==3) engine = "reducedPower";
        else engine = "OK";
        return engine;
    }
    public String motorCheck(){
        if(ran2==1) motor = "reducedMotorPower";
        else if(ran2 ==2) motor = "irregularMotorPower";
        else if(ran2 ==3) motor = "vibratingMotor";
        else motor = "OK";
        return motor;
    }
    public String regenBrakeCheck(){
        if(ran3==1) brake = "weakElectric";
        else if(ran3 ==2) brake = "noElectric";
        else if(ran3 ==3) brake = "abnormalSpeedDecrease";
        else motor = "OK";
        return brake;
    }
}
