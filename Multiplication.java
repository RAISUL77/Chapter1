public class Multiplication {
    private int result;

    public Multiplication() {
        this.result = 1;
    }

    public int getResult(int highestNum) {
        for(int loopcount=1;loopcount<=highestNum;loopcount++ )

        {
            result=result*loopcount;
        }
        return result;
    }
}