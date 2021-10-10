public class AddressBook {
    private class Contact {
         String firstName, lastName, address, city, state, emailId;
         int zipCode;
         long mobileNumber;
    }
    public void printContact() {
        Contact person = new Contact();
        person.firstName = "Priyanka";
        person.lastName = "Chouhan";
        person.address = "Treasuretown";
        person.city = "Indore";
        person.state = "Madhya pradesh";
        person.zipCode = 452136;
        person.mobileNumber = 1234567856L;
        person.emailId = "priyachouhan1019@gmail.com";
        System.out.println("Contact Details");
        System.out.println("Name         : "  + person.firstName + " " + person.lastName + "\n"
                         + "Address      : "  + person.address + "\n"
                         + "City         : "  + person.city + "\n"
                         + "State        : "  + person.state + "\n"
                         + "ZipCode      : "  + person.zipCode + "\n"
                         + "MobileNumber : "  + person.mobileNumber + "\n"
                         + "EmailId      : "  + person.emailId + "\n" );
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.printContact();
    }
}