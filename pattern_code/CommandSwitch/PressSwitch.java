public class PressSwitch {

   public static void main(String[] args) {
       Light lamp = new Light();
       Command switchUp = new FlipUpCommand(lamp);
       Command switchDown = new FlipDownCommand(lamp);

       Switch s = new Switch(switchUp,switchDown);

       try {
           if (args[0].equalsIgnoreCase("ON")) {
                s.flipUp();
           } else if (args[0].equalsIgnoreCase("OFF")) {
               s.flipDown();
           } else {
               System.out.println("Argument \"ON\" or \"OFF\" is required.");
           }
       } catch (Exception e){
           System.out.println("Arguments required.");
       }
   }
}

