import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

    public static void main(String[] args) {

        System.out.println("Welcome to the AddressBook system");

        AddressBook addressBook = new AddressBook();
        addressBook.createContact();
    }

    /**
     * Method for creating a contact
     *
     * @return method returns the contact object
     */
    public Contact createContact() {
        Contact contact = new Contact("Madhukar",
                "Tatiraju",
                "Dr.No.50-50-2,seethammadhara",
                "Vizag",
                "AP",
                "530013",
                "93456482012",
                "madhukar@gmail.com");

        contactArrayList.add(contact);
        return contact;
    }
}
