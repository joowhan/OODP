public class MotObserver implements Observer {
    private String log="";
    public void update(String status){
        log =status;
        if(status.equals("reducedMotorPower")){
            System.out.println("Electric Motor Log/Observer: Suggesting Motor Battery Power Checking");
        }
        else if (status.equals("irregularMotorPower")){
            System.out.println("Electric Motor Log/Observer: Suggesting Motor Brush Contact");
        }
        else if (status.equals("vibratingMotor")){
            System.out.println("Electric Motor Log/Observer: Suggesting Motor Mounting Bolt Checking");
        }
        else{
            System.out.println("Electric Motor Log/Observer: Motor Running OK");
        }
    }
    public String getLog(){
        return log;
    }
    public void update_sr(String status){
        if(status.equals("reducedMotorPower")){
            System.out.println("Electric Motor Log/Observer: Repairing Reduced Motor Power status");
        }
        else if (status.equals("irregularMotorPower")){
            System.out.println("Electric Motor Log/Observer: Repairing Irregular Motor Power Warning");
        }
        else if (status.equals("vibratingMotor")){
            System.out.println("Electric Motor Log/Observer: Repairing Car Vibration with Motor");
        }
        else{
            System.out.println("Electric Motor Log/Observer: Motor status OK");
        }
    }
    public void update_sw(String status){
        if(status.equals("reducedMotorPower")){
            System.out.println("Electric Motor Log/Observer: Resetting the SW for Reduced Motor Power Monitoring");
        }
        else if (status.equals("irregularMotorPower")){
            System.out.println("Electric Motor Log/Observer: Software Resetting with Motor Power Monitoring Module for Irregular Motor Power Warning");
        }
        else if (status.equals("vibratingMotor")){
            System.out.println("Electric Motor Log/Observer: Resetting the Monitoring SW for Car Vibration with Motor Action");
        }
        else{
            System.out.println("Electric Motor Log/Observer: Keep Curren SW Monitoring Module for Motor");
        }
    }
}
