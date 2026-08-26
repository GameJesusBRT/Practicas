package practicas;
import javax.swing.*;

public class Practica1 extends JFrame{
    //Objetos de ventana
    JLabel lblUsuario,lblContrasenia;
    JTextField txtUsuario;
    JPasswordField pswContrasenia;
    JButton btnNuevo,btnAcceder;
    
    //Propiedades de ventana
    public Practica1(){
        setTitle("Practica 1");
        setSize(400,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        componentes();
        setVisible(true);
    }
    
    //Creacion de objetos
    public void componentes(){
        //JLabel
        lblUsuario=new JLabel("Usuario:");
        lblUsuario.setBounds(50, 50, 100, 30);
        
        lblContrasenia=new JLabel("Contraseña:");
        lblContrasenia.setBounds(50, 100, 100, 30);
        
        //JTextField y JPasswordField
        txtUsuario=new JTextField();
        txtUsuario.setBounds(150, 50, 150, 30);
        
        pswContrasenia=new JPasswordField();
        pswContrasenia.setBounds(150, 100, 150, 30);
        
        //JButton
        btnNuevo=new JButton("Nuevo");
        btnNuevo.setBounds(80, 150, 100, 50);
        
        btnAcceder=new JButton("Acceder");
        btnAcceder.setBounds(240, 150, 100, 50);
        
        add(lblUsuario);
        add(lblContrasenia);
        add(txtUsuario);
        add(pswContrasenia);
        add(btnNuevo);
        add(btnAcceder);
    }
}