import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Alice", "123456789"));
        assertEquals(2, phoneBook.add("Bob", "987654321"));
        assertEquals(2, phoneBook.add("Alice", "111111111"));
    }