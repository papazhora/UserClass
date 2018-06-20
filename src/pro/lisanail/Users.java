package pro.lisanail;
import java.util.Scanner;

public class Users {

    private String name;
    private int age;

    Users(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Users() {}

    void callData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you name: ");
        this.name = scanner.nextLine();
        System.out.print("You name is: " + this.name);

    }

    void callData2() {
        System.out.print("You name is: " + this.name + "\n" + "You age is " + this.age);
    }


}
