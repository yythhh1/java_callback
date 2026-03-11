package Day_one;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opition = scanner.nextInt();
        switch(opition){
            case 1:
                System.out.println("single model");
                break;
            case 2:
                System.out.println("multi model");
                break;
            case 3:
                System.out.println("quit game");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

}
