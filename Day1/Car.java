public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOne = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOne);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public static void main(String[] args) {
        Car familyCar = new Car();
        familyCar.printVariables();
        Car aliceCar = new Car();
        aliceCar.wreckCar();
        aliceCar.printVariables();
        familyCar.printVariables();
    }
}