class Prototype
{
    public static void main (String[] args)
    {
        Color blueObj = ColorStore.getColor("blue");
        blueObj.addColor();
        System.out.println("blueObj1 "+ blueObj.hashCode());

        Color blackObj = ColorStore.getColor("black");
        blackObj.addColor();

        Color blackObj2 = ColorStore.getColor("black");
        blackObj2.addColor();

        Color blueObj2 = ColorStore.getColor("blue");
        blueObj2.addColor();
        System.out.println("blueObj2 "+ blueObj2.hashCode());

    }
}