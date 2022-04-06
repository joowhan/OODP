import java.util.Random;
public class ATM_Accounts {

   public static void main (String[] args) {

      Savings_Account savings = new Savings_Account (4321, 531);
     // Total_result result = new Total_result();
      ATM west_branch = new ATM (savings,33, "west");
      ATM east_branch = new ATM (savings,40, "east");
      west_branch.start();
      east_branch.start();      

   }

}


class Savings_Account {

   protected int account;
   protected int balance;
   public int count = 0;

   public Savings_Account (int account_num, int initial) {
      account = account_num;
      balance = initial;
   }
   public int getCount(){
      return count++;
   }
   // only one thread allowed
   public synchronized boolean withdrawal (int amount, String name) {

      boolean result = false;
      System.out.println ("Withdrawal from account " + account + " by " +name);
      System.out.println ("Amount: " + amount);

      if (amount <= balance) {
         balance -= amount;
         System.out.println ("New balance: " + balance);
         result = true;
      } else
         System.out.println ("Insufficient funds.");

      System.out.println();

      return result;

   }
   
   public synchronized boolean deposit (int amount, String name) {

	      boolean result = false;
	      System.out.println ("Deposit to account " + account+ " by " +name);
	      System.out.println ("Amount: " + amount);
	      balance += amount;
	      System.out.println ("New balance: " + balance);
	      result = true;
	      System.out.println();

	      return result;

	   }


}
class Total_result{
   protected String account;
   protected int balance;


   public Total_result () {
      account = "";
      balance =0;
   }
}



class ATM extends Thread {

   Savings_Account account;
   //Total_result = result;
   int delay;
   String name;
   public ATM (Savings_Account savings, int delayTime, String str) {
      account = savings;
      delay = delayTime;
      name = str;
   }
   

   public void run () {
      //account.withdrawal (300);
      Random rand = new Random();
      int upperbound = 3;
         //System.out.println(i);
         try { 
            //sleep(delay);
            while(account.getCount() <= 10) {
               sleep(delay);
               System.out.println(account.getCount());
               int int_random = rand.nextInt(upperbound);
               //System.out.println(int_random);
               //withdrawal
               if(int_random ==0){
                  account.withdrawal (300, name);

               }
               //deposit
               else if(int_random ==1){
                  account.deposit(300, name);
               }
               sleep(delay);
            }
            
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
        
   }

}

