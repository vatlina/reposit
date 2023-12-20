package Abstract_3_Garden;

class Garden {
    public static void growPlants() {
        Plant tulip = new Flower("Tulip");
        Plant pine = new Tree("Pine");

        for (int year = 1; year <= 2; year++) {
            System.out.println("Growing plants for year: " + year);

            for (int season = 1; season <= 4; season++) {
                switch (season) {
                    case 1:
                        tulip.doSpring();
                        pine.doSpring();
                        break;
                    case 2:
                        tulip.doSummer();
                        pine.doSummer();
                        break;
                    case 3:
                        tulip.doAutumn();
                        pine.doAutumn();
                        break;
                    case 4:
                        tulip.doWinter();
                        pine.doWinter();
                        break;
                }
            }
        }

        tulip.printStatus();
        pine.printStatus();
    }
}