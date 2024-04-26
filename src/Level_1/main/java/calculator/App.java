package Level_1.main.java.calculator;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class App {

    public static void main(String[] args) {

        List <Integer> ansList = new ArrayList<>();
        ArithmeticCalculator calculator1 = new ArithmeticCalculator();
        CircleCalculator calculator2 = new CircleCalculator();

        while(true) { // 무한으로 계산 진행

            Scanner sc = new Scanner(System.in);

            System.out.println("사칙연산을 진행하려면 1을 입력해주시고");
            System.out.print("원의 넓이를 구하려면 2를 입력해주세요 : ");
            int typeCheck = sc.nextInt();
            if (typeCheck == 1) {

                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                //soutv 단축키 //가까운 변수 출력 테스트
                System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /

//        charAt(idx) : charAt메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치(index)를 받는다.
                char operator = sc.next().charAt(0);

                int result = 0;

                try {
                    result = calculator1.calcutlate(num1, num2, operator);
                } catch (Exception e) {   //예외처리
                    System.out.println(e.getMessage());
                }

                System.out.println("결과 " + result);

                System.out.println("Calculator 내부 List 첫번째 데이터 조회 :" + calculator1.getArr(0));
                System.out.println("List에 가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeAns_L = sc.next();
                if (removeAns_L.equals("remove")) {   //remove 입력 받으면 list에 가장 먼저 저장된 결과 삭제
                    calculator1.removeResult();
                }
                System.out.println("List에 저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inqAns = sc.next();
                if (inqAns.equals("inquiry")) {
                    calculator1.inquiryResults();
                }
            }
            else if( typeCheck == 2){
                double r_size;
                System.out.print("반지름 길이를 입력하세요: ");
                int r = sc.nextInt();
                r_size = calculator2.calculateCircleArea(r);
                System.out.println("원의 크기 : " + r_size);

                System.out.println("List에 저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inqAns = sc.next();
                if (inqAns.equals("inquiry")) {
                    calculator2.inquirySizeResults();
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
