import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "jchhconsulting.com";

    // Constructor to receive first and last name

    public Email(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;

        //Call a method asking for a department and return a department
        this.department = setDepartment();

        //Call a method generating a random password
        this.password = randomPassword(this.defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        if (!department.isEmpty()) {
            this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        } else {
            this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companySuffix;
        }

    }

    // Ask for department
    private String setDepartment(){
        System.out.print("Please input " + firstName+ "'s department code: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None\n");
        Scanner in  = new Scanner(System.in);
        int depChoice = in.nextInt();
        in.close();
        if (depChoice == 1) {return "ssales";}
        else if (depChoice ==2) {return "development";}
        else if (depChoice ==3) {return "accounting";}
        else {return "";}
    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEGFHIJKLMNOPQRSTUWXYZ0123456789!?'£%^*()abcedefghijklmonopqrstuvwxyz";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    //Get methods
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return  alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
