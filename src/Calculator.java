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

    public List<Integer> getResults() {
        return results;
    }


    public void inquiryResults() {
        for (int result : this.getResults()) {
            System.out.println("연산 결과 = " + result);
        }
    }
}
