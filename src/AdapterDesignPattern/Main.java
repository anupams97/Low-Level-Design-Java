package AdapterDesignPattern;

import AdapterDesignPattern.Adaptee.WeightMachinesForBabies;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapterImpl machineAdapter =new WeightMachineAdapterImpl(new WeightMachinesForBabies());
        System.out.println(machineAdapter.getWeightInKgs());
    }
}
