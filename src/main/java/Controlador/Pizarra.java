package Controlador;

import Modelo.Figura;
import Controlador.Estrella;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class Pizarra extends JPanel {

    private int x;
    private int y;
    private Figura figura;
    private boolean limpiar;

    public Pizarra() {
        this.limpiar = true;
        setBackground(Color.WHITE);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                obtenerCoordenadas(me.getX(), me.getY());
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public void setLimpiar(boolean limpiar) {
        this.limpiar = limpiar;
    }

    public void obtenerCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int ancho = this.figura.getAncho();
        int alto = this.figura.getAlto();
        int[] coordenadasX;
        int[] coordenadasY;
        int totalPuntos;
        if (!limpiar) {
            g.setColor(this.figura.getColor());
            switch (this.figura.getTipo()) {
                case Figura.CUADRADO:
                    g.fillRect(x, y, this.figura.getAncho(), this.figura.getAncho());
                    break;
                case Figura.TRIANGUL0:
                    coordenadasX = new int[]{x, x + (ancho / 2), x + ancho};
                    coordenadasY = new int[]{y + alto, y, y + alto};
                    totalPuntos = 3;
                    g.fillPolygon(coordenadasX, coordenadasY, totalPuntos);
                    break;
                case Figura.CIRCULO:
                    g.fillOval(x, y, this.figura.getAncho(), this.figura.getAlto());
                    break;
                case Figura.ESTRELLA:
                    totalPuntos = 10;
                    Estrella estrella = new Estrella(totalPuntos);
                    estrella.crear(x, y, (alto + ancho) / 2);
                    g.fillPolygon(estrella.getPoligonoX(), estrella.getPoligonoY(), totalPuntos);
                    break;
            }
        } else {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getHeight(), this.getHeight());
        }
    }
}
