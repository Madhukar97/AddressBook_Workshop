import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {

    @Test
    public void whenGivenContactDetailsShouldAbleToGetTheDetails() {
        Contact contact = new Contact("Madhukar",
                "Tatiraju",
                "Dr.No.50-50-2,seethammadhara",
                "Vizag",
                "AP",
                "530013",
                "93456482012",
                "madhukar@gmail.com");
        Assert.assertEquals("Tatiraju", contact.getLastName());
    }


}