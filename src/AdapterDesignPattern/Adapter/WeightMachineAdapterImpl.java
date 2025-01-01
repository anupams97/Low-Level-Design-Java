package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKgs(){
        return weightMachine.getWeightInPounds()*0.45;
    }
}
