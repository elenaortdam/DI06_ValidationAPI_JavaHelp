/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Reserva;
import modelos.TipoCocina;
import modelos.TipoReserva;
import modelos.Validador;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author elena
 */
public class PantallaReservas extends javax.swing.JDialog {
    
    private Validador validador = new Validador();
    private Reserva reserva;
    private List<Reserva> reservas = new ArrayList<>();
    private PantallaTablaReservas tablaReservas;

    /**
     * Creates new form PantallaReservas
     */
    public PantallaReservas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Ocultamos las opciones
        this.opcionesOcultas.setVisible(false);
        this.reserva = new Reserva();
        this.setLocationRelativeTo(null);
        PantallaPrincipal pantallaPrincipal =(PantallaPrincipal) parent;
        tablaReservas = pantallaPrincipal.getTablaReservas();
        ValidationGroup group = validationPanel.getValidationGroup();
        group.add(campoNombre, StringValidators.REQUIRE_NON_EMPTY_STRING);
        
       // group.add(campoTelefono, StringValidators.REQUIRE_NON_NEGATIVE_NUMBER);
        //group.add(campoTelefono, StringValidators.REQUIRE_NON_EMPTY_STRING);
        //group.add(numeroPersonas, StringValidators.REQUIRE_NON_NEGATIVE_NUMBER);
        //group.add(jSpinnerJornadas, StringValidators.REQUIRE_NON_NEGATIVE_NUMBER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroupTipoEvento = new javax.swing.ButtonGroup();
        buttonGroupOpcionesOcultas = new javax.swing.ButtonGroup();
        datosPersonales = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        datosEvento = new javax.swing.JPanel();
        panelTipoEvento = new javax.swing.JPanel();
        tipoEvento = new javax.swing.JLabel();
        banquete = new javax.swing.JRadioButton();
        congreso = new javax.swing.JRadioButton();
        jornada = new javax.swing.JRadioButton();
        panelDatosEvento = new javax.swing.JPanel();
        fechaEvento = new javax.swing.JLabel();
        jSpinnerFechaEvento = new javax.swing.JSpinner();
        numeroPersonas = new javax.swing.JLabel();
        jSpinnerNumeroPersonas = new javax.swing.JSpinner();
        tipoCocina = new javax.swing.JLabel();
        jComboBoxTipoCocina = new javax.swing.JComboBox<>();
        opcionesOcultas = new javax.swing.JPanel();
        textoSpinnerOculto = new javax.swing.JLabel();
        jSpinnerJornadas = new javax.swing.JSpinner();
        textoJRadioButton = new javax.swing.JLabel();
        radioButtonArriba = new javax.swing.JRadioButton();
        radioButtonAbajo = new javax.swing.JRadioButton();
        botones = new javax.swing.JPanel();
        reservar = new javax.swing.JToggleButton();
        validationPanel = new org.netbeans.validation.api.ui.swing.ValidationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        datosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 16))); // NOI18N

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nombre.setText("Nombre: ");
        nombre.setName("Nombre con el que desea realizar la reserva"); // NOI18N

        campoNombre.setToolTipText("Introduzca su nombre...");
        campoNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNombreFocusLost(evt);
            }
        });
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        telefono.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        telefono.setText("Teléfono: ");
        telefono.setToolTipText("Teléfono de contacto");

        campoTelefono.setToolTipText("Introduzca su teléfono...");
        campoTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoTelefonoFocusLost(evt);
            }
        });
        campoTelefono.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                campoTelefonoInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        javax.swing.GroupLayout datosPersonalesLayout = new javax.swing.GroupLayout(datosPersonales);
        datosPersonales.setLayout(datosPersonalesLayout);
        datosPersonalesLayout.setHorizontalGroup(
            datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosPersonalesLayout.createSequentialGroup()
                        .addComponent(nombre)
                        .addGap(7, 7, 7)
                        .addComponent(campoNombre))
                    .addGroup(datosPersonalesLayout.createSequentialGroup()
                        .addComponent(telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefono)))
                .addContainerGap())
        );
        datosPersonalesLayout.setVerticalGroup(
            datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telefono.getAccessibleContext().setAccessibleDescription("");

        datosEvento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 16)), "Datos Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 16))); // NOI18N

        panelTipoEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelTipoEvento.setPreferredSize(new java.awt.Dimension(420, 70));

        tipoEvento.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tipoEvento.setText("Tipo de evento:");
        tipoEvento.setToolTipText("Solo se puede escoger un evento");

        buttonGroupTipoEvento.add(banquete);
        banquete.setText("Banquete");
        banquete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                banqueteItemStateChanged(evt);
            }
        });

        buttonGroupTipoEvento.add(congreso);
        congreso.setText("Congreso");
        congreso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                congresoItemStateChanged(evt);
            }
        });

        buttonGroupTipoEvento.add(jornada);
        jornada.setText("Jornada");
        jornada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jornadaItemStateChanged(evt);
            }
        });

        fechaEvento.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaEvento.setText("Fecha del evento:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tipoCocina, org.jdesktop.beansbinding.ELProperty.create("${verticalAlignment}"), fechaEvento, org.jdesktop.beansbinding.BeanProperty.create("autoscrolls"));
        bindingGroup.addBinding(binding);

        jSpinnerFechaEvento.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), new java.util.Date(1635669840000L), java.util.Calendar.DAY_OF_MONTH));
        jSpinnerFechaEvento.setToolTipText("Fecha en la que se celebrará el evento");
        jSpinnerFechaEvento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerFechaEventoStateChanged(evt);
            }
        });

        numeroPersonas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        numeroPersonas.setText("Nº Personas:");

        jSpinnerNumeroPersonas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        tipoCocina.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tipoCocina.setText("Tipo de cocina:");

        jComboBoxTipoCocina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buffet", "Carta", "Pedir cita con el chef", "No precisa" }));
        jComboBoxTipoCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoCocinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosEventoLayout = new javax.swing.GroupLayout(panelDatosEvento);
        panelDatosEvento.setLayout(panelDatosEventoLayout);
        panelDatosEventoLayout.setHorizontalGroup(
            panelDatosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEventoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosEventoLayout.createSequentialGroup()
                        .addComponent(fechaEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerFechaEvento))
                    .addGroup(panelDatosEventoLayout.createSequentialGroup()
                        .addComponent(tipoCocina)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTipoCocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(numeroPersonas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelDatosEventoLayout.setVerticalGroup(
            panelDatosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEventoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaEvento))
                .addGap(18, 18, 18)
                .addGroup(panelDatosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipoCocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoCocina)
                    .addComponent(numeroPersonas)
                    .addComponent(jSpinnerNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout panelTipoEventoLayout = new javax.swing.GroupLayout(panelTipoEvento);
        panelTipoEvento.setLayout(panelTipoEventoLayout);
        panelTipoEventoLayout.setHorizontalGroup(
            panelTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTipoEventoLayout.createSequentialGroup()
                        .addComponent(tipoEvento)
                        .addGap(8, 8, 8)
                        .addComponent(banquete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(congreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jornada)
                        .addGap(26, 26, 26))
                    .addGroup(panelTipoEventoLayout.createSequentialGroup()
                        .addComponent(panelDatosEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        panelTipoEventoLayout.setVerticalGroup(
            panelTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoEventoLayout.createSequentialGroup()
                .addGroup(panelTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(banquete)
                    .addComponent(congreso)
                    .addComponent(tipoEvento)
                    .addComponent(jornada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(panelDatosEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelDatosEvento.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout datosEventoLayout = new javax.swing.GroupLayout(datosEvento);
        datosEvento.setLayout(datosEventoLayout);
        datosEventoLayout.setHorizontalGroup(
            datosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTipoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );
        datosEventoLayout.setVerticalGroup(
            datosEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        textoSpinnerOculto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textoSpinnerOculto.setText("Nº Jornadas:");

        jSpinnerJornadas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        textoJRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textoJRadioButton.setText("Requiere habitaciones:");

        buttonGroupOpcionesOcultas.add(radioButtonArriba);
        radioButtonArriba.setText("Si");

        buttonGroupOpcionesOcultas.add(radioButtonAbajo);
        radioButtonAbajo.setText("No");

        javax.swing.GroupLayout opcionesOcultasLayout = new javax.swing.GroupLayout(opcionesOcultas);
        opcionesOcultas.setLayout(opcionesOcultasLayout);
        opcionesOcultasLayout.setHorizontalGroup(
            opcionesOcultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesOcultasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(textoSpinnerOculto)
                .addGap(22, 22, 22)
                .addComponent(jSpinnerJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoJRadioButton)
                .addGap(18, 18, 18)
                .addGroup(opcionesOcultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonArriba)
                    .addComponent(radioButtonAbajo))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        opcionesOcultasLayout.setVerticalGroup(
            opcionesOcultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesOcultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioButtonArriba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButtonAbajo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesOcultasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(opcionesOcultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoJRadioButton)
                    .addComponent(textoSpinnerOculto)
                    .addComponent(jSpinnerJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        reservar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        reservar.setText("Reservar");
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(validationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datosEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datosPersonales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(opcionesOcultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datosEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionesOcultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Lógica cuando se hace click sobre el radio button "congreso"
     *
     * @param evt click sobre radio button "congreso"
     */
    private void congresoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_congresoItemStateChanged
        //Si el botón de congresos está seleccionado se le muestran los atributos ocultos
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            this.opcionesOcultas.setVisible(true);
            this.textoSpinnerOculto.setText("Nº Jornadas");
            this.textoJRadioButton.setText("Requiere habitaciones");
            this.radioButtonArriba.setText("Si");
            this.radioButtonAbajo.setText("No");
            this.reserva.setReserva(TipoReserva.CONGRESO);
        }
        //Si se desactiva volvemos a ocultar las opciones relacionadas con el congreso
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            this.opcionesOcultas.setVisible(false);
        }
    }//GEN-LAST:event_congresoItemStateChanged

    /**
     * Lógica cuando se selecciona el radio button "banquete"
     *
     * @param evt click sobre radio button "banquete"
     */
    private void banqueteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_banqueteItemStateChanged
        //Si está activado mostramos las opciones especiales de banquete
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            this.opcionesOcultas.setVisible(true);
            this.textoSpinnerOculto.setText("Comensales/mesa");
            this.textoJRadioButton.setText("Tipo de mesa");
            this.radioButtonArriba.setText("Rectangular");
            this.radioButtonAbajo.setText("Redonda");
            this.reserva.setReserva(TipoReserva.BANQUETE);
        }
        //Si se desactiva las ocultamos
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            this.opcionesOcultas.setVisible(false);
        }
    }//GEN-LAST:event_banqueteItemStateChanged

    /**
     * Se le muestra un mensaje de confirmación cuando pulsa el botón de
     * reservar
     *
     * @param evt click en el botón reservar
     */
    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        if (this.campoNombre == null || this.campoNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo nombre es obligatorio");
            return;
        }
        if (this.campoTelefono == null || this.campoTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo telefono es obligatorio");
            return;
        }
        if (this.reserva.getReserva() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione el tipo de reserva");
            return;
        }
        JOptionPane.showMessageDialog(this, "¡Enhorabuena! La reserva se ha realizado con éxito");
        Reserva reserva = new Reserva();
        reserva.setNombre(this.campoNombre.getText());
        reserva.setTelefono(this.campoTelefono.getText());
        reserva.setReserva(this.reserva.getReserva());
        reserva.setFechaReserva(this.fechaEvento.getText());
        reserva.setTipoCocina(TipoCocina.BUFFET);
        reserva.setNumeroPersonas((int) this.jSpinnerNumeroPersonas.getValue());
        this.tablaReservas.addReserva(reserva);
    }//GEN-LAST:event_reservarActionPerformed

    /**
     * Comprobamos que el teléfono está relleno correctamente
     *
     * @param evt cuando pierde el foco del campo
     */
    private void campoTelefonoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_campoTelefonoInputMethodTextChanged
        String telefono = this.campoTelefono.getText();
        
        if (!validador.validarTelefono(telefono)) {
            this.telefono.setForeground(Color.red);
            JOptionPane.showMessageDialog(this, "El telefono introducido no es válido");
        } else {
            this.reserva.setTelefono(telefono);
            this.telefono.setForeground(Color.black);
            this.reserva.setTelefono(telefono);
        }
    }//GEN-LAST:event_campoTelefonoInputMethodTextChanged

    private void campoNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreFocusLost

    }//GEN-LAST:event_campoNombreFocusLost

    /**
     * Completamos el dato tipo de reserva
     *
     * @param evt cambio del estado del botón "jornada"
     */
    private void jornadaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jornadaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            this.reserva.setReserva(TipoReserva.JORNADA);
        }
    }//GEN-LAST:event_jornadaItemStateChanged

    /**
     * Completamos la fecha de reserva
     *
     * @param evt modificación de los datos del spinner de fecha
     */
    private void jSpinnerFechaEventoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerFechaEventoStateChanged
        this.reserva.setFechaReserva(new SimpleDateFormat("yyyy/MM/dd").format(this.jSpinnerFechaEvento.getValue()));
    }//GEN-LAST:event_jSpinnerFechaEventoStateChanged

    /**
     * Completamos el dato "Tipo de cocina" a partir de lo seleccionado por el
     * usuario
     *
     * @param evt acción efectuada por el usuario en el combo box de "tipo de
     * cocina"
     */
    private void jComboBoxTipoCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoCocinaActionPerformed
        this.reserva.setTipoCocina(TipoCocina.valueOf((String) this.jComboBoxTipoCocina.getSelectedItem()));
    }//GEN-LAST:event_jComboBoxTipoCocinaActionPerformed

    /**
     * Si se quita el foco sobre el campo teléfono comprobamos que no está vacío
     *
     * @param evt pérdida del foco sobre el campo "teléfono"
     */
    private void campoTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoTelefonoFocusLost
        String telefono = this.campoTelefono.getText();
        if (telefono == null || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El telefono es obligatorio");
            
        }

     }//GEN-LAST:event_campoTelefonoFocusLost

    /**
     * Comprueba que el nombre introducido es correcto
     *
     * @param evt acciones sobre el campo "nombre"
     */
    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        final String nombre = this.campoNombre.getText();
        
        if (!validador.validarNombre(nombre)) {
            this.campoNombre.setForeground(Color.red);
            JOptionPane.showMessageDialog(this, "El nombre introducido no es válido");
        } else {
            this.reserva.setNombre(nombre);
            this.campoNombre.setForeground(Color.black);
        }    }//GEN-LAST:event_campoNombreActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton banquete;
    private javax.swing.JPanel botones;
    private javax.swing.ButtonGroup buttonGroupOpcionesOcultas;
    private javax.swing.ButtonGroup buttonGroupTipoEvento;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JRadioButton congreso;
    private javax.swing.JPanel datosEvento;
    private javax.swing.JPanel datosPersonales;
    private javax.swing.JLabel fechaEvento;
    private javax.swing.JComboBox<String> jComboBoxTipoCocina;
    private javax.swing.JSpinner jSpinnerFechaEvento;
    private javax.swing.JSpinner jSpinnerJornadas;
    private javax.swing.JSpinner jSpinnerNumeroPersonas;
    private javax.swing.JRadioButton jornada;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numeroPersonas;
    private javax.swing.JPanel opcionesOcultas;
    private javax.swing.JPanel panelDatosEvento;
    private javax.swing.JPanel panelTipoEvento;
    private javax.swing.JRadioButton radioButtonAbajo;
    private javax.swing.JRadioButton radioButtonArriba;
    private javax.swing.JToggleButton reservar;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel textoJRadioButton;
    private javax.swing.JLabel textoSpinnerOculto;
    private javax.swing.JLabel tipoCocina;
    private javax.swing.JLabel tipoEvento;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaReservas(new PantallaPrincipal(), true).setVisible(true);
            }
        });
    }
    
}
