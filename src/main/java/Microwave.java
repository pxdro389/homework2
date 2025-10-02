public class Microwave extends Device {
    private int maxTime;

    public Microwave(int startPower, int maxCookingTime) {
        super(startPower);
        this.maxTime = maxCookingTime;
        System.out.println("--- Device initialized. ---");
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Max cooking time: " + maxTime + " seconds");
    }

    public void heatFood() {
        System.out.println("Food is heating.");
    }
}