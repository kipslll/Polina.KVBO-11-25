package lab13;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, building, apartment;

    // метод А: через split()
    public void parseWithSplit(String address) {
        String[] parts = address.split(",\\s*"); // Разделяем по запятой и пробелу
        if (parts.length >= 7) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts[5].trim();
            apartment = parts[6].trim();
        }
    }

    // метод Б: через StringTokenizer
    public void parseWithTokenizer(String address) {
        StringTokenizer st = new StringTokenizer(address, ", "); // Разделитель запятая и пробел
        if (st.countTokens() >= 7) {
            country = st.nextToken().trim();
            region = st.nextToken().trim();
            city = st.nextToken().trim();
            street = st.nextToken().trim();
            house = st.nextToken().trim();
            building = st.nextToken().trim();
            apartment = st.nextToken().trim();
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String testAddress = "Россия, Московская область, Москва, Тверская, 11, 3, 45";

        Address addr1 = new Address();
        addr1.parseWithSplit(testAddress);
        System.out.println("Через split(): " + addr1);

        Address addr2 = new Address();
        addr2.parseWithTokenizer(testAddress);
        System.out.println("Через StringTokenizer: " + addr2);
    }
}
