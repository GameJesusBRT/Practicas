package practicas;
import javax.swing.*;

public class Practica2 extends JFrame{
    ImageIcon imagen= new ImageIcon(getClass().getResource("/imagenes/img1.jpg"));
    
    JLabel fondo;
    JMenuBar menuB0;
    JMenu menuArchivo,menuEditar,menuReporte,menuSalir;
    JMenuItem itmNuevo,itmConsultar,itmEliminar,itmModificar,itmArchivo0,itmArchivo1;
    
    public Practica2(){
        setTitle("Practica 2");
        setSize(600,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        componentes();
        setVisible(true);
    }
    
    public void componentes(){
        //Fondo
        fondo=new JLabel(imagen);
        fondo.setBounds(0, 0, 600, 500);
        
        //Menu Bar
        menuB0=new JMenuBar();
        
        //Menus de barra
        menuArchivo=new JMenu("Archivo");
        menuB0.add(menuArchivo);
        menuEditar=new JMenu("Editar");
        menuB0.add(menuEditar);
        menuReporte=new JMenu("Reporte");
        menuB0.add(menuReporte);
        menuSalir=new JMenu("Salir");
        menuB0.add(menuSalir);
        
        //Items de los menus de la barra
        itmNuevo=new JMenuItem("Nuevo");
        menuArchivo.add(itmNuevo);
        itmConsultar=new JMenuItem("Consultar");
        menuArchivo.add(itmConsultar);
        itmEliminar=new JMenuItem("Eliminar");
        menuArchivo.add(itmEliminar);
        itmModificar=new JMenuItem("Modificar");
        menuEditar.add(itmModificar);
        itmArchivo0=new JMenuItem("Archivo PDF");
        menuReporte.add(itmArchivo0);
        itmArchivo1=new JMenuItem("Archivo txt");
        menuReporte.add(itmArchivo1);
        
        setJMenuBar(menuB0);
        add(fondo);
    }
}
