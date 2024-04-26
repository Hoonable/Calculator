package Level_1.main.java.calculator;
import java.io.*;
import java.util.*;




public class Calculator{

    private List <Integer> ans_list = new ArrayList<>();

    public Calculator(){
    }
    public int calcutlate(int intNum1, int intNum2, char operator) throws Exception{
        int result = 0;
        switch (operator) {  // operator에 따라 다른 연산
            case '+':
                result = intNum1 + intNum2;
                break;
            case '-':
                result = intNum1 - intNum2;
                break;
            case '*':
                result = intNum1 * intNum2;
                break;
            case '/':
                if (intNum2 == 0) {
                    throw new BadInputException_D();    //나눗셈 분모 0들어오면 Exception
                } else {
                    result = intNum1 / intNum2;
                }
                break;
            default:
                System.out.println();
                throw new BadInputException_O(operator);//연산자 기호가 잘 못 들어온 경우 Exception

        }
        ans_list.add(result);
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
