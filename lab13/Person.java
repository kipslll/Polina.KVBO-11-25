package lab13;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName).append(" ");
        }
        if (firstName != null && !firstName.isEmpty()) {
            sb.append(firstName.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            sb.append(middleName.charAt(0)).append(".");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Щеглова", "Полина", "Михайловна");
        Person p2 = new Person("Петров", "Петр", null);

        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());
    }
}