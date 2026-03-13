public class ContactsExecutor {
    public static void main(String[] args) {
        long number = ContactsUsingLong.searchContactNumber("Ramesh");
        System.out.println("Phone number: " + number);

        number = ContactsUsingLong.searchContactNumber("Naga Lakshmi");
        System.out.println("Phone number: " + number);

        number = ContactsUsingLong.searchContactNumber("Unknown");
        System.out.println("Phone number: " + number);
    }
}