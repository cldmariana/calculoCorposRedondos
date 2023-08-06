// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class calculateCorposRedondos {
    public static void main(String[] args) {

        calculateSideArea(4, 19);
        calculateBaseArea(4);
        calculateTotalArea(4, 19);
        calculateVolume(4, 19);
    }

    public static float calculateSideArea(float r, float h) {

        float al = (2f * 3.14f * r * h);

        System.out.println(" The value of the side area is: " + al);
        return al;
    }

    public static float calculateBaseArea(float r) {

        float twoAb = (float) (2f * 3.14f * Math.pow(r, 2f));

        System.out.println(" The value of the base area is: " + twoAb);
        return twoAb;

    }

    public static void calculateTotalArea(float r, float h) {

        float al = calculateSideArea(r, h);
        float twoAb = calculateBaseArea(r);
        float at = al + twoAb;

        System.out.println(" The value of the total area is: " + at);

    }

    public static void calculateVolume(float r, float h) {

        float v = (float) (3.14f * Math.pow(r, 2f) * h);

        System.out.println(" The value of the volume is: " + v);
    }

}