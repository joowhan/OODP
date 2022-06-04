public class BrakeObserver implements Observer{
    private String log="";
    public void update(String status){
        log = status;
        if(status.equals("weakElectric")){
            System.out.println("Suggesting Generator Coil Damage Checking");
        }
        else if (status.equals("noElectric")){
            System.out.println("Suggesting Brake Generator Contact Checking");
        }
        else if (status.equals("abnormalSpeedDecrease")){
            System.out.println("Suggesting Brake and Generator Gear Checking");
        }
        else{
            System.out.println("Regen. Brake Working OK");
        }
    }
    public String getLog(){
        return log;
    }
    public void update_sr(String status){
        if(status.equals("weakElectric")){
            System.out.println("Regenerative Brake System Log/Observer: Repairing Generator Coil Damage for Regenerative Brake System");
        }
        else if (status.equals("noElectric")){
            System.out.println("Regenerative Brake System Log/Observer: Repairing No Electircity Generated for Regenerative Brake System");
        }
        else if (status.equals("abnormalSpeedDecrease")){
            System.out.println("Regenerative Brake System Log/Observer: Repairing Abnormal Speed Decrease with Regenerative Brake System");
        }
        else{
            System.out.println("Regenerative Brake System Log/Observer: Regenerative Brake System OK");
        }
    }
    public void update_sw(String status){
        if(status.equals("weakElectric")){
            System.out.println("Regenerative Brake System Log/Observer: Resetting Coil Damage Monitoring SW for Regenerative Brake System");
        }
        else if (status.equals("noElectric")){
            System.out.println("Regenerative Brake System Log/Observer: Resetting Electricity Monitoring Sw for Regenerative Brake System");
        }
        else if (status.equals("abnormalSpeedDecrease")){
            System.out.println("Regenerative Brake System Log/Observer: Resetting Speed Monitoring SW with Regenerative Brake System");
        }
        else{
            System.out.println("Regenerative Brake System Log/Observer: Keep Current SW Monitoring Module for Regenerative Brake System");
        }
    }
}
