package Generics;

public class WildCardTest<X extends Number> {
    X[] nums;

    public WildCardTest(X[] data){
        nums = data;
    }
    public double average() {
        double sum = 0.0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += nums[i].doubleValue();
        }
        return sum;
    }

    public boolean isAvgSame(WildCardTest<?> obj){
       return  this.average() == obj.average();
    }
}
