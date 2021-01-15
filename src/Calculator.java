public class Calculator {

    public double calculateSphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return roundAmount(volume);
    }

    public double calculateCubeVolume(double width) {
        double volume = Math.pow(width, 3);
        return roundAmount(volume);
    }

    public double calculateTetrahedronVolume(double edge) {
        double volume = Math.pow(edge, 3) / (6 * Math.sqrt(2));
        return roundAmount(volume);

    }

    private double roundAmount(double volume) {
        return Math.round(volume * 100) / 100.0;
    }
}
