import java.util.HashMap;
/**
 * Manual phonebook
 * q27
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneBook
{
    private HashMap phoneBook;
    
    public PhoneBook()
    {
         phoneBook = new HashMap();
    }
    
    public void enterNumber(String name, String number)
    {
        phoneBook.put(name, number);
        System.out.printf("%s added at %s. %n", number, name);
    }
    
    public void lookupNumber(String name)
    {
        System.out.println(name + ": " + phoneBook.get(name));
    }
}
