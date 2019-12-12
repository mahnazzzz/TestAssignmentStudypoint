
package mahnaz.testassignment_1;

/**
 *
 * @author Bruger
 */
public class MinMaxNumbers {
     private int min;
    private int max;

    public MinMaxNumbers(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "MinMaxNumbers{" + "min=" + min + ", max=" + max + '}';
    }

    
}
