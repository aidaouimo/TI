public class DivideBySubtractTricky implements DivideAlgorithm{
    private int operationCount = 0;
    @Override
    public int run(int numerator, int denominator){
        int multipliy=1;
        int result=0;
        while (numerator >= denominator){
            numerator=numerator-(multipliy*denominator);
            operationCount++;
            result=result+multipliy;
            if (numerator<=(multipliy*denominator)+1){
                multipliy=1;
            }
            else {
                multipliy++;
            }
        }
        return result;
    }
    @Override
    public int getOperationCount()
    {
        return operationCount;
    }
}
