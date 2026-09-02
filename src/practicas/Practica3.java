package practicas;
import javax.swing.*;

public class Practica3 extends JFrame{
    JLabel lblNom, lblEdad, lblEmail, lblUser, lblPwd, lblInfo;
    JTextField txtNom, txtEdad, txtEmail, txtUser;
    JPasswordField pwd0;
    JTextArea area0;
    JScrollPane scrll0;
    JButton btnNuevo,btnAgregar;
    
    public Practica3(){
        setTitle("Practica 3");
        setSize(530,240);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        componentes();
        setVisible(true);
    }
    
    public void componentes(){
        //Etiquetas
        lblNom=new JLabel("Nombre:");
        lblNom.setBounds(10, 10, 50, 20);
        lblEdad=new JLabel("Edad:");
        lblEdad.setBounds(10, 40, 50, 20);
        lblEmail=new JLabel("Correo:");
        lblEmail.setBounds(10, 70, 50, 20);
        lblUser=new JLabel("Usuario:");
        lblUser.setBounds(10, 100, 50, 20);
        lblPwd=new JLabel("Contraseña:");
        lblPwd.setBounds(10, 130, 80, 20);
        lblInfo=new JLabel("Información:");
        lblInfo.setBounds(320, 10, 80, 20);
        
        //Campos de Texto
        txtNom=new JTextField();
        txtNom.setBounds(100, 10, 200, 20);
        txtEdad=new JTextField();
        txtEdad.setBounds(100, 40, 200, 20);
        txtEmail=new JTextField();
        txtEmail.setBounds(100, 70, 200, 20);
        txtUser=new JTextField();
        txtUser.setBounds(100, 100, 200, 20);
        
        //Campo de contraseña
        pwd0=new JPasswordField();
        pwd0.setBounds(100, 130, 200, 20);
        
        //Area de texto y scroll bar
        area0=new JTextArea();
        scrll0=new JScrollPane(area0);
        scrll0.setBounds(320,40,180,110);
        
        //Botones
        btnNuevo=new JButton("Nuevo");
        btnNuevo.setBounds(160,160,80,20);
        btnAgregar=new JButton("Agregar");
        btnAgregar.setBounds(290,160,80,20);
        
        add(lblNom);
        add(lblEdad);
        add(lblEmail);
        add(lblUser);
        add(lblPwd);
        add(lblInfo);
        
        add(txtNom);
        add(txtEdad);
        add(txtEmail);
        add(txtUser);
        
        add(pwd0);
        
        add(scrll0);
        
        add(btnNuevo);
        add(btnAgregar);
    }
}
