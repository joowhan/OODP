import java.util.Random;
public class SnowSupport extends Support {
    private int number;
    public SnowSupport(String name, int number) {
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
    protected int getNumber() {
        return number;
    }
    void SlipperyCheck(){
        Random rand = new Random();
        int caseNum = 2;
        int ran = 0;
        int ran2 = 0;
        ran = rand.nextInt(caseNum)+1;
        int caseNum2 = 4;//1~4
        ran2 = rand.nextInt(caseNum2)+1;
        if(ran==1){
            System.out.println("spike wheel ok");
        }
        else{
            System.out.println("spike wheel not ok");
        }
        if(ran2>2){
            System.out.println("wheel power ok");
        }
        else{
            System.out.println("wheel power not ok");
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
    void PebbleCheck(){}
    void SandCheck(){}

}