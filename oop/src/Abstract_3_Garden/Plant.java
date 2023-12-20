package Abstract_3_Garden;

abstract class Plant {
    protected String name;
    protected double height;
    protected int age;

    public Plant(String name) {
        this.name = name;
        this.height = 0;
        this.age = 0;
    }

    public abstract void doSpring();

    public abstract void doSummer();

    public abstract void doAutumn();

    public abstract void doWinter();

    public void printStatus() {
        System.out.println(name + " has height: " + height);
    }
}