import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aquarium aquarium = new Aquarium();

        boolean flag = true;
        while (flag) {
            System.out.println("Menu: Add, Remove, Change, Print all, Exit");
            String input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "add":
                    aquarium.addSpecies();
                    break;
                case "remove":
                    aquarium.remove();
                    break;
                case "change":
                    System.out.println("What do you want to change?: Age, Size");
                    String change = scanner.nextLine();
                    switch (change.toLowerCase()) {
                        case "age":
                            aquarium.changeAge();
                            break;
                        case "size":
                            aquarium.changeSize();
                            break;
                    }
                    break;
                case "print all":
                    aquarium.printAllSpecies();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("There is no such action, please try again.");
                    break;
            }
        }
    }
}
