package structural.adapter;

public class Main {

    public static void main(String[] args){
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl();
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
