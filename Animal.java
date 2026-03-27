public class Animal {
    private String name;
    private String color;
    private int age;
    private String favFood;

    // Constructor
    public Animal(String name, String color, int age, String favFood) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.favFood = favFood;
    }

    // Getters
    public String getName() { return name; }
    public String getColor() { return color; }
    public int getAge() { return age; }
    public String getFavFood() { return favFood; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setColor(String color) { this.color = color; }
    public void setAge(int age) { this.age = age; }
    public void setFavFood(String favFood) { this.favFood = favFood; }

    // Method to print details
    public void printDetails() {
        System.out.printf("Animal Details:%nName: %s%nColor: %s%nAge: %d%nFavorite Food: %s%n",
                          name, color, age, favFood);
    }
}
