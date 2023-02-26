import java.awt.Dimension;
import java.awt.EventQueue;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
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
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;

public class Crear_cuenta extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    private JTextField textField;
    private JPasswordField passwordField;

    public void ocultarBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    public static final String URL = "jdbc:mysql://localhost:3306/administradores?autoReconnect=true&useSSL=false";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Prototipo19";

    java.sql.PreparedStatement ps;
    ResultSet rs;

    // JAVA-MYsql
    public Connection getConection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    //Limpia cjas al registrarse

    private void limpiarCajas() {
        texusuario.setText(null);
        texcorreo.setText(null);
        texcontraseña.setText(null);
        texrepite.setText(null);
    }

    //Limpia cajas de contraseña
    private void limpiarcontraseña() {
        texcontraseña.setText(null);
        texrepite.setText(null);
    }

    public Crear_cuenta() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        texusuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        texcorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        texcontraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        texrepite = new javax.swing.JPasswordField();
        IdUnico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(1370, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/libro.jpg"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 348, 321));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logocrear_iniciar.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 220, 120));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 348, 476));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Crear cuenta");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 250, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nombre de usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 200, 30));

        texusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(texusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 100, 30));

        texcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texcorreoActionPerformed(evt);
            }
        });
        jPanel1.add(texcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Correo electrónico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 200, 30));

        texcontraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texcontraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(texcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Repite contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 200, 30));

        texrepite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texrepite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texrepiteActionPerformed(evt);
            }
        });
        texrepite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                texrepiteKeyPressed(evt);
            }
        });
        jPanel1.add(texrepite, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 250, 30));

        IdUnico.setForeground(new java.awt.Color(255, 255, 255));
        IdUnico.setText("jTextField1");
        IdUnico.setBorder(null);
        IdUnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdUnicoActionPerformed(evt);
            }
        });
        jPanel1.add(IdUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 729, 476));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Sin título.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1370, 650));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Random rnd = new Random();
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cadena = "";
        int m = 0, pos = 0, num;
        while (m < 1) {
            pos = (int) (rnd.nextDouble() * abecedario.length() - 1 + 0);
            num = (int) (rnd.nextDouble() * 9999 + 1000);
            cadena = cadena + abecedario.charAt(pos) + num;
            pos = (int) (rnd.nextDouble() * abecedario.length() - 1 + 0);
            cadena = cadena + abecedario.charAt(pos);

            IdUnico.setText(cadena);

            m++;

        }
        Connection con = null;

        try {

            con = getConection();
            FileInputStream archivofoto;
            ps = con.prepareStatement("INSERT INTO responsables (idUsuario, Nombre_de_usuario, Correo_electrónico, Contraseña, Repite_contraseña) VALUES (?, ?, ?, ? ,?)");
            ps.setString(1, IdUnico.getText());
            ps.setString(2, texusuario.getText());
            ps.setString(3, texcorreo.getText());
            ps.setString(4, texcontraseña.getText());
            ps.setString(5, texrepite.getText());

            int res = ps.executeUpdate();

            if (Arrays.equals(texcontraseña.getPassword(), texrepite.getPassword())) {

                if (res > 0) {
                    // CHANGE
                    MenúCrear abrir = new MenúCrear();
                    Inicio.escritorio.add(abrir);
                    abrir.toFront();
                    abrir.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
                    try {
                        abrir.setMaximum(true);
                    } catch (PropertyVetoException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "error ");
                    limpiarCajas();
                }
            } else {
                // CHANGE 
                MensajeContraseña abrir = new MensajeContraseña();
                abrir.main(null);
                limpiarcontraseña();
            }

            con.close();
        } catch (Exception e1) {
            System.err.println(e1);
        }
                Inicio.panelLOGOBO.setVisible(true);
                Inicio.jPanel4.setBackground(Color.white);
                Inicio.PanelBotones4.setVisible(false);
                Inicio.btnAcerca.setVisible(false);
                Inicio.btnCrear.setVisible(false);
                Inicio.btnIniciar.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void texusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texusuarioActionPerformed

    private void texcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texcorreoActionPerformed

    private void texcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texcontraseñaActionPerformed

    private void texrepiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texrepiteActionPerformed
      
          
      
    }//GEN-LAST:event_texrepiteActionPerformed

    private void IdUnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdUnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdUnicoActionPerformed

    private void texrepiteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texrepiteKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        
        Random rnd = new Random();
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cadena = "";
        int m = 0, pos = 0, num;
        while (m < 1) {
            pos = (int) (rnd.nextDouble() * abecedario.length() - 1 + 0);
            num = (int) (rnd.nextDouble() * 9999 + 1000);
            cadena = cadena + abecedario.charAt(pos) + num;
            pos = (int) (rnd.nextDouble() * abecedario.length() - 1 + 0);
            cadena = cadena + abecedario.charAt(pos);

            IdUnico.setText(cadena);

            m++;

        }
        Connection con = null;

        try {

            con = getConection();
            FileInputStream archivofoto;
            ps = con.prepareStatement("INSERT INTO responsables (idUsuario, Nombre_de_usuario, Correo_electrónico, Contraseña, Repite_contraseña) VALUES (?, ?, ?, ? ,?)");
            ps.setString(1, IdUnico.getText());
            ps.setString(2, texusuario.getText());
            ps.setString(3, texcorreo.getText());
            ps.setString(4, texcontraseña.getText());
            ps.setString(5, texrepite.getText());

            int res = ps.executeUpdate();

            if (Arrays.equals(texcontraseña.getPassword(), texrepite.getPassword())) {

                if (res > 0) {
                    // CHANGE
                    MenúCrear abrir = new MenúCrear();
                    Inicio.escritorio.add(abrir);
                    abrir.toFront();
                    abrir.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
                    try {
                        abrir.setMaximum(true);
                    } catch (PropertyVetoException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "error ");
                    limpiarCajas();
                }
            } else {
                // CHANGE 
                MensajeContraseña abrir = new MensajeContraseña();
                abrir.main(null);
                limpiarcontraseña();
            }

            con.close();
        } catch (Exception e1) {
            System.err.println(e1);
        }
                Inicio.panelLOGOBO.setVisible(true);
                Inicio.jPanel4.setBackground(Color.white);
                Inicio.PanelBotones4.setVisible(false);
                Inicio.btnAcerca.setVisible(false);
                Inicio.btnCrear.setVisible(false);
                Inicio.btnIniciar.setVisible(false);
    }
    }//GEN-LAST:event_texrepiteKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdUnico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField texcontraseña;
    private javax.swing.JTextField texcorreo;
    private javax.swing.JPasswordField texrepite;
    private javax.swing.JTextField texusuario;
    // End of variables declaration//GEN-END:variables
}
