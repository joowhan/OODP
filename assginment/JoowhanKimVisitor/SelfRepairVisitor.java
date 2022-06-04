public class SelfRepairVisitor extends Visitor {

    public void visit(ElectricMotor motor) {
        String status="";
        status = StatusTracker.statusTracker().motorCheck();
        System.out.println("==M: Self Repairing on "+ motor.toString());
        if(status.equals("reducedMotorPower")){
            System.out.println("Exchange Motor Battery Pack for " + motor.toString());
        }
        else if (status.equals("irregularMotorPower")){
            System.out.println("Apply oil to motor brush contact of " + motor.toString());
        }
        else if (status.equals("vibratingMotor")){
            System.out.println("Turn Tightly Motor Mounting Bolt of " + motor.toString());
        }
        else{
        }
       motor.notifyObserver_sr(status);
    }

    public void visit(RegenerativeBrake brake) {
        String status="";
        status = StatusTracker.statusTracker().regenBrakeCheck();
        System.out.println("==B: Self Repairing on "+ brake.toString());
        if(status.equals("weakElectric")){
            System.out.println("Use an extra generator system for " + brake.toString());
        }
        else if (status.equals("noElectric")){
            System.out.println("Apply Oil to Brake Generator Contact Point of " + brake.toString());
        }
        else if (status.equals("abnormalSpeedDecrease")){
            System.out.println("Monitoring Brake and Generator Gear of " + brake.toString());
        }
        else{
        }
       brake.notifyObserver_sr(status);
    }

    public void visit(Engine engine) {
        String estatus="";
        estatus = StatusTracker.statusTracker().engineCheck();
        System.out.println("==E: Self Repairing on "+ engine.toString());
        if(estatus.equals("oil")){
            System.out.println("Exchange oil for " + engine.toString());
        }
        else if (estatus.equals("irregularPower")){
            System.out.println("Self clean the spark plug of " + engine.toString());
        }
        //Factory
        else if (estatus.equals("reducedPower")){
            System.out.println("Supply more power from extra battery pack for " + engine.toString());
            AbstractFactory engineFactory1 = new Factory();
            Message message1 = engineFactory1.getMessage("reducedPower");
            message1.printer();
        }
        else{

        }
       engine.notifyObserver_sr(estatus);
    }
}
