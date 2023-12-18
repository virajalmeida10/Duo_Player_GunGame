public class SimpleGame {
    public static void main (String args[]) {
        Player1 p1 = new Player1 ("Trevor", "AKM", 100);
        Player2 p2 = new Player2 ("Franklin", "M416", 100, true);
        System.out.println("Player Profile:");
        System.out.println("Name of the Player: " +p1.getName());
        System.out.println("Weapon Used: " +p1.getWeapon());
        System.out.println("Health to begin with: " +p1.getHealth());
        p1.DamageByAKM();
        p1.DamageByM416();
        p1.Heal();
        p1.DamageByAKM();
        p1.DamageByM416();
        p1.DamageByM416();

        p2.DamageByAKM();
        p2.DamageByM416();
        p2.Heal();
        p2.DamageByAKM();
    }
}