public class ModeTracking {
    // private int number;
    // private int prev;
    private static ModeTracking modeTracking;
    private ModeTracking(){
        // this.number = number;
        // this.prev = prev;
    }
    public static ModeTracking createModeTracking(){
        
        if(modeTracking==null){
            modeTracking = new ModeTracking();
        }
        return modeTracking;
    }
    public void checkModeTracking(int number, int prev){
        if(number ==1){
            if(number ==prev){
                System.out.println("No Mode Change --- Keep Friction Mode with Spike Wheel Driving");
            }
            else{
                System.out.println(".....Driving Mode changed to Friction Mode");
                System.out.println("Snow or Icy Terrain : Friction Mode with Spike Wheel Driving");
            }
        }
        else if(number ==2){
            if(number ==prev){
                System.out.println("No Mode Change --- Keep Sand/Soft Terrain Mode Driving");
            }
            else{
                System.out.println(".....Driving Mode changed to Sand/Soft Mode");
                System.out.println("Sand/Soft Terrain : Low Speed & Inflated Tire Driving");
            }
        }
        else if(number ==3){
            if(number ==prev){
                System.out.println("No Mode Change --- Keep pebble/Unenven Road Mode: High Powered and Raised Vehicle Driving");
            }
            else{
                System.out.println(".....Driving Mode changed to Pebble or Uneven Mode");
                System.out.println("Pebble Terrain : High Powered and Raised Vehicle Driving");
            }
        }
    }
}
