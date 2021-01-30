import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive first and last name

    public Email(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);
        //Call a method asking for a department and return a department
        this.department = setDepartment();
    }

    // Ask for department
    private String setDepartment(){
        System.out.print("Please input employee's department: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None");
        Scanner in  = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "Sales";}
        else if (depChoice ==2) {return "Development";}
        else if (depChoice ==3) {return "Accounting";}
        else {return "";}
    }

    //Generate a random password


    //Set mailbox capacity


    //Set alternate email


    //Change the password
}
