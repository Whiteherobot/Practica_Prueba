package Modelo;

import java.awt.Color;

public class Figura {
    
    public static final int CUADRADO = 0;
    public static final int RECTANGULO = 1;
    public static final int TRIANGUL0 = 2;
    public static final int CIRCULO = 3;
    public static final int ESTRELLA = 4;
    
    private int tipo;
    private Color color;
    private int alto;
    private int ancho;
    
    public Figura(int tipo, Color color, int alto,int ancho) {
        this.tipo = tipo;
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getTipo() {
        return tipo;
    }

    public Color getColor() {
        return color;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    
}
