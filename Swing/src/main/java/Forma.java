import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame {
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();
        campoTexto.addActionListener(e -> {
            System.out.println("Se ejecuto action Listener");
        });
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400); //tamaño de nuestra ventana
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); //cambiamos a modo oscuro
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
