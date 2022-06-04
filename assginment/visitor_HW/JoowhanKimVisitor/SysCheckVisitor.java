
public class SysCheckVisitor extends Visitor {

    public void visit(ElectricMotor motor) {
        String status="";
        status = StatusTracker.statusTracker().motorCheck();
        System.out.println("=M: Systen/Component Checking on "+ motor.toString());
        if(status.equals("reducedMotorPower")){
            System.out.println("Motor Power Reduced with " + motor.toString());
        }
        else if (status.equals("irregularMotorPower")){
            System.out.println("Irregular Motor Power with " + motor.toString());
        }
        else if (status.equals("vibratingMotor")){
            System.out.println("Can Vibration with " + motor.toString());
        }
        else{
            System.out.println("Normal Motor Power");
        }
       motor.notifyObserver(status);
    }

    public void visit(RegenerativeBrake brake) {
        String status="";
        status = StatusTracker.statusTracker().regenBrakeCheck();
        System.out.println("=B: Systen/Component Checking on "+ brake.toString());
        if(status.equals("weakElectric")){
            System.out.println("Weak Generative Electricity with " + brake.toString());
        }
        else if (status.equals("noElectric")){
            System.out.println("No Electrictiry Generated with " + brake.toString());
        }
        else if (status.equals("abnormalSpeedDecrease")){
            System.out.println("Abnormal Speed Decrease with " + brake.toString());
        }
        else{
            System.out.println("Normal Regen. Brake Working with "+ brake.toString());
        }
       brake.notifyObserver(status);
    }

    public void visit(Engine engine) {
        String estatus="";
        estatus = StatusTracker.statusTracker().engineCheck();
        System.out.println("=E: Systen/Component Checking on Gasoline Engine");
        if(estatus.equals("oil")){
            System.out.println("Engine Oil To Be Checked on " + engine.toString());
        }
        else if (estatus.equals("irregularPower")){
            System.out.println("Irregular Engine Power with " + engine.toString());
        }
        else if (estatus.equals("reducedPower")){
            System.out.println("Engine Power Reduced with " + engine.toString());
        }
        else{

        }
       engine.notifyObserver(estatus);
    }
}

