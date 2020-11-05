package propuestanorechazo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Aceptacion extends JFrame{
    private JPanel panel;
    private JButton botonOp1;
    private JButton botonOp2;
    private JButton botonOp3;
    
    Aceptacion(){
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Por ti sería batman. BB! ;)");
        setResizable(false);
        // direccion del icono: https://upload.wikimedia.org/wikipedia/commons/7/70/Symbolic_Love_Heart.png
        ImageIcon icon = new ImageIcon("Heart.png");
        this.setIconImage(icon.getImage());
        iniciarComponentes();  
    }
    
    private void iniciarComponentes(){
        crearPaneles();
        agregarTitulo();
        agregarBotones();
    }
    
    private void crearPaneles() {
        panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null); 
        panel.setBackground(Color.RED);
        }
    
    private void agregarTitulo(){
        JLabel aceptacion1 = new JLabel("Sabía que dirías que si chikit@ ;)", SwingConstants.CENTER);
        aceptacion1.setBounds(50, 10, 500, 40);
        aceptacion1.setForeground(Color.WHITE);
        aceptacion1.setFont( new Font("times new roman", 3, 30));
        panel.add(aceptacion1);
        
        JLabel aceptacion2 = new JLabel("UwU Ahora eres mi chiquitrikis BB", SwingConstants.CENTER);
        aceptacion2.setBounds(50, 45, 500, 40);
        aceptacion2.setForeground(Color.WHITE);
        aceptacion2.setFont( new Font("times new roman", 3, 30));
        panel.add(aceptacion2);
    }
    
    private void agregarBotones(){
        botonOp1 = new JButton();
        botonOp1.setText("¡Obvio Siiiii!");
        botonOp1.setFont(new Font("arial", 3, 15));
        botonOp1.setBackground(Color.pink);
        botonOp1.setForeground(Color.BLACK);
        botonOp1.setBounds(20, 150, 250, 80);
        panel.add(botonOp1);
        
        botonOp2 = new JButton();
        botonOp2.setText("Ya sacame de aqui we :,(");
        botonOp2.setFont(new Font("arial", 3, 15));
        botonOp2.setBackground(Color.PINK);
        botonOp2.setForeground(Color.BLACK);
        botonOp2.setBounds(320, 150, 250, 80);
        panel.add(botonOp2);
        
        salir();
    }
    
    private void salir(){
        MouseListener exit1= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                dispose();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        };
        botonOp1.addMouseListener(exit1);
        
        MouseListener exit2= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                dispose();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        };
        botonOp2.addMouseListener(exit2);
    }
}
