public class EngObserver implements Observer{
    private String log="";
    public void update(String status){
        log = status;
        if(status.equals("oil")){
            System.out.println("Gasoline Engine Log/Observer: Suggesting Oil Change");
        }
        else if (status.equals("irregularPower")){
            System.out.println("Gasoline Engine Log/Observer: Suggesting Spark Plug Checking");
        }
        else if (status.equals("reducedPower")){
            System.out.println("Gasoline Engine Log/Observer: Suggesting Battery Poser Checking");
        }
        else{
            System.out.println("Gasoline Engine Log/Observer: Engine Running OK");
        }
    }
    public String getLog(){
        return log;
    }
    public void update_sr(String status){
        if(status.equals("oil")){
            System.out.println("Gasoline Engine Log/Observer: Reparing engine oil warning");
        }
        else if (status.equals("irregularPower")){
            System.out.println("Gasoline Engine Log/Observer: Reparing Irregualr Engine Power Warning");
        }
        else if (status.equals("reducedPower")){
            System.out.println("Gasoline Engine Log/Observer: Repairing Engine Power Reduced Warning");
        }
        else{
            System.out.println("Gasoline Engine Log/Observer: EngineStatus Good");
        }
    }

    public void update_sw(String status){
        if(status.equals("oil")){
            System.out.println("Gasoline Engine Log/Observer: Resetting Oil Level for engine oil warning");
        }
        else if (status.equals("irregularPower")){
            System.out.println("Gasoline Engine Log/Observer: Software Resetting with Power Monitoring Module for Irregular Engine Power Warning");
        }
        else if (status.equals("reducedPower")){
            System.out.println("Gasoline Engine Log/Observer: Resetting Minimum Power level for engine power Reduced warning");
        }
        else{
            System.out.println("Gasoline Engine Log/Observer: Keep Curren SW Monitoring MOdule for Engine");
        }
    }
}
