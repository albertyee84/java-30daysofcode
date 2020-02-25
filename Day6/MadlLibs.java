import java.util.Random;
import java.util.Scanner;

public class MadlLibs {
    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomeNums;
    Random rand = new Random();

    //Getters!
    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomeNums;
    }

    // Setters

    public void setStory(String newStory) {
        this.story = newStory;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAdjective1(String newAdjective1) {
        this.adjective1 = newAdjective1;
    }

    public void setAdjective2(String newAdjective2) {
        this.adjective2 = newAdjective2;
    }

    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }

    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }

    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }

    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }
        randomeNums = "not " + numberHolder[0] + ", not "+numberHolder[1] + "but " + numberHolder[2];
    }
    //Print Instructions to Player
    public void printInstructions() {
        System.out.println("Welcome to the MadLibs game. If you type in " + "words, we'll give you a story. Start by typing in a name.");
    }

    //Get data from player
    public void enterName() {
        setName(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Get me a noun");
        setNoun1(scanner.nextLine());
    }
    public void enterNoun2() {
        System.out.println("Get me another noun");
        setNoun2(scanner.nextLine());
    }
    public void enterNoun3() {
        System.out.println("Get me a last noun");
        setNoun3(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("Get me a adjective");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("Get me aother adjective");
        setAdjective2(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("Get me a adverb");
        setAdverb(scanner.nextLine());
    }

    public void putTogetherTheStory() {
        String story = "Jesse and her best friend" + getName() + "went to Disney World today!"
            + "They saw a " + getNoun1() + " in a show at the Magic Kingdowm "
            + "and ate a " + getAdjective1() + " feast for dinner. The next day I"
            + "ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2()
            + " and then that night I gazed at the " + getRandomNums() + " " + getAdjective2()
            + "fireworks shooting from the " + getNoun3() + ".";
            setStory(story);
    }

    public void play() {
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
    }

    public static void main(String[] args) {
        MadlLibs game = new MadlLibs();
        game.printInstructions();
        game.play();
    }
}