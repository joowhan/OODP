public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(Observer observer1, Observer observer2, Observer observer3) {
        builder.makeTitle("log");
        builder.makeString("Gasoline Engine Being Checked");
        builder.makeItems(new String[]{
            "Checking Engine",
            "Engine is " + observer1.getLog(),
        });
        builder.makeString("Checked Eletric Motor");
        builder.makeItems(new String[]{
            "Motor Checked",
            "Electric Motor is " + observer2.getLog(),
        });
        builder.makeString("Checking Regenerative Brake System");
        builder.makeItems(new String[]{
            "Checking Regenerative Brake System",
            "Generative Brake System is " + observer3.getLog(),
        });
        builder.close();
    }
}
