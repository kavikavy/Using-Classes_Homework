import static ibio.Helpers.*;
public class Main {
    public static void main(String[] args) {
        boolean running = true;

        while (running == true) {
            String operation = input("give operation: ");
            if (operation.equals("end"))
                running = false;
            else {
                int a = inputInt("give first integer operand: ");
                int b = inputInt("give second integer operand: ");
                if (operation.equals("add"))
                    System.out.println(a + b);
                else if (operation.equals("sub"))
                    System.out.println(a - b);
                else
                    System.out.println("Unknown Operation");            }
        }
    }
}