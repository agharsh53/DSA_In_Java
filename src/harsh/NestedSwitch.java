package harsh;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the EmpId :");
        int empId = in.nextInt();

        switch (empId) {
            case 1 -> System.out.println("Harsh Kumar Agrawal");
            case 2 -> System.out.println("Kunal Kushwaha");
            case 3 -> {
                System.out.println("Emp Number 3");
                System.out.print("Enter your Department : ");
                String department = in.next();
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Access");
                }
            }
            default -> System.out.println("You  enter wrong EmpId");
        }
    }
}
