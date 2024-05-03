import java.util.Scanner;

public class CheckNumber {


    public static int CheckInput1(){
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
               try{
                   num = Integer.parseInt(sc.nextLine());
                   break;
               }catch (Exception e){
                   System.out.println("잘못된 입력입니다");

            }
        }
        return num;
    }

}
