import com.workintech.oop.Player;
import com.workintech.oop.Point;
import com.workintech.oop.Weapon;


public class Main {
    public static void main(String[] args) {

        System.out.println("--------------Point Sınıfı------------------");

        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("-------------Player Sınıfı-------------------");

        Player p1 = new Player("Deniz", -20, Weapon.SWORD);
        Player p2 = new Player("Ali", 100, Weapon.CROSS_BOW);

        System.out.println("Health remaining: " + p1.healthRemaining());

        System.out.println("You got attacked !!");
        p1.loseHealth(20);

        System.out.println("******************************");
        System.out.println("Restoring health by 200");
        p1.restoreHealth(200);
    }
}