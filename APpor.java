import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
public class APpor extends javax.swing.JInternalFrame {
 private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
	private Dimension dimBarra = null; 
	private JTextField textField;
	private JPasswordField passwordField;
        
        public void ocultarBarraTitulo()
	{ 
	Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane(); 
	dimBarra = Barra.getPreferredSize(); 
	Barra.setSize(0,0); 
	Barra.setPreferredSize(new Dimension(0,0)); 
	repaint(); 
	}
    public APpor() {
        ocultarBarraTitulo();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Por vs para");
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 230, 60));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 60));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\n                                          Usos de PARA\n\n\n           Finalidad u objetivo: \n\n       •Estudié en Woodward para aprender español.\n\n       •Carlos está tomando clases de cocina para preparar la cena.\n\n           Término de un plazo fijo: \n\n       •Esta tarea es para mañana. \n\n           Equivale a \"con dirección a\": \n\n       •Salgo para Puerto Montt el viernes. \n\n           Destino: \n\n       •Esta caja es para el correo.\n\n           Opinión: \n\n       •Para mí, jugar con mis hijos es lo más importante. \n");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 58, 560, 590));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("\n\n                      Usos de POR\n\n           Causa, motivo o razón: \n   \n       •Vinimos a Chile por mi familia.\n  \n       •Brindemos por tu cumpleaños.\n \n           Espacio de tiempo: \n\n       •Estudié en Woodward por 10 meses.\n\n       •Viviré en Chile por 2 años.\n\n           Lugar aproximado: \n\n       •En un mes estaré por Punta Arenas.\n\n       •Esta tarde pasaré por tu casa.\n\n           Lugar donde se pasa: \n\n       •Voy a Isla Negra por Algarrobo.\n\n       •Queremos pasar por Pomaire antes de llegar a Santiago.\n\n           A cambio de algo: \n\n       •Cambio mi novela por tu revista.\n\n       •Carolina intercambia clases de matemáticas por clases de biología.\n\n           Precio (para vender): \n\n       •Se vende computador por cuatrocientos mil pesos.\n\n       •Vendo collares por dos dólares.\n\n           En nombre de otra persona, en lugar de, sustitución: \n\n       •No hables por nosotros, habla por ti.\n\n       •¿Puedes llevar estas cajas por nosotros?\n\n           Medio: \n\n       •Mándame el informe por correo electrónico. \n \n       •La única forma de llegar a esa isla es por avión.\n\n           Modo: \n\n        •Estudio español por mi voluntad.\n\n           Equivale a \"a comprar\": \n\n       •Anda al supermercado por los jugos.\n\n           Equivale a \"a buscar\": \n\n       •Pasarán por ti a las ocho de la mañana.\n\n       •Ven por nosotros a las seis de la tarde.\n\n           Reparto, distribución: \n\n       •El viaje costará 500 dólares por pareja.\n\n       •Es un helado por niño.\n\n\n           Velocidad: \n\n       •La velocidad máxima en la carretera es de 120 kilómetros por hora.\n\n       •Muchas personas conducen en la ciudad a 70 kilómetros por hora.\n\n           Parte del día: \n\n       •Haré la tarea por la noche.\n\n       •Mi amiga y yo salimos a correr por las mañanas.\n\n           A punto de realizar una acción: \n\n       •Estamos por salir a tu casa.\n\n       •Los invitados están por llegar.\n\n\n\n\n");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
