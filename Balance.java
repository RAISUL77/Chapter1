public class Balance {
    private float balance,increase;

    public Balance() {
        this.balance = 1000;
        this.increase=0;
    }

    public float getBalance(float max)
    {
        for(float year=1;year<=5;year++)
        {
           increase= (float) (balance*0.05);
            //System.out.println(+increase);
           balance=balance+increase;
        }
        return balance;
    }
}
