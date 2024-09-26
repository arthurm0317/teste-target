package entities;

public class FibonacciChecker {
    private Integer num;
    public FibonacciChecker(){

    }
    public FibonacciChecker(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
    public boolean isFibonacci(int num){
        if(num==0 || num==1){
            return true;
        }
        int a = 0;
        int b = 1;
        int fibonacci = a+b;

        while (fibonacci<=num){
            if(fibonacci==num){
                return true;
            }
            a = b;
            b = fibonacci;
            fibonacci = a+b;
        }
        return false;
    }
}
