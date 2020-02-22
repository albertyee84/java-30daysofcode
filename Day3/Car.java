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
    int maxNumberOfPeopleInCar = 6;

    // f(x,y,z) = x + 1/z - y;
    // Say x = 5;
    // f(5) = 5 + 1 = 6;

    public Car() {

    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
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
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        // numberOfPeopleInCar = numberOfPeopleInCar + 1;
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar){
            numberOfPeopleInCar++;
            System.out.println("Someone Got In");
        } else {
            System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
        // numberOfPeopleInCar = numberOfPeopleInCar - 1;
        if(numberOfPeopleInCar > 0){
            numberOfPeopleInCar--;
        } else {
            System.out.println("No one is in car");
        }
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        // If the car isn't on...
        if(!isTheCarOn) {
            // turn it on
            isTheCarOn = true;
        } else {
            // otherwise print out the fact it's on
            System.out.println("The Car is already On " + isTheCarOn);
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();

        
    //        System.out.println("Christmas Car");
    //        Car christmasPresent = new Car(550, 2000, false);
    //        christmasPresent.printVariables();
    }
}