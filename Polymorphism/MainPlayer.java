public class MainPlayer {
    public static void main(String[] args) {

        // bad way to code
//        Player player = new Player();
//        player.name = "Time";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health + " + player.healthRemaining());
//        player.health = 200;    // removes control from Player class, shows importance of encapsulation
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
