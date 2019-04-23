package calculadoraPrueba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static org.omg.CORBA.ORB.init;

public class ventana extends JFrame implements ActionListener {
    
    JPanel panel_principal;
//  JButton buttonsuma, buttonresta, buttonmultiplicacion, buttondivision, clean;
    JButton clean;
    JButton Operacion;
    JTextField caja, caja1, caja2;
    JLabel numero1, numero2;
    Double a, b;
    
    public ventana() {
        setTitle("CALCULADORA");
        setSize(650, 300);
        setLocationRelativeTo(null);
        this.setBackground(new Color(96, 111, 140));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setIconImage(new ImageIcon(getClass().getResource("/jmr/blog/res/favicon.png")).getImage());
        init();
        
    }
    
    private void init() {
        panel_principal = new JPanel();
        panel_principal.setLayout(null);
        panel_principal.setBackground(new Color(210, 225, 243));

//        buttonsuma = new JButton("Suma");
//        buttonsuma.setBounds(50, 80, 100, 30);
//        buttonsuma.addActionListener(this);
//        buttonresta = new JButton("Resta");
//        buttonresta.setBounds(50, 180, 100, 30);
//        buttonresta.addActionListener(this);
//
//        buttonmultiplicacion = new JButton("Multiplicación");
//        buttonmultiplicacion.setBounds(450, 80, 100, 30);
//        buttonmultiplicacion.addActionListener(this);
//
//        buttondivision = new JButton("División");
//        buttondivision.setBounds(450, 180, 100, 30);
//        buttondivision.addActionListener(this);
        Operacion = new JButton("Operacion");
        Operacion.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        Operacion.addActionListener(this);
        
        clean = new JButton("Limpiar");
        clean.setBounds(250, 80, 100, 30);
        clean.addActionListener(this);
        
        caja = new JTextField();
        caja.setBounds(80, 10, 200, 30);
        
        caja1 = new JTextField();
        caja1.setBounds(400, 10, 200, 30);
        
        caja2 = new JTextField();
        caja2.setBounds(200, 180, 200, 30);
        
        numero1 = new JLabel("Numero 1");
        numero1.setBounds(10, 10, 200, 35);
        
        numero2 = new JLabel("Numero 2");
        numero2.setBounds(330, 10, 200, 35);
        
        panel_principal.add(numero1);
        panel_principal.add(numero2);
        panel_principal.add(Operacion);
//        panel_principal.add(buttonresta);
//        panel_principal.add(buttonsuma);
//        panel_principal.add(buttondivision);
//        panel_principal.add(buttonmultiplicacion);
        panel_principal.add(caja);
        panel_principal.add(caja1);
        panel_principal.add(caja2);
        panel_principal.add(clean);
        getContentPane().add(panel_principal);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        String nombreBoton = boton.getActionCommand();
        System.out.println(nombreBoton);
        switch (nombreBoton) {
            case "Suma":
                
                a = Double.valueOf(caja.getText());
                b = Double.valueOf(caja1.getText());
                suma sum = new suma(a, b);
                caja2.setText(sum.mostrarResultado() + "");
                break;

//            case "Resta":
//                a = Double.valueOf(caja.getText());
//                b = Double.valueOf(caja1.getText());
//                resta res = new resta(a, b);
//                System.out.println("---");
//                caja2.setText(res.mostrarResultado() + "");
//                break;
//
//            case "Multiplicación":
//                a = Double.valueOf(caja.getText());
//                b = Double.valueOf(caja1.getText());
//                multiplicacion mul = new multiplicacion(a, b);
//                System.out.println("---");
//                caja2.setText(mul.mostrarResultado() + "");
//
//                break;
//            case "División":
//                a = Double.valueOf(caja.getText());
//                b = Double.valueOf(caja1.getText());
//                division div = new division(a, b);
//                System.out.println("---");
//                caja2.setText(div.mostrarResultado() + "");
//                break;
            case "Limpiar":
                System.out.println("---");
                caja2.setText("");
                caja.setText("");
                caja1.setText("");
                
                break;
            
            default:
                break;
        }
        
    }
    
}
