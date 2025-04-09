class Car {
 
    String model;
    int year;
    String color;

    // Default constructor
    public Car() {
        this.model = "Unknown";
        this.year = 2020;
        this.color = "White";
        System.out.println("Default Constructor called");
    }

    // Parameterized constructor
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println("Parameterized Constructor called");
    }
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Color: " + color);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.displayDetails();
        System.out.println();

        Car car2 = new Car("Tesla Model 3", 2022, "Red");
        car2.displayDetails();
        System.out.println();

    }
}
