import java.util.List;

public class Calculator {


    private List<Integer> results;

    public Calculator(List<Integer> results) {
        this.results = results;
    }

    public int calculate(int x, int y, char operator){

        int ans = operatorType.fromOperator(x,y,operator);
        this.results.add(ans);

        return ans;
    }
}
