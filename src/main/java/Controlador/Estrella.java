package Controlador;

public class Estrella {

    private int[] poligonoX;
    private int[] poligonoY;

    public Estrella(int totalPuntos) {
        this.poligonoX = new int[totalPuntos];
        this.poligonoY = new int[totalPuntos];
    }

    public void crear(int x, int y, int radio) {
        double radioInterno = radio * Math.sin(Math.toRadians(18) / Math.sin(Math.toRadians(54)));

        for (int i = 18; i < 360; i += 72) {
            poligonoX[(i - 18) / 36] = x + (int) (radio * Math.cos(Math.toRadians(i)));
            poligonoY[(i - 18) / 36] = y - (int) (radio * Math.sin(Math.toRadians(i)));
        }

        for (int i = 54; i < 360; i += 72) {
            poligonoX[(i - 18) / 36] = x + (int) (radioInterno * Math.cos(Math.toRadians(i)));
            poligonoY[(i - 18) / 36] = y - (int) (radioInterno * Math.sin(Math.toRadians(i)));
        }
    }

    public int[] getPoligonoX() {
        return poligonoX;
    }

    public int[] getPoligonoY() {
        return poligonoY;
    }
}
