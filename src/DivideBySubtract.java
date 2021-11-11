public class DivideBySubtract implements DivideAlgorithm{
    private int operationCount = 0;
    @Override
    public int run(int numerator, int denominator){
        while (numerator >= denominator){
            numerator=numerator-denominator;
            operationCount++;
        }
        return numerator;
}
    @Override
    public int getOperationCount(){
       return operationCount;
    }
}
