public class Trouble {
    private int number; //trouble number
    public Trouble(int number) { // create trouble number
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    // public int getPrevNumber() {
    //     return prev;
    // }
    public String toString() {
        if(number ==1){
            return "Snow or Icy Terrain : Friction Mode Driving";
        }
        else if(number ==2){
            return "Sand Terrain : Low Speed Driving";
        }
        else{
            return "Pebble Terrain : High Powered and Raised Vehichle Driving";
        }
        
    }
}