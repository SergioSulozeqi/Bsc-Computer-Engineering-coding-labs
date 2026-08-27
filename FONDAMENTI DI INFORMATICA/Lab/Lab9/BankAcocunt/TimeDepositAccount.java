public class TimeDepositAccount extends SavingsAccount{

    private int vincoloMesi;   
    
    public TimeDepositAccount(double interestRate, int mesi){
        super(interestRate);
        vincoloMesi = mesi;
    }
    
    public TimeDepositAccount(double versamentoIniziale, double interestRate, int mesi){
        super(versamentoIniziale, interestRate);
        vincoloMesi = mesi;
    }
    
    public void addInterest(){
        super.addInterest();
        vincoloMesi--;
    }
    
    public void withdraw(double amount){
        if(vincoloMesi>0){
            super.withdraw(20);
        }
        
        super.withdraw(amount);
    }

    public int getMonthsLeft(){
        return vincoloMesi;
    }

    public String toString(){
        return "TimeDepositAccount[vincoloMesi=" + vincoloMesi + "]" + super.toString();
    }

    public boolean equals(Object obj){
        TimeDepositAccount a = (TimeDepositAccount)obj;
        if(super.equals(obj) && vincoloMesi==a.vincoloMesi){
            return true;
        }
        return false;
    }
    
}
