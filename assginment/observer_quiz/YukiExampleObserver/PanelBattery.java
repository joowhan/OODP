import framework.*;
public class PanelBattery implements Battery{
    private String mode;
    public PanelBattery(String mode){
        this.mode = mode;
    }
    

    public Battery createClone() {
        Battery p = null;
        try {
            p = (Battery)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
