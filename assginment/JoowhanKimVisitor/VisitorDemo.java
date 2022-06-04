import java.io.*;
public class VisitorDemo {
    public static void main(String[] args) {
        // try {
            Observer observer1 = new EngObserver();
            Observer observer2 = new MotObserver();
            Observer observer3 = new BrakeObserver();
            ElectricMotor motor = new ElectricMotor("motor", observer2);
            RegenerativeBrake brake = new RegenerativeBrake("brake", observer3);
            Engine engine = new Engine("Gasoline Engine", observer1);
            //1st Visitor
            engine.accept(new SysCheckVisitor());
            System.out.println("");
            motor.accept(new SysCheckVisitor());
            System.out.println("");
            brake.accept(new SysCheckVisitor());
            System.out.println("\n");

            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.construct(observer1, observer2, observer3);
            String filename = htmlBuilder.getResult();
            System.out.println("PHEV Checkingus " + filename +" is made");
            System.out.println("");

            //2nd Visitor
            engine.accept(new SelfRepairVisitor());
            System.out.println("");
            motor.accept(new SelfRepairVisitor());
            System.out.println("");
            brake.accept(new SelfRepairVisitor());
            System.out.println("\n");
            //3rd Visitor
            engine.accept(new SwCtrlVisitor());
            System.out.println("");
            motor.accept(new SwCtrlVisitor());
            System.out.println("");
            brake.accept(new SwCtrlVisitor());

            String engine_status = StatusTracker.statusTracker().engineCheck();
            String motor_status = StatusTracker.statusTracker().motorCheck();
            String brake_status = StatusTracker.statusTracker().regenBrakeCheck();
            String mode = "";

            System.out.println("    Engine Status: "+ engine_status);
            System.out.println("    Engine Status: "+ motor_status);
            System.out.println("    Engine Status: "+ brake_status);
            if(engine_status.equals("OK") && !motor_status.equals("OK") && !brake_status.equals("OK")){
                mode = "Engine";
            }
            else if(!engine_status.equals("OK") && motor_status.equals("OK") && brake_status.equals("OK")){
                mode = "Electric";
            }
            else if(engine_status.equals("OK") && motor_status.equals("OK") && brake_status.equals("OK")){
                mode = "Electric";
            }
            else if(!engine_status.equals("OK") && motor_status.equals("OK")){
                mode = "Hybrid";
            }
            else if(!engine_status.equals("reducedPower") && motor_status.equals("vibratingMotor")&& brake_status.equals("abnormalSpeedDecrease")){
                mode = "Stop";
            }
            else if(engine_status.equals("OK")){
                mode = "Engine Running with Slow-Down";
            }
            else if(motor_status.equals("OK")){
                mode = "Motor Running with Slow-Down";
            }
            else{
                mode = "Engine Running with Slow-Down";
            }
            System.out.println("    Run with "+ mode+ " Mode");




            

        // } catch (FileTreatmentException e) {
        //     e.printStackTrace();
        // }
    }
}


