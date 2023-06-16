package home.work8;

public class Client {
    private Deposit[] deposits;

    public Client() {
        deposits = new Deposit[10];
    }
    public boolean addDeposit(Deposit deposit){
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i]==null){
                deposits[i]=deposit;
                return true;
            }
        }
        return false;
    }
    public double totalIncome(){
        double result = 0;
        for (Deposit deposit: deposits) {
            result += deposit.income();
        }
        return result;
    }
    public double maxIncome(){
        double max = deposits[0].income();
        for (int i = 0; i <deposits.length ; i++) {
            if (max < deposits[i].income()){
                max = deposits[i].income();
            }
        }
        return max;
    }
    public double getIncomeByNumber(int index){
        if (index < 0 || index > deposits.length || deposits[index] == null){
            return 0;
        } else {
            return deposits[index].income();
        }
    }
}
