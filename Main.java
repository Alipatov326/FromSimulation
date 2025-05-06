import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);
        System.out.println(sim.simulate());
        System.out.println(sim.runSimulations(4));
        FrogSimulation sim2 = new FrogSimulation(25, 4);
        System.out.println(sim2.simulate());
        FrogSimulation sim3 = new FrogSimulation(31, 3);
        System.out.println(sim3.simulate());
        FrogSimulation sim4 = new FrogSimulation(-2, 3);
        System.out.println(sim4.simulate());
        FrogSimulation sim5 = new FrogSimulation(18, 5);
        System.out.println(sim5.simulate());

    }
}
