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
public class GTiempo extends javax.swing.JInternalFrame {
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
    public GTiempo() {
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
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tiempo presente");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 190, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Menu.png"))); // NOI18N
        jLabel10.setToolTipText("Menú principal");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 100, 60));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 60));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("\n\n       En español, los verbos se clasifican en tres tipos. \n\n          •Los verbos terminan en -AR , \n\n          •Los verbos terminan en -ER \n\n          •Los verbos terminan en -IR . \n\n       Verbos regulares en español en tiempo presente \n\n       Con los verbos regulares en español, solo la parte final de ese verbo (la parte -ar , -er o -ir ) cambia dependiendo de quién realiza la acción. Sin  \n\n       embargo, a diferencia del inglés, hay un final diferente para cada sujeto (pronombre). \n\n       Para comenzar, le mostraremos cómo conjugar el verbo en tiempo presente: \n\n       (Observe cómo la parte del verbo en rojo es la parte que cambia) \n\n       Si tienes el verbo Hablar (hablar) y quieres decir \"hablo\". Simplemente elimine las dos últimas letras del verbo (en este caso, elimine la -ar ) y \n\n       agregue la letra -O al final para crear el verbo conjugado Hablo que significa \"hablo\". \n\n       Otro ejemplo: si quieres decir \"Ellos comen\", tomamos el verbo original, en este caso Comer , eliminamos el final ( -er ) y luego agregamos -EN al \n\n       final (porque ellos = ellos). Ahora tenemos  Comen (ellos comen). \n\n       Notarás que se repiten ciertas terminaciones verbales. Por ejemplo, para YO (I) eliminamos el final de todos los verbos regulares y agregamos la \n\n          -O a la raíz (parte principal) del verbo. \n\n       También vea cómo la única diferencia entre los verbos -ER y los finales verbales -IR es cuando usamos nosotros (we) y vosotros (you / plural / \n\n       informal). \n\n       El pronombre de sujeto (yo, tú, nosotros, etc.) a menudo se omite antes del verbo, ya que normalmente sabemos quién es el sujeto (la persona que \n\n       realiza la acción) debido al final del verbo. \n\n       Por ejemplo: si dices \"hablamos español\" (hablamos español). No es necesario poner el pronombre nosotros antes del verbo porque sabemos que  \n\n       cuando decimos hablamos, se refiere a nosotros (nosotros). Muy a menudo escuchará o simplemente leerá \"Hablamos español\" sin el pronombre  \n\n       nosotros.\n\n       Verbos irregulares españoles en tiempo presente \n\n       Los siguientes verbos son solo irregulares en primera persona (singular).  El resto de las conjugaciones son normales (ver verbos regulares arriba). \n          I.- Los verbos en primera persona terminan en -Y \n       \n       Los siguientes verbos son parte de este grupo: Estar (ser) - Dar (dar) \n\n             Tema: Estar\n        \n               Yo estoy \n    \n               Tu estás \n \n               El  está \n       \n               Ella está \n \n               Usted  está \n \n               Nosotros / nosotras  estamos \n\n               Vosotros / Vosotras  estáis \n \n               Ellos / Ellas están \n \n               Ustedes  están \n\n          • Yo estoy feliz.  (Yo estoy feliz) \n\n          • Yo estoy en mi casa.  (Estoy en casa) \n\n          • Yo doy propinas (doy consejos). \n\n       II.- Verbos en primera persona terminados en -GO \n \n       Los siguientes verbos forman parte de este grupo: Hacer (hacer) - Poner (poner) - Salir (salir) - Valer (costar / valer) \n\n             Tema: Hacer  \n \n               Yo hago  \n  \n               Tu haces \n   \n               El  hace \n  \n               Ella hace \n\n              Usted  hace \n\n              Nosotros / nosotras  hacemos \n\n              Vosotros / Vosotras  hacéis \n \n              Ellos / Ellas hacen \n \n              Ustedes  hacen\n\n           • Yo hago mis tareas (hago mi tarea). \n\n           • Yo pongo la leche en el refrigerador. \n\n           • Yo salgo con mis amigos.  (Yo salgo con mis amigos) \n\n           • Yo valgo mucho \n\n       III.- Verbos en primera persona terminados en -ZCO \n \n       Los verbos que terminan en -cir y -cer cambian a -zco en primera persona.  Los siguientes verbos forman parte de este grupo: Conducir (conducir) \n\n       - Conocer (saber) - Traducir (traducir) \n\n             Tema: Conducir  \n  \n               Yo conduzco \n\n               Tu  conduce \n\n               El  conducirá\n\n               Ella  conducirá\n\n               Usted conducirá\n\n               Nosotros / nosotras conducimos\n\n               Vosotros / Vosotras  conduces  \n\n               Ellos / Ellas conducen\n  \n               Ustedes  conducen\n\n           • Yo conduzco mi coche.  (Yo manejo mi carro) \n\n           • Yo conozco a muchas personas.  (Conozco a mucha gente) \n\n           • Yo traduzco canciones.  (Traduzco canciones) \n\n       Recuerde que estos verbos son solo irregulares en la primera persona (singular), el resto del verbo tiene las mismas reglas que las conjugaciones \n\n       de tiempo presente regulares. \n\n   ___________________________________________________________________________________________________________________________\n\n       Bibliografía: \n   \n       http://ortografía.es.mx\n");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setCaretPosition(0);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        Inicio.logo.setVisible(false);
        Inicio.AReGra.setVisible(false);
        Inicio.SReGra.setVisible(false);

        Menú abrir1 = new Menú();
        Inicio.escritorio.add(abrir1);
        abrir1.toFront();
        abrir1.setVisible(true);
        //MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir1.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jLabel10MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
