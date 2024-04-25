package Level_1.main.java.calculator;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class App {

    public static void main(String[] args) {

        List <Integer> ansList = new ArrayList<>();


        while(true) { // 무한으로 계산 진행
            Scanner sc = new Scanner(System.in);

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            //soutv 단축키 //가까운 변수 출력 테스트
            System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /

//        charAt(idx) : charAt메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치(index)를 받는다.
            char operator = sc.next().charAt(0);
            int result = 0;
            switch (operator) {  // operator에 따라 다른 연산
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("연산자가 잘못 입력되었습니다.");

            }
            System.out.println("결과 " + result);

            ansList.add(result); // 리스트에 연산결과 추가

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeAns = sc.next();
            if (removeAns.equals("remove")) {   //remove 입력 받으면 가장 먼저 저장된 결과 삭제
                ansList.remove(0);
            }


            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inqAns = sc.next();
            if (inqAns.equals("inquiry")) {  // inquiry 입력시 list 출력
                for (int x : ansList){
                    System.out.println(x);
                }
            }



            System.out.println("더 계산하시겠습니까?(exit 입력시 종료)");
            String exitAns = sc.next();
            if (exitAns.equals("exit")) {   //exit 입력받으면 while문 종료
                break;
            }

        }


    }
}
