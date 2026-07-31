package Lab.bank;

public class Data_Base {

    private int depositNumber = 0;
    private int loanNumber = 0;
    private int accountNumber = 0;
    
    private Queue depositQueue = new Queue();
    private Queue loanQueue = new Queue();
    private Queue accountQueue = new Queue();
    
 

    void AddDepositNumberQueue() {
        depositNumber++;
        depositQueue.enqueue(depositNumber);
        System.out.println("Add : "+ depositNumber + "to Deposite" );
        
        
    }
    
     void AddLoanNumberQueue() {
        loanNumber++;
        loanQueue.enqueue(loanNumber);
         System.out.println("Add : "+ loanNumber + "to loan" );
    }
     
      void AddAccountNumberQueue() {
        accountNumber++;
        accountQueue.enqueue(accountNumber);
         System.out.println("Add : "+ accountNumber + "to account" );
    }
    
    

   public int getNextDepositQueue() {
        return depositQueue.dequeue();
    }

    public int getNextLoanQueue() {
        return loanQueue.dequeue();
    }

    public int getNextAccountQueue() {
        return accountQueue.dequeue();
    }
    
    public void showdepositQueue(){
         depositQueue.showAll();
    }
    
    public void showloanQueue(){
         loanQueue.showAll();
    }
    
    public void showAccountQueue(){
         accountQueue.showAll();
    }
    
    public int getSizeDepositQueue() {
        return depositQueue.size();
    }
    
    public int getSizeLoanQueue() {
        return loanQueue.size();
    }
    
    public int getSizeAccounQueue() {
        return accountQueue.size();
    }

     
}

