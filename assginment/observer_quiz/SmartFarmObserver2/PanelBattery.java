import framework.*;
public class PanelBattery implements Battery{
    private String mode;
    public PanelBattery(String mode){
        this.mode = mode;
    }
    public void use() {
        System.out.println("--> One Battery Cell is replaced with a prototype...");
        System.out.println("One Battery Cell Being Made (cloned) and installed");
        System.out.println("Battery fixed");
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
