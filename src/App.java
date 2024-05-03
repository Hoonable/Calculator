
import java.util.*;


public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        do {
            System.out.print("첫번째 숫자를 입력해주세요: ");
            int num1 = checkNumber.checkInput1();
            System.out.print("두번째 숫자를 입력해주세요: ");
            int num2 = checkNumber.checkInput1();
            System.out.print("연산자를 입력해주세요: ");
            char operator = checkOperator.checkInput2();
            int ans;
            List<Integer> results = new ArrayList<>();

            Calculator cal = new Calculator(results);

            ans = cal.calculate(num1, num2, operator);

            System.out.println("연산결과는 "+ans+"입니다");


            System.out.println("종료하려면 exit을 입력해주세요");
        }
        while(!Objects.equals(sc.next(), "exit"));
    }
}
