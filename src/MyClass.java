import java.util.Scanner;

public class MyClass {
    public void printMsg(String msg){
        System.out.println(msg);
    }
    public void guessMyNumber(){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(i<0 || i>10){
            System.out.println("please insert a num between 0 and 10");
            guessMyNumber();
        }else{

            int random = (int )(Math.random() *10);
            for(int x=0;x<3;x++){
                if(i==random){
                    System.out.println("congrats");
                    return;
                }else{
                    System.out.println("try again");
                    i = in.nextInt();
                }
            }
            System.out.println("sorry you lose");
            return;
        }


    }




}
