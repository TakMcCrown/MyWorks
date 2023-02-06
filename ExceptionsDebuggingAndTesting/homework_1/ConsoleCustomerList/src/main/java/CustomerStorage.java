import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws EmailException, NumberExemption {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

            String[] components = data.split("\\s+");
            if (components.length != 4) {
                throw new IllegalArgumentException("Неверный формат");
            }
                testEmail(components[INDEX_EMAIL]);
                testPhone(components[INDEX_PHONE]);
                String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
                storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }

    public void testEmail(String email) throws EmailException {
        String text = email.toLowerCase();
        if (text.contains("@") && (text.contains(".ru") || text.contains(".com"))) {

            int start = text.indexOf("");
            int end = text.indexOf("@", start);

            int startMail = text.indexOf("@") + 1;
            int endMail = text.indexOf(".", startMail);

            String encodingMail = text.substring(startMail, endMail);
            String encoding = text.substring(start, end);
            String lettersRange = "[QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm1234567890._\\-]";
            String regex = lettersRange + "{" + encoding.length() + "}[@]" + lettersRange +
                    "{" + encodingMail.length() + "}" + lettersRange + "{3,4}";
        } else {
            throw new EmailException("Неверный емайл");
        }
    }

    public void testPhone(String phone) throws NumberExemption{
        String regex = "[^0-9+]";
        phone = phone.replaceAll(regex, "");
        if (phone.length() != 12 || phone.charAt(0) != '+'){
            throw new NumberExemption("Неверный формат номера");
        }
    }
}