import java.util.Random;
public class SandSupport extends Support{
    private int number;
    public SandSupport(String name, int number) {
        super(name);
        this.number = number;
    }
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
    void batteryCheck(){
        Random rand = new Random();
        int caseNum = 2;
        int ran = 0;
        ran = rand.nextInt(caseNum)+1;
        if(ran==1){
            System.out.println("battery ok");
        }
        else{
            System.out.println("battery not ok");
        }
    }
    void SlipperyCheck(){}
    void PebbleCheck(){}
    void SandCheck(){
        Random rand = new Random();
        int caseNum = 2;
        int ran = 0;
        int ran2 = 0;
        ran = rand.nextInt(caseNum)+1;
        int caseNum2 = 4;//1~4
        ran2 = rand.nextInt(caseNum2)+1;
        if(ran==1){
            System.out.println("Tire air ok");
        }
        else{
            System.out.println("Tire air not ok");
        }
        if(ran2>2){
            System.out.println("Compressor ok");
        }
        else{
            System.out.println("Compressor not ok");
        }
    }
}