import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {

    @Test
    public void whenGivenContactDetailsShouldAbleToGetTheDetails() {
        AddressBook addressBook = new AddressBook();
        addressBook.createContact();
        Assert.assertEquals("Tatiraju", addressBook.createContact().getLastName());
        Assert.assertEquals("Madhukar", addressBook.createContact().getFirstName());
        Assert.assertEquals("Vizag", addressBook.createContact().getCity());
        Assert.assertEquals("AP", addressBook.createContact().getState());
        Assert.assertNotEquals("Bangalore", addressBook.createContact().getCity());
    }


}