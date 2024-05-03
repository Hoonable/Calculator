import java.util.Scanner;

public class CheckOperator {
    public static char checkInput2() {
        Scanner sc = new Scanner(System.in);
        char O;
        String S;
        char[] operator = {'+','-','/','*'};
        boolean tf = true;
        while (true) {
            try {
                S = sc.next();
                if (S.length()>1){throw new Exception();}
                for (char x: operator){
                    if(x == S.charAt(0)){
                        tf =false;
                    }
                }
                if (tf){throw new Exception();}
                O = (S.charAt(0));
                break;
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다");

            }
        }
        return O;
    }


}
