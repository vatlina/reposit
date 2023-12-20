package Abstract_3_Garden;

class Flower extends Plant {
    public Flower(String name) {
        super(name);
    }

    @Override
    public void doSpring() {
        System.out.println(name + " has grown in Spring, " + height + " cm");
        height += 20;
    }

    @Override
    public void doSummer() {
        System.out.println(name + " is not growing in summer, " + height + " cm");
        height = 0;
    }

    @Override
    public void doAutumn() {
        System.out.println(name + " is being cut in Autumn, " + height + " cm");
        height = 0;
    }

    @Override
    public void doWinter() {
        System.out.println(name + " is not growing in winter, " + height + " cm");
    }
}
