public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        // this constructor method needs to match the class
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    

    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        numberOfPeopleInCar++;
    }

    public void getOut() {
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void wreckCar() {
        condition = 'C';
    }

    public static void main(String[] args) {
        Car birthdayPresent = new Car(500, 5000.545, true);
        birthdayPresent.upgradeMinSpeed();
        birthdayPresent.wreckCar();
        birthdayPresent.printVariables();
    }
}