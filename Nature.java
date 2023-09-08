public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        // OK : uncomment the following code in order to test it
        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glide();
        hawkeye.descend(140);
        hawkeye.land();
        hawkeye.descend(9);
        hawkeye.land();
    }
}

/*
 * Résultat dans le terminal :
 * Pingou dives into the water.
 * Pingou swims downward, depths : 3
 * Pingou swims upward, depths : 2
 * Pingou swims downward, depths : 6
 * Pingou swims upward, depths : 1
 * Pingou swims upward, depths : 0
 * Pingou gets out of the water.
 * Hawkeye takes off in the sky.
 * Hawkeye flies upward, altitude: 120
 * Hawkeye flies upward, altitude: 150
 * Hawkeye glides into the air.
 * Hawkeye flies downward, altitude: 10
 * Hawkeye is too high, it can't land.
 * Hawkeye flies downward, altitude: 1
 * Hawkeye lands on the ground.
 */
