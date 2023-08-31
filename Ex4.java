import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        try{
            double d = Double.parseDouble(string);
        } catch (NumberFormatException ex){
            System.out.println("Empty not Allow");
        }


    }
} 