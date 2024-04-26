package Level_1.main.java.calculator;
import java.io.*;
import java.util.*;





public class Calculator{

    protected List <Integer> ans_list = new ArrayList<>(); // private이면 외부 클래스에서 접근 불가
    static final double PI = 3.141592; // 불변의 고정된 값

    protected List <Double> size_list; // 원 넓이 결과 저장 list // private이면 외부 클래스에서 접근 불가

    AddOperator addOperator; //사칙연산자 객체  선언
    DivideOperator divideOperator;
    MultiplyOperator multiplyOperator;
    SubtractOperator subtractOperator;

    ModOperator modOperator;

    public Calculator(){    // 인스턴스 생성할 때 연산 결과 리스트 초기화
        ans_list.clear();

        size_list = new ArrayList<>(); //초기화?

        this.addOperator = new AddOperator(); // 사칙연산자 클래스 초기화
        this.divideOperator = new DivideOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.subtractOperator = new SubtractOperator();
        this.modOperator = new ModOperator();



    }


}

class ModOperator{
    public int operate(int a, int b){
        return a%b;
    }
}
class AddOperator{

    public int operate(int a, int b){
        return a+b;
    }
}

class SubtractOperator{
    public int operate(int a, int b){
        return a-b;
    }

}

class MultiplyOperator{
    public int operate(int a, int b){
        return a*b;
    }

}
class DivideOperator{
    public int operate(int a, int b){
        return a/b;
    }

}

class ArithmeticCalculator extends Calculator{
    public int calcutlate(int intNum1, int intNum2, char operator) throws Exception{
        int result = 0;
        switch (operator) {  // operator에 따라 다른 연산
            case '+':
                result = addOperator.operate(intNum1, intNum2);
                break;
            case '-':
                result = subtractOperator.operate(intNum1, intNum2);
                break;
            case '*':
                result = multiplyOperator.operate(intNum1,intNum2);
                break;
            case '/':
                if (intNum2 == 0) {
                    throw new BadInputException_D();    //나눗셈 분모 0들어오면 Exception
                } else {
                    result = divideOperator.operate(intNum1, intNum2);
                }
                break;
            case '%':
                result = modOperator.operate(intNum1, intNum2);
                break;
            default:
                System.out.println();
                throw new BadInputException_O(operator);//연산자 기호가 잘 못 들어온 경우 Exception

        }
        super.ans_list.add(result);
        return result;

    }
    public int getArr(int x){ // 리스트 간접 접근 get

        if(!ans_list.isEmpty()){
            return ans_list.get(x);}
        else{
            return 0;
        }
    }
    public void setArr(int idx, int num){// 리스트 간접 접근 set
        ans_list.set(idx,num);
    }

    public void addArr(int num){// 리스트 간접 접근 add
        ans_list.add(num);
    }

    public void removeResult(){ //리스트 index 0 삭제
        ans_list.remove(0);
    }
    public void inquiryResults() {
        // inquiry 입력시 list 출력
        for (int x : ans_list){
            System.out.println(x);
        }

    }
}

class CircleCalculator extends Calculator{
    public double calculateCircleArea(int r){
        double ans = r*r*PI;
        super.size_list.add(ans);
        return ans;
    }
    public double getSizeArr(int x){ // size리스트 간접 접근 get

        if(!super.size_list.isEmpty()){
            return super.size_list.get(x);}
        else{
            return 0;
        }
    }
    public void inquirySizeResults() {
        // inquiry 입력시 list 출력
        for (double x : super.size_list){
            System.out.println(x);
        }

    }
}




class BadInputException_O extends Exception {   // Operator 입력 잘못됐을때
    public BadInputException_O(char type) {
        super(type + "은 연산자가 아닙니다!");
    }
}
class BadInputException_D extends Exception {   // 나눗셈 분모 0일때
    public BadInputException_D() {
        super("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
    }
}
