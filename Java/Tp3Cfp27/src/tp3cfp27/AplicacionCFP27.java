/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3cfp27;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Katsuo
 */
public class AplicacionCFP27 extends javax.swing.JFrame {

    private static final ImageIcon ICON = new ImageIcon("imagenes/icon.png");
    
    private static final String NOMBRE_EDICION_DESACTIVADA = "Edicion";
    private static final String NOMBRE_EDICION_ACTIVADA = "Desactivar";

    private static final int MAX_CARACTERES_COMENTARIO = 500;
    private static final String SEPARADOR_CONTADOR_CARACTERES = "/";

    private static final String PANEL_USUARIO = "Panel usuario";
    private static final String PANEL_INGRESO = "Panel ingreso";
    private static final String PANEL_TABLA_ESTUDIANTES = "Panel tabla estudiantes";
    private static final String PANEL_REGISTRO = "Panel registro";

    private static final String DEF_CONTRASENIA = "def contraseña";
    private static final String DEF_USUARIO = "Usuario";

    private static final String DEF_USUARIO_VACIO = "";
    private static final String DEF_CONTRASENIA_VACIO = "";

    private static final boolean CONFIG_TAM_DEF_APP = false;

    private static final boolean MSJ_VISIBILIIDAD_DEF_ERROR = false;
    private static final boolean MSJ_ERROR_NO_GENERADO = false;
    private static final boolean MSJ_ERROR_GENERADO = true;

    private static final boolean INFO_NO_EDITABLE = false;
    private static final boolean INFO_EDITABLE = true;

    private static final boolean BOTON_EDICION_DESACTIVADO = false;
    private static final boolean BOTON_EDICION_ACTIVADA = true;

    private static final Component POSICION_CENTRO_DEF = null;

    private CardLayout controladorVentanas;

    private ConexionDB conexionCfp27;

    private static final boolean EDICION_ACTIVADA = true;
    private static final boolean EDICION_DESACTIVADA = false;
    
    private static final boolean VISIBILIDAD_ERROR_REGISTRO_INICIAL = false; 
    private static final boolean VISIBILIDAD_ERROR_REGISTRO_ACTIVADO = true; 

    private boolean estadoEdicionInfoUsuario = EDICION_DESACTIVADA;

    /**
     * Creates new form AplicacionCFP27
     */
    public AplicacionCFP27() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//cuando seleccione cerrar la aplicacion X entonces no quiero que haga nada
        conexionCfp27 = new ConexionDB();

        jPasswordFieldContrasenia.setText(DEF_CONTRASENIA);
        jTextFieldUsuario.setText(DEF_USUARIO);

        controladorVentanas = new CardLayout();

        jPanelPrincipal.setLayout(controladorVentanas);//asignado el contralor de ventanas al panel principal
        jPanelPrincipal.add(jPanelIngreso, PANEL_INGRESO);//agrega el panel ingreso al panel principal para contenerlo
        jPanelPrincipal.add(jPanelUsuario, PANEL_USUARIO);//agrega el panel usuario al panel principal para contenerlo
        jPanelPrincipal.add(jPanelRegistro, PANEL_REGISTRO);//agrega el panel registro al panel principal para contenerlo
        
        //agrega el panel de la tabla de estudiantes al panel principal para contenerlo
        jPanelPrincipal.add(jPanelTablaEstudiantes, PANEL_TABLA_ESTUDIANTES);

        configuracionPanelPrincipal(PANEL_INGRESO, jPanelIngreso.getPreferredSize());

        this.setResizable(CONFIG_TAM_DEF_APP);//evita que la ventana se pueda modificar de tamaño

        jLabelErrorIngreso.setVisible(MSJ_VISIBILIIDAD_DEF_ERROR);//al inicar la aplicacion este componente no sera visible
        jLabelRegistroError.setVisible(VISIBILIDAD_ERROR_REGISTRO_INICIAL);
        
