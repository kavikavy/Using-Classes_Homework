public class Main {
    public static void main(String[] args) {
        for (int k = 0; k < 11; k++) {
            double angle = k * Math.PI/5;
            System.out.println(angle + ", " + Math.sin(angle) + ", " + Math.cos(angle));
        }
    }
}