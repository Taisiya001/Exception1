import java.util.Scanner;

public class Ex1 {
    //Реализуйте метод, который запрашивает у пользователя 
    //ввод дробного числа (типа float), и 
    //возвращает введенное значение. 
    //Ввод текста вместо числа не должно приводить к падению
    // приложения, вместо этого, необходимо повторно 
    //запросить у пользователя ввод данных.
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число");
        double number = scanner.nextDouble();
        System.out.println("Вы ввели число" + number);
        scanner.close();
        }catch(Exception ex){
            System.out.println("Введен текст");
        }
    }
}
