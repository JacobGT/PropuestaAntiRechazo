package propuestanorechazo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ventanaPrincipal extends JFrame{
    private JPanel panel;
    private JButton botonOp1;
    private JButton botonOp2;
    
    ventanaPrincipal(){
        setSize(600, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setTitle("   :3                         Ɛ><3                         UwU");
        setResizable(false);
        // direccion del icono: https://upload.wikimedia.org/wikipedia/commons/7/70/Symbolic_Love_Heart.png
        ImageIcon icon = new ImageIcon("Heart.png");
        this.setIconImage(icon.getImage());
        iniciarComponentes();        
    } 
    
    private void iniciarComponentes(){
        crearPaneles();
        agregarTitulo();
        agregarImagenRomantica();
        agregarBotones();
    }
    
    private void crearPaneles() {
        panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null); 
        panel.setBackground(Color.PINK);
        }
    
    private void agregarTitulo(){
        JLabel pregunta = new JLabel("Ɛ> ¿Quieres ser mi novi@? <3", SwingConstants.CENTER);
        pregunta.setBounds(50, 10, 500, 40);
        pregunta.setForeground(Color.BLACK);
        pregunta.setFont( new Font("times new roman", 3, 30));
        panel.add(pregunta);
    }
    
    private void agregarImagenRomantica(){
        //direccion de la imagen: https://i.pinimg.com/236x/ac/90/e0/ac90e039e86823543e8623cbc31516d7.jpg
        ImageIcon imagen = new ImageIcon("RomanticCat.jpg");
        JLabel conquista = new JLabel(imagen);
        conquista.setBounds(100, 100, 400, 400);
        conquista.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
        panel.add(conquista);
    }
    
    private void agregarBotones(){
        botonOp1 = new JButton();
        botonOp1.setText("Si");
        botonOp1.setFont(new Font("arial", 3, 30));
        botonOp1.setBackground(Color.white);
        botonOp1.setForeground(Color.RED);
        botonOp1.setBounds(50, 550, 150, 80);
        panel.add(botonOp1);
        
        botonOp2 = new JButton();
        botonOp2.setText("No");
        botonOp2.setFont(new Font("arial", 3, 30));
        botonOp2.setBackground(Color.white);
        botonOp2.setForeground(Color.RED);
        botonOp2.setBounds(400, 550, 150, 80);
        panel.add(botonOp2);
        
        antiRechazos();
    }
    
    private void antiRechazos(){
        MouseListener truco1= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                Aceptacion acepto = new Aceptacion();
                acepto.show();
                dispose();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                botonOp1.setText("Si");
                botonOp2.setText("No");
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        };
        botonOp1.addMouseListener(truco1);
        
        MouseListener truco2= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                Aceptacion acepto = new Aceptacion();
                acepto.show();
                dispose();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                botonOp2.setText("Si");
                botonOp1.setText("No");
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        };
        botonOp2.addMouseListener(truco2);
    }
}
