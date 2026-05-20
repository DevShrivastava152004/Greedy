public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost)
    {
        int totalGas = 0, totalCost = 0;
        for(int i=0;i<gas.length;i++)
        {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas< totalCost)
        {
            return -1;
        }
        int currentGas = 0, startIndex = 0;
        for(int i=0; i<gas.length;i++)
        {
            currentGas += gas[i] - cost[i];
            if(currentGas < 0)
            {
                startIndex = i+1;
                currentGas = 0;
            }
        }
        return startIndex;
    }
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        int[] gas1 = {1,2,3,4,5};
        int[] cost1 = {3,4,5,1,2};
        System.out.println("Output: " + gasStation.canCompleteCircuit(gas1,cost1)); // Output: 3

        int[] gas2 = {2,3,4};
        int[] cost2 = {3,4,3};
        System.out.println("Output: " + gasStation.canCompleteCircuit(gas2,cost2)); // Output: -1
    }
}
