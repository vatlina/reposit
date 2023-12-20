package Abstract_3_Garden;

class Tree extends Plant {
    public Tree(String name) {
        super(name);
    }

    @Override
    public void doSpring() {
        System.out.println(name + " has grown in Spring, " + height + " cm");
        height += 35;
    }

    @Override
    public void doSummer() {
        System.out.println(name + " is growing in Summer, " + height + " cm");
        height += 40;
    }

    @Override
    public void doAutumn() {
        System.out.println(name + " is not growing in Autumn, " + height + " cm");
    }

    @Override
    public void doWinter() {
        System.out.println(name + " is not growing in winter, " + height + " cm");
    }
}