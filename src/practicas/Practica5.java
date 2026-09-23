package practicas;
import javax.swing.*;

public class Practica5 extends JFrame{
    JLabel lblMatricula;
    JTextField txtMatricula;
    JButton btnBuscar,btnNuevo;
    JTable tabla1;
    JScrollPane scroll1;
    
    String[] nombres={"Matricula","Nombre","Edad","Telefono","Correo"};
    
    public Practica5(){
        setTitle("Practica 5");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        componentes();
        setVisible(true);
    }
    
    public void componentes(){
        lblMatricula=new JLabel("Matricula");
        lblMatricula.setBounds(10, 10, 60, 20);
        
        txtMatricula=new JTextField();
        txtMatricula.setBounds(80, 10, 150, 20);
        
        btnBuscar=new JButton("Buscar");
        btnBuscar.setBounds(280, 10, 80, 20);
        btnNuevo=new JButton("Nuevo");
        btnNuevo.setBounds(380, 10, 80, 20);
        
        tabla1=new JTable();
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][]{},
        nombres));
        
        scroll1=new JScrollPane(tabla1);
        scroll1.setBounds(10, 50, 465, 290);
        
        add(lblMatricula);
        add(txtMatricula);
        
        add(btnBuscar);
        add(btnNuevo);
        
        add(scroll1);
    }
}
