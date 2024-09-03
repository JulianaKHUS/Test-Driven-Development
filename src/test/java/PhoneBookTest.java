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
    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "123456789");
        phoneBook.add("Bob", "987654321");
        assertEquals("Alice", phoneBook.findByNumber("123456789"));
        assertEquals("Bob", phoneBook.findByNumber("987654321"));
        assertNull(phoneBook.findByNumber("000000000"));
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "123456789");
        phoneBook.add("Bob", "987654321");
        assertEquals("123456789", phoneBook.findByName("Alice"));
        assertEquals("987654321", phoneBook.findByName("Bob"));
        assertNull(phoneBook.findByName("Charlie"));
    }
}