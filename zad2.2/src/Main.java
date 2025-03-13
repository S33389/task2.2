import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price =40.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your residence: ");
        String residence = sc1.nextLine();
        System.out.print("Enter the day you bought the ticket: ");
        Scanner sc2 = new Scanner(System.in);
        String day = sc1.nextLine();

        double discount = 0.0;

        if(age<10){
            price = 0;
            discount=1;
        }
        else if(age<=18){
            discount += 0.5;
        }

        if(residence.equals("Warsaw")){
            discount+=0.1;
        }

        if(day.equals("Thursday")){
            price=0;
            discount=1;
        }

        System.out.println("Data: " + residence +", " + age + " years old, " + day + " ticket price: " + (1.0-discount)*price + " PLN");
        System.out.println("Discount: " + discount*100 + "%");
    }
}