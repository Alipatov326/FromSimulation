import java.util.Scanner;
public class FrogSimulation
{
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
     * position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    /** Returns an integer representing the distance, in inches, to be moved when the frog hops.
     */
    private int hopDistance()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("How far?");
        return s.nextInt();
        /* implementation not shown */ }

    /** Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the simulation;
     * false otherwise.
     */
    public boolean simulate() {
        int frogPos = 0;
        int hopsRem = maxHops;
        while(frogPos < goalDistance &&
                frogPos >= 0 &&
                hopsRem > 0)
        {
            frogPos += hopDistance();
            hopsRem--;
        }
        return frogPos >= goalDistance;
        /* to be implemented in part (a) */ }

    /** Runs num simulations and returns the proportion of simulations in which the frog
     * successfully reached or passed the goal.
     * Precondition: num > 0
     */
    public double runSimulations(int num)
    {
        int successfulRuns = 0;
        for(int run = 1; run <= num; run++)
            if(simulate())
                successfulRuns++;
        return successfulRuns / (double) num;
        /* to be implemented in part (b) */ }
}