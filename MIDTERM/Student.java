import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Suffix: ");
        String suffix = sc.nextLine();
        
        String fullName = buildFullName(firstName, middleName, lastName, suffix);
        System.out.println("Full Name: " + fullName);
        sc.close();
    }
    private static String buildFullName(String firstName, String middleName, String lastName, String suffix) {
        StringBuilder fullNameBuilder = new StringBuilder();
        fullNameBuilder.append(firstName);
        if (!middleName.isEmpty()) {
            fullNameBuilder.append(" ").append(middleName);
        }
        fullNameBuilder.append(" ").append(lastName);

        if (!suffix.isEmpty()) {
            fullNameBuilder.append(" ").append(suffix);
        }
        return fullNameBuilder.toString();
    }
}

