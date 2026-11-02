package lab13;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", desc='" + description + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M"
        };

        Shirt[] shirtObjects = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            String[] parts = shirts[i].split(",");
            shirtObjects[i] = new Shirt(parts[0], parts[1], parts[2], parts[3]);
        }

        for (Shirt s : shirtObjects) {
            System.out.println(s);
        }
    }
}
