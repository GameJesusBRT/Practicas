package practicas;
import javax.swing.*;

public class Practica4 extends JFrame{
    JLabel lblNombre,lblDireccion,lblSexo,lblTipoTel,lblNumTel,lblFoto,imagen;
    JTextField txtNombre,txtDireccion,txtNumTel;
    JComboBox<String> comboSexo;
    String[] sexo={"Femenino","Masculino","Otro"};
    JCheckBox chkMovil,chkCasa;
    JFileChooser fc0;
    JButton btnNuevo,btnGuardar;
    
    public Practica4(){
        setTitle("Practica 4");
        setSize(410,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        componentes();
        setVisible(true);
    }
    
    public void componentes(){
        lblNombre=new JLabel("Nombre:");
        lblNombre.setBounds(10, 10, 50, 20);
        lblDireccion=new JLabel("Dirección:");
        lblDireccion.setBounds(10, 40, 60, 20);
        lblSexo=new JLabel("Sexo:");
        lblSexo.setBounds(10, 70, 40, 20);
        lblTipoTel=new JLabel("Teléfono:");
        lblTipoTel.setBounds(10, 100, 60, 20);
        lblNumTel=new JLabel("Número:");
        lblNumTel.setBounds(10, 130, 60, 20);
        lblFoto=new JLabel("Fotografia:");
        lblFoto.setBounds(10, 190, 60, 20);
        imagen=new JLabel("Imagen");
        imagen.setBounds(240, 10, 140, 140);
        
        txtNombre=new JTextField();
        txtNombre.setBounds(80, 10, 150, 20);
        txtDireccion=new JTextField();
        txtDireccion.setBounds(80, 40, 150, 20);
        txtNumTel=new JTextField();
        txtNumTel.setBounds(80, 130, 150, 20);
        
        comboSexo=new JComboBox(sexo);
        comboSexo.setBounds(80, 70, 150, 20);
        
        chkMovil=new JCheckBox("Móvil");
        chkMovil.setBounds(80,100,60,20);
        chkCasa=new JCheckBox("Casa");
        chkCasa.setBounds(170,100,60,20);
        
        fc0=new JFileChooser();
        fc0.setBounds(80, 160, 300, 150);
        
        btnNuevo=new JButton("Nuevo");
        btnNuevo.setBounds(105, 320, 70, 20);
        btnGuardar=new JButton("Guardar");
        btnGuardar.setBounds(225, 320, 80, 20);
        
        add(lblNombre);
        add(lblDireccion);
        add(lblSexo);
        add(lblTipoTel);
        add(lblNumTel);
        add(lblFoto);
        add(imagen);
        
        add(txtNombre);
        add(txtDireccion);
        add(txtNumTel);
        
        add(comboSexo);
        
        add(chkMovil);
        add(chkCasa);
        
        add(fc0);
        
        add(btnNuevo);
        add(btnGuardar);
    }
}
