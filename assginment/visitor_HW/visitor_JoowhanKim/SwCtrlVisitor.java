public class SwCtrlVisitor extends Visitor{

    public void visit(ElectricMotor motor) {
        String status="";
        status = StatusTracker.statusTracker().motorCheck();
        System.out.println("===M: Software Control and Recovery for "+ motor.toString());
        if(status.equals("reducedMotorPower")){
            System.out.println("Increase Motor Battery Pack Power Monitoring Loop for " + motor.toString());
        }
        //Factory
        else if (status.equals("irregularMotorPower")){
            //System.out.println("Generating a Motor Power Monitoring Module from the abstract Factory");
            AbstractFactory motorFactory = new Factory();
            Message message1 = motorFactory.getMessage("irregularMotorPower");
            message1.printer();
        }
        else if (status.equals("vibratingMotor")){
            System.out.println("Initiate Monitoring SW for Motor Vibration of  " + motor.toString());
        }
        else{

        }
       motor.notifyObserver_sw(status);
    }

    public void visit(RegenerativeBrake brake) {
        String status="";
        status = StatusTracker.statusTracker().regenBrakeCheck();
        System.out.println("===B: Software Control and Recovery for "+ brake.toString());
        if(status.equals("weakElectric")){
            System.out.println("Initiate the monitoring SW for Wak Electricity Problem of " + brake.toString());
        }
        else if (status.equals("noElectric")){
            System.out.println("Initiate the monitoring SW for No Eelctricity Problem from Resen. Brake ");
        }
        else if (status.equals("abnormalSpeedDecrease")){
            System.out.println("Initiate Speed monitoring SW for " + brake.toString());
        }
        else{

        }
       brake.notifyObserver_sw(status);
    }

    public void visit(Engine engine) {
        String estatus="";
        estatus = StatusTracker.statusTracker().engineCheck();
        System.out.println("===E: Software Control and Recovery for "+ engine.toString());
        if(estatus.equals("oil")){
            System.out.println("Increase the control software level of oil supply for " + engine.toString());
        }
        //Factory
        else if (estatus.equals("irregularPower")){
            System.out.println("Software Ressetting for " + engine.toString());
            AbstractFactory engineFactory = new Factory();
            Message message1 = engineFactory.getMessage("irregularPower");
            message1.printer();
        }
        else if (estatus.equals("reducedPower")){
            System.out.println("Increase minimum power level for " + engine.toString());
        }
        else{

        }
       engine.notifyObserver_sw(estatus);
    }
}
