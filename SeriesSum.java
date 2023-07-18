public class SeriesSum {
    private int result;

    public SeriesSum() {
        this.result = 0;
    }

    public int getResult(int highestNum) {
        for(int loopcount=1;loopcount<=highestNum;loopcount++ )

        {
            result=result+loopcount;
        }
        return result;
    }
}
