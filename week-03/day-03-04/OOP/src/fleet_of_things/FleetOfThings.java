package fleet_of_things;

public class FleetOfThings {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those
        // - In the main method create a fleet
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Thing getMilk = new Thing("Get milk");
        fleet.add(getMilk);

        Thing remove = new Thing("Remove the obstacles");
        fleet.add(remove);

        Thing stanUp = new Thing("Stand up");
        fleet.add(stanUp);
        stanUp.complete();

        Thing eat = new Thing("Eat lunch");
        fleet.add(eat);
        eat.complete();

        System.out.println(fleet);
    }
}
