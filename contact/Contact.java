public class Contact {   
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public static void dumpToConsole(Contact contact) {
        System.out.println(contact);
    }

    public String toString() {
        return "name : " + name + ", " + " phone : " + phone;
    }

    private String name;
    private String phone;

}