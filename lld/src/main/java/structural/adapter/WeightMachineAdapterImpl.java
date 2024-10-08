package structural.adapter;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    private final WeightMachineService weightMachineService = new WeightMachineServiceImpl();

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachineService.getWeightInPounds();
        return weightInPound*0.45;
    }
}