        jTextFieldValorPromedio.setEditable(INFO_NO_EDITABLE);
        jTextFieldValorPromedio.setFocusable(INFO_NO_EDITABLE);
        configuracionInfoUsuario(INFO_NO_EDITABLE);//inicia el valor de los estados en los campos de info usuario en falso (no editable)

        //configuracionVentanaOpcion();
    }
    
    

    private int configuracionVentanaOpcionGuardar() {
        
        int opcionUsuario = jOptionPaneVentana.showConfirmDialog(this, "Desea realizar los cambios?",
                "Confirmar edicion", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ICON);
        return opcionUsuario;
    }

    /**
     * Modificar el estado de edicion y enfoque de los componentes. Dependiendo
     * del valor de "editable" lo campos podran o no ser editados y enfocados
     *
     * @param editable contiene el valor del estado de edicion y enfoque de los
     * campos
     */
    private void configuracionInfoUsuario(boolean editable) {
        jTextFieldNombre.setEditable(editable);
        jTextFieldNombre.setFocusable(editable);

        jTextFieldEmail.setEditable(editable);
        jTextFieldEmail.setFocusable(editable);

        jTextAreaComentario.setEditable(editable);
        jTextAreaComentario.setFocusable(editable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIngreso = new javax.swing.JPanel();
        jButtonIngresar = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldContrasenia = new javax.swing.JPasswordField();
        jLabelErrorIngreso = new javax.swing.JLabel();
        jButtonRegistrarse = new javax.swing.JButton();
        jPanelUsuario = new javax.swing.JPanel();
        jButtonCerrarSesion = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldValorPromedio = new javax.swing.JTextField();
        jLabelPromedio = new javax.swing.JLabel();
        jToggleButtonEdicion = new javax.swing.JToggleButton();
        jScrollPaneComentario = new javax.swing.JScrollPane();
        jTextAreaComentario = new javax.swing.JTextArea();
        jLabelCantidadCaracteres = new javax.swing.JLabel();
        jButtonMostrarTabla = new javax.swing.JButton();
        jButtonBaja = new javax.swing.JButton();
        jOptionPaneVentana = new javax.swing.JOptionPane();
        jPanelTablaEstudiantes = new javax.swing.JPanel();
        jScrollPaneTablaEstudiantes = new javax.swing.JScrollPane();
        jTableEstudiantes = new javax.swing.JTable();
        jButtonVolverPanelUsuario = new javax.swing.JButton();
        jPanelRegistro = new javax.swing.JPanel();
        jLabelRegistroTitulo = new javax.swing.JLabel();
        jLabelRegistroNombre = new javax.swing.JLabel();
        jLabelRegistroEmail = new javax.swing.JLabel();
        jLabelRegistroContrasenia = new javax.swing.JLabel();
        jLabelRegistroRepetirContrasenia = new javax.swing.JLabel();
        jTextFieldRegistroNombre = new javax.swing.JTextField();
        jTextFieldRegistroEmail = new javax.swing.JTextField();
        jPasswordFieldRegistroContrasenia = new javax.swing.JPasswordField();
        jPasswordFieldRegistroRepetirContrasenia = new javax.swing.JPasswordField();
        jButtonRegistrar = new javax.swing.JButton();
        jLabelRegistroError = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();

        jButtonIngresar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseClicked(evt);
            }
        });

        jTextFieldUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldUsuario.setText("jTextField1");
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusLost(evt);
            }
        });

        jPasswordFieldContrasenia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPasswordFieldContrasenia.setText("como estan ? ");
        jPasswordFieldContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseniaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseniaFocusLost(evt);
            }
        });

        jLabelErrorIngreso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelErrorIngreso.setForeground(new java.awt.Color(255, 51, 102));
        jLabelErrorIngreso.setText("Error, usuario y/o contraseña incorrectos");

        jButtonRegistrarse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIngresoLayout = new javax.swing.GroupLayout(jPanelIngreso);
        jPanelIngreso.setLayout(jPanelIngresoLayout);
        jPanelIngresoLayout.setHorizontalGroup(
            jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngresoLayout.createSequentialGroup()
                .addGap(0, 91, Short.MAX_VALUE)
                .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordFieldContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelErrorIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIngresoLayout.setVerticalGroup(
            jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPasswordFieldContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButtonIngresar)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabelErrorIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        jButtonCerrarSesion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonCerrarSesion.setText("Cerrar sesion");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jTextFieldEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldEmail.setText("Email");

        jTextFieldNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldNombre.setText("Nombre");

        jTextFieldValorPromedio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldValorPromedio.setText("-");

        jLabelPromedio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPromedio.setText("Promedio:");

        jToggleButtonEdicion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jToggleButtonEdicion.setText("Editar");
        jToggleButtonEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEdicionActionPerformed(evt);
            }
        });

        jTextAreaComentario.setColumns(20);
        jTextAreaComentario.setLineWrap(true);
        jTextAreaComentario.setRows(5);
        jTextAreaComentario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextAreaComentarioCaretUpdate(evt);
            }
        });
        jTextAreaComentario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaComentarioKeyTyped(evt);
            }
        });
        jScrollPaneComentario.setViewportView(jTextAreaComentario);

        jLabelCantidadCaracteres.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelCantidadCaracteres.setText("-/500");

        jButtonMostrarTabla.setText("Ver compañeros");
        jButtonMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTablaActionPerformed(evt);
            }
        });

        jButtonBaja.setText("Dar baja");
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCerrarSesion)
                .addGap(24, 24, 24))
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jToggleButtonEdicion))
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                                .addComponent(jButtonBaja)
                                .addGap(255, 255, 255)
                                .addComponent(jButtonMostrarTabla))
                            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabelPromedio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCantidadCaracteres)
                    .addComponent(jScrollPaneComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(696, Short.MAX_VALUE)))
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorPromedio))
                        .addGap(39, 39, 39)
                        .addComponent(jToggleButtonEdicion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuarioLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPaneComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCantidadCaracteres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jButtonMostrarTabla)
                        .addGap(9, 9, 9)
                        .addComponent(jButtonCerrarSesion)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBaja)
                        .addGap(31, 31, 31))))
            .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(330, Short.MAX_VALUE)))
        );

        jTableEstudiantes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneTablaEstudiantes.setViewportView(jTableEstudiantes);

        jButtonVolverPanelUsuario.setText("Atras");
        jButtonVolverPanelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverPanelUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTablaEstudiantesLayout = new javax.swing.GroupLayout(jPanelTablaEstudiantes);
        jPanelTablaEstudiantes.setLayout(jPanelTablaEstudiantesLayout);
        jPanelTablaEstudiantesLayout.setHorizontalGroup(
            jPanelTablaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTablaEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
            .addGroup(jPanelTablaEstudiantesLayout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jButtonVolverPanelUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTablaEstudiantesLayout.setVerticalGroup(
            jPanelTablaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaEstudiantesLayout.createSequentialGroup()
                .addComponent(jScrollPaneTablaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButtonVolverPanelUsuario)
                .addContainerGap())
        );

        jLabelRegistroTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelRegistroTitulo.setText("Registro");

        jLabelRegistroNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelRegistroNombre.setText("Nombre:");

        jLabelRegistroEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelRegistroEmail.setText("Email:");

        jLabelRegistroContrasenia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelRegistroContrasenia.setText("Contraseña:");

        jLabelRegistroRepetirContrasenia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelRegistroRepetirContrasenia.setText("Repetir contraseña:");

        jTextFieldRegistroNombre.setColumns(17);
        jTextFieldRegistroNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jTextFieldRegistroEmail.setColumns(17);
        jTextFieldRegistroEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jPasswordFieldRegistroContrasenia.setColumns(17);

        jPasswordFieldRegistroRepetirContrasenia.setColumns(17);

        jButtonRegistrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jLabelRegistroError.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelRegistroError.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRegistroError.setText("Error, contraseñas no coinciden");

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabelRegistroTitulo))
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRegistroRepetirContrasenia)
                            .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelRegistroContrasenia)
                                .addComponent(jLabelRegistroEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelRegistroNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRegistroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRegistroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldRegistroContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldRegistroRepetirContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRegistrar))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelRegistroError)
                .addGap(96, 96, 96))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelRegistroTitulo)
                .addGap(28, 28, 28)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistroNombre)
                    .addComponent(jTextFieldRegistroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistroEmail)
                    .addComponent(jTextFieldRegistroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistroContrasenia)
                    .addComponent(jPasswordFieldRegistroContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistroRepetirContrasenia)
                    .addComponent(jPasswordFieldRegistroRepetirContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrar)
                .addGap(33, 33, 33)
                .addComponent(jLabelRegistroError)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseClicked
        if (conexionCfp27.verificarUsuarioRegistrado(jTextFieldUsuario.getText(),
                new String(jPasswordFieldContrasenia.getPassword()))) {
            jTextFieldUsuario.setText(DEF_USUARIO);//cambiar el texto del campo de usuario a "Usuario"
            jPasswordFieldContrasenia.setText(DEF_CONTRASENIA);//cambiar el texto de campo de contraseña a "def contraseña"
            configuracionPanelPrincipal(PANEL_USUARIO, jPanelUsuario.getPreferredSize());//cambio al panel de usuario
            jLabelErrorIngreso.setVisible(MSJ_ERROR_NO_GENERADO);//oculto el mensaje del error una vez que el usuario logro ingresar

            Estudiante auxEstudiante = conexionCfp27.getEstudianteVerificado();//guardo info del estudiante verificado en auxEstudiante
            // para no acceder todo el tiempo con conexionCfp27
            jTextFieldNombre.setText(auxEstudiante.getNombre());
            jTextFieldEmail.setText(auxEstudiante.getEmail());
            jTextAreaComentario.setText(auxEstudiante.getComentario());
            float promedio = 0;

            for (int nota : auxEstudiante.getNotas()) {//sumo todas las notas en la variable "promedio"  
                promedio += nota;//suma el valor actual de "promedio" con el valor actual de "nota"
            }

            jTextFieldValorPromedio.setText(Float.toString(promedio / Estudiante.MAX_NOTAS));

        } else {
            jLabelErrorIngreso.setVisible(MSJ_ERROR_GENERADO);//codigo para que se muestre el mensaje del error
        }
    }//GEN-LAST:event_jButtonIngresarMouseClicked

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained
        // TODO add your handling code here:
        if (jTextFieldUsuario.getText().equals(DEF_USUARIO)) {
            jTextFieldUsuario.setText(DEF_USUARIO_VACIO);
        }
    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    private void jTextFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusLost
        if (jTextFieldUsuario.getText().equals(DEF_USUARIO_VACIO)) {
            jTextFieldUsuario.setText(DEF_USUARIO);
        }
    }//GEN-LAST:event_jTextFieldUsuarioFocusLost

    private void jPasswordFieldContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseniaFocusGained
        if (new String(jPasswordFieldContrasenia.getPassword()).equals(DEF_CONTRASENIA)) {
            jPasswordFieldContrasenia.setText(DEF_CONTRASENIA_VACIO);
        }
    }//GEN-LAST:event_jPasswordFieldContraseniaFocusGained

    private void jPasswordFieldContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseniaFocusLost
        if (new String(jPasswordFieldContrasenia.getPassword()).equals(DEF_CONTRASENIA_VACIO)) {
            jPasswordFieldContrasenia.setText(DEF_CONTRASENIA);
        }
    }//GEN-LAST:event_jPasswordFieldContraseniaFocusLost

    private void jToggleButtonEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEdicionActionPerformed
        
        if (!estadoEdicionInfoUsuario) {// si la edicion esta desactivada entonces la activa
            configuracionEstadoEdicionInfoUsuario(INFO_EDITABLE, NOMBRE_EDICION_ACTIVADA, EDICION_ACTIVADA);
        } else {
            if (!duplicidadInfo()) {
                switch (configuracionVentanaOpcionGuardar()) {
                    case JOptionPane.YES_OPTION:
                        System.out.println("Si, guardar");
                        configuracionEstadoEdicionInfoUsuario(INFO_NO_EDITABLE, NOMBRE_EDICION_DESACTIVADA, EDICION_DESACTIVADA);
                        comenzarActualizacionInfoUsuario();
                        break;
                    case JOptionPane.NO_OPTION:
                        System.out.println("No, descartar");
                        configuracionEstadoEdicionInfoUsuario(INFO_NO_EDITABLE, NOMBRE_EDICION_DESACTIVADA, EDICION_DESACTIVADA);
                        descartarActualiacion();
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        System.out.println("Cerrar, seguir editando");
                        jToggleButtonEdicion.setSelected(BOTON_EDICION_ACTIVADA);
                        break;
                    default:
                        System.out.println("Opcion usuario no considerada");
                }
            } else {
                configuracionEstadoEdicionInfoUsuario(INFO_NO_EDITABLE, NOMBRE_EDICION_DESACTIVADA, EDICION_DESACTIVADA);
            }
        }
    }//GEN-LAST:event_jToggleButtonEdicionActionPerformed

    private void descartarActualiacion(){
        Estudiante auxEstudiante = conexionCfp27.getEstudianteVerificado();
        jTextFieldNombre.setText(auxEstudiante.getNombre());
        jTextFieldEmail.setText(auxEstudiante.getEmail());
        jTextAreaComentario.setText(auxEstudiante.getComentario());
    }
    
    private boolean duplicidadInfo() {
        boolean iguales = false;// valor incial para el resultado de "iguales"
        Estudiante auxEstudiante = conexionCfp27.getEstudianteVerificado();

        if (auxEstudiante.getNombre().equals(jTextFieldNombre.getText())
                && auxEstudiante.getEmail().equals(jTextFieldEmail.getText())
                && auxEstudiante.getComentario().equals(jTextAreaComentario.getText())) {
            System.out.println("la informacion no cambio");
            iguales = true;
        }
        return iguales;
    }


    private void jTextAreaComentarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextAreaComentarioCaretUpdate
        System.out.println("Tamanio del vector/texto " + jTextAreaComentario.getText().length());
        jLabelCantidadCaracteres.setText(jTextAreaComentario.getText().length() + SEPARADOR_CONTADOR_CARACTERES + MAX_CARACTERES_COMENTARIO);
    }//GEN-LAST:event_jTextAreaComentarioCaretUpdate

    private void jTextAreaComentarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaComentarioKeyTyped
        System.out.println("presionamos un caracter");
        if (jTextAreaComentario.getText().length() == MAX_CARACTERES_COMENTARIO) {
            evt.consume();// cancelar el evento, evitamos que el caracter ingresado quede en el comentario
            System.out.println("Llego al maximo de caracteres");
        } else if (jTextAreaComentario.getText().length() > MAX_CARACTERES_COMENTARIO) {

            //recorto el texto del comentario y lo guardo en el mismo
            jTextAreaComentario.setText(jTextAreaComentario.getText().substring(0, MAX_CARACTERES_COMENTARIO));
            System.out.println("Texto sobrepasa el maximo, recortando texto");
        }
    }//GEN-LAST:event_jTextAreaComentarioKeyTyped

    private void jButtonMostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTablaActionPerformed
        Estudiante[] auxEstudiantesRegistrados = conexionCfp27.obtenerInfoEstudiantes();
        
        //usar una tabla por defecto para modificar la tabla de estudiantes
        DefaultTableModel tablaBase = (DefaultTableModel) jTableEstudiantes.getModel();
        
        tablaBase.setRowCount(0);//settear las filas en 0 (vacia las filas)
        tablaBase.setColumnCount(0);//settear las columnas en 0 (vacia las columnas)
        
        tablaBase.addColumn("nombre");//agregamos una columna
        tablaBase.addColumn("email");//agregamos una columna
        tablaBase.addColumn("comentario");//agregamos una columna
        tablaBase.addColumn("promedio");//agregamos una columna
                        
        //tablaBase.addRow(new String[]{"1","2","3"});//agregamos una fila entera
        //tablaBase.addRow(new String[]{"4","5","6"});//agregamos una fila entera
        float promedio = 0F;
        for(Estudiante auxEstudiante : auxEstudiantesRegistrados){
            for(int nota : auxEstudiante.getNotas()){
                promedio += nota;//suma todas las notas
            }
            promedio /= Estudiante.MAX_NOTAS;//calcula el promedio "promedio = promedio/ Estudiiante.MAX_NOTAS"
            
            tablaBase.addRow(new String[]{
                    auxEstudiante.getNombre(),
                    auxEstudiante.getEmail(),
                    auxEstudiante.getComentario(),
                    Float.toString(promedio)
                }
            );            
            promedio = 0F;
        }
        
        //conexionCfp27.obtenerListadoEstudiantes();
        //se encarga de mostrar el panel de la tabla de estudiantes
        configuracionPanelPrincipal(PANEL_TABLA_ESTUDIANTES, jPanelTablaEstudiantes.getPreferredSize());
    }//GEN-LAST:event_jButtonMostrarTablaActionPerformed

    private void jButtonVolverPanelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverPanelUsuarioActionPerformed
        configuracionPanelPrincipal(PANEL_USUARIO, jPanelUsuario.getPreferredSize());
    }//GEN-LAST:event_jButtonVolverPanelUsuarioActionPerformed

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        Box contenedorVentana = Box.createHorizontalBox();//creo un objeto para diseñar la ventana a mostrar
        
        JLabel mensajeVentana = new JLabel("Contraseña: ");//crear un componente JLabel para mostrar un mensaje en especifico
        contenedorVentana.add(mensajeVentana);//agrego el componente JLabel "mensajeVentana" al "contenedorVentana"
        
        JPasswordField contenedorContrasenia = new JPasswordField(24);//creo un componente JPasswordField 
        contenedorVentana.add(contenedorContrasenia);//agrego el componente "contenedorContrasenia" al "contenedorVentana"
                
        int opcionBaja = jOptionPaneVentana.showConfirmDialog(this, contenedorVentana, "Verificar baja", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if(opcionBaja == JOptionPane.OK_OPTION){
            System.out.println("si, dar de baja");
            if(conexionCfp27.bajaUsuario(  new String (contenedorContrasenia.getPassword())  )){
                System.out.println("mostrar ventana de baja exitosa");
                jOptionPaneVentana.showMessageDialog(this, "Cuenta eliminatada correctamente.\nRegresando a la ventana de ingreso");
                reiniciarApp();//llamo al metodo para regresar al panel ingreso
            }else{
                jOptionPaneVentana.showMessageDialog(this, "Error: contraseña no es correcta");                
            }
        }else{
            System.out.println("no, cancelar baja");
        }
        
    }//GEN-LAST:event_jButtonBajaActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        reiniciarApp();
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed
        configuracionPanelPrincipal(PANEL_REGISTRO, jPanelRegistro.getPreferredSize());
    }//GEN-LAST:event_jButtonRegistrarseActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        String contrasenia = new String(jPasswordFieldRegistroContrasenia.getPassword());
        if(contrasenia.equals( new String(jPasswordFieldRegistroRepetirContrasenia.getPassword()) ) ){
            System.out.println("las contrasenias son iguales");
            conexionCfp27.registrarUsuario(
                    jTextFieldRegistroNombre.getText(),
                    jTextFieldRegistroEmail.getText(),
                    contrasenia
                    );
            jOptionPaneVentana.showMessageDialog(this, "Registro completado.\nVolviendo a la ventana de ingreso");
            reiniciarApp();
        }else{
           jLabelRegistroError.setVisible(VISIBILIDAD_ERROR_REGISTRO_ACTIVADO);
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opcionCerrar = jOptionPaneVentana.showConfirmDialog(
                this,
                "Esta seguro de cerrar esta aplicacion?",
                "Cerrar Aplicacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                ICON);
        if(opcionCerrar == JOptionPane.YES_OPTION){
            conexionCfp27.terminarConexion();//cierra conexion de la db
            System.exit(0);//return 0; - cierra la aplicacion
        }        
    }//GEN-LAST:event_formWindowClosing
    
    /**
     * Vuelve al estado inicial de la aplicacion.
     * Reinicia el estado de edicion del usuario y el boton de edicion
     */
    private void reiniciarApp(){
        configuracionPanelPrincipal(PANEL_INGRESO, jPanelIngreso.getPreferredSize());//cambio al panel de ingreso
        configuracionEstadoEdicionInfoUsuario(INFO_NO_EDITABLE, NOMBRE_EDICION_DESACTIVADA, EDICION_DESACTIVADA);
        if (jToggleButtonEdicion.isSelected()) { // verifica si el toggle button esta activado
            jToggleButtonEdicion.setSelected(BOTON_EDICION_DESACTIVADO);// simula el click para settear el toggle button como desactivado
        }
        jLabelErrorIngreso.setVisible(MSJ_VISIBILIIDAD_DEF_ERROR);
    }
    
    private void comenzarActualizacionInfoUsuario(){
        Estudiante estudianteInfoNueva = new Estudiante(
                jTextFieldNombre.getText(),
                jTextFieldEmail.getText(),
                jTextAreaComentario.getText());
        conexionCfp27.actualizarInformacionEstudiante(estudianteInfoNueva);
    }
    
    /**
     * Configura el estado de los componentes para la info del usuario.
     */
    private void configuracionEstadoEdicionInfoUsuario(boolean infoUsuarioEditable, String nombreBoton, boolean estadoEdicion) {
        configuracionInfoUsuario(infoUsuarioEditable);
        jToggleButtonEdicion.setText(nombreBoton);
        estadoEdicionInfoUsuario = estadoEdicion;
    }

    /**
     * Configura el panel principal. Modifica el tamanio al panel a mostrar y la
     * posicion al centro de la pantalla
     *
     * @param nombrePanel nombre del panel a mostrar
     * @param tamanioPanel tamanio del panel a mostrar
     */
    private void configuracionPanelPrincipal(String nombrePanel, Dimension tamanioPanel) {
        controladorVentanas.show(jPanelPrincipal, nombrePanel);
        jPanelPrincipal.setPreferredSize(tamanioPanel);
        this.pack();//asigna el tamaño de ventana correspondiente al panel asignado
        this.setLocationRelativeTo(POSICION_CENTRO_DEF);//inicializa la ventana en el centro de la pantalla
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplicacionCFP27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacionCFP27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacionCFP27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacionCFP27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacionCFP27().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonMostrarTabla;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JButton jButtonVolverPanelUsuario;
    private javax.swing.JLabel jLabelCantidadCaracteres;
    private javax.swing.JLabel jLabelErrorIngreso;
    private javax.swing.JLabel jLabelPromedio;
    private javax.swing.JLabel jLabelRegistroContrasenia;
    private javax.swing.JLabel jLabelRegistroEmail;
    private javax.swing.JLabel jLabelRegistroError;
    private javax.swing.JLabel jLabelRegistroNombre;
    private javax.swing.JLabel jLabelRegistroRepetirContrasenia;
    private javax.swing.JLabel jLabelRegistroTitulo;
    private javax.swing.JOptionPane jOptionPaneVentana;
    private javax.swing.JPanel jPanelIngreso;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelTablaEstudiantes;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JPasswordField jPasswordFieldContrasenia;
    private javax.swing.JPasswordField jPasswordFieldRegistroContrasenia;
    private javax.swing.JPasswordField jPasswordFieldRegistroRepetirContrasenia;
    private javax.swing.JScrollPane jScrollPaneComentario;
    private javax.swing.JScrollPane jScrollPaneTablaEstudiantes;
    private javax.swing.JTable jTableEstudiantes;
    private javax.swing.JTextArea jTextAreaComentario;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRegistroEmail;
    private javax.swing.JTextField jTextFieldRegistroNombre;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldValorPromedio;
    private javax.swing.JToggleButton jToggleButtonEdicion;
    // End of variables declaration//GEN-END:variables
}
