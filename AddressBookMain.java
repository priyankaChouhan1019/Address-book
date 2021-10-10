import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        addressBook.addContact();
      System.out.println("\nEnter a choice");
            System.out.println("|| 1.Add a new AddressBook   \n|| 2.Perform Operation on AddressBook \n|| 3.Display all AddressBooks \n|| 4.Search people in Particular City/State  \n|| 5.Create Files of all address books  \n|| 6.EXIT");
        int choice = scanner.nextInt();
while(true)
{
        switch(choice)
        {
            case 1:
            addressBook.editContact();
            break;
            case 2:
            addressBook.deleteContact();
            break;
            case 3:
            addressBook.addContact();
            break;
            case 4:
            System.exit(0);
            break;
            default :
            System.out.println("wrong choic");
        }
   }    
    
    }
}

