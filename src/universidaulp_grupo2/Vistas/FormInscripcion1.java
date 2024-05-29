/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidaulp_grupo2.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidaulp_grupo2.AccesoAdatos.AlumnoData;
import universidaulp_grupo2.AccesoAdatos.InscripcionData;
import universidaulp_grupo2.AccesoAdatos.MateriaData;
import universidaulp_grupo2.Entidades.Alumno;
import universidaulp_grupo2.Entidades.Inscripcion;
import universidaulp_grupo2.Entidades.Materia;


public class FormInscripcion1 extends javax.swing.JInternalFrame {
    private List<Materia> lMateria;
    private List<Alumno> lAlumno;
    private InscripcionData inscData;
    private MateriaData mateData;
    private AlumnoData aluData;
    private DefaultTableModel modelo;
    
    
    public FormInscripcion1() {
        initComponents();
        
        aluData = new AlumnoData();
        inscData = new InscripcionData();
        mateData = new MateriaData();
        lAlumno = aluData.listarAlumnos();
        modelo = new DefaultTableModel();
        cargaAlumnos();
        armarCabecera();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jcListaAlumnos1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jcListaAlumnos2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTabla1 = new javax.swing.JTable();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jcListaAlumnos3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JRBinscriptas = new javax.swing.JRadioButton();
        JRBnoinscriptas = new javax.swing.JRadioButton();
        jBinscribir = new javax.swing.JButton();
        jBanular = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTablaMate = new javax.swing.JTable();

        setClosable(true);

        jInternalFrame1.setClosable(true);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FORMULARIO DE INSCRIPCION");

        jcListaAlumnos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcListaAlumnos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcListaAlumnos1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione un Alumno");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LISTADO DE MATERIAS");

        jRadioButton1.setText("Materias inscriptas");

        jRadioButton2.setText("Materias No inscriptas");

        jButton1.setText("Inscribir");

        jButton2.setText("Anular Inscripcion");

        jButton3.setText("Salir");

        jtTabla.setBackground(new java.awt.Color(118, 171, 174));
        jtTabla.setForeground(new java.awt.Color(0, 51, 255));
        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTabla);

        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcListaAlumnos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcListaAlumnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jRadioButton2)
                        .addGap(75, 75, 75))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcListaAlumnos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jInternalFrame2.setClosable(true);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FORMULARIO DE INSCRIPCION");

        jcListaAlumnos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcListaAlumnos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcListaAlumnos2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un Alumno");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LISTADO DE MATERIAS");

        jRadioButton3.setText("Materias inscriptas");

        jRadioButton4.setText("Materias No inscriptas");

        jButton4.setText("Inscribir");

        jButton5.setText("Anular Inscripcion");

        jButton6.setText("Salir");

        jtTabla1.setBackground(new java.awt.Color(118, 171, 174));
        jtTabla1.setForeground(new java.awt.Color(0, 51, 255));
        jtTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtTabla1);

        jDesktopPane3.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jcListaAlumnos2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jRadioButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcListaAlumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addGap(27, 27, 27)
                        .addComponent(jRadioButton4)
                        .addGap(75, 75, 75))))
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcListaAlumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FORMULARIO DE INSCRIPCION");

        jcListaAlumnos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcListaAlumnos3ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione un Alumno");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LISTADO DE MATERIAS");

        JRBinscriptas.setForeground(new java.awt.Color(255, 255, 255));
        JRBinscriptas.setText("Materias inscriptas");
        JRBinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBinscriptasActionPerformed(evt);
            }
        });

        JRBnoinscriptas.setForeground(new java.awt.Color(255, 255, 255));
        JRBnoinscriptas.setText("Materias No inscriptas");
        JRBnoinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnoinscriptasActionPerformed(evt);
            }
        });

        jBinscribir.setText("Inscribir");
        jBinscribir.setEnabled(false);
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });

        jBanular.setText("Anular Inscripcion");
        jBanular.setEnabled(false);
        jBanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jtTablaMate.setBackground(new java.awt.Color(118, 171, 174));
        jtTablaMate.setForeground(new java.awt.Color(0, 51, 255));
        jtTablaMate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtTablaMate);

        jDesktopPane4.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jcListaAlumnos3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(JRBinscriptas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(JRBnoinscriptas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jBinscribir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jBanular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jBsalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JRBinscriptas)
                .addGap(27, 27, 27)
                .addComponent(JRBnoinscriptas)
                .addGap(75, 75, 75))
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addComponent(jBinscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jBanular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcListaAlumnos3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcListaAlumnos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBinscriptas)
                    .addComponent(JRBnoinscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBanular)
                    .addComponent(jBinscribir))
                .addGap(26, 26, 26))
        );

        jDesktopPane2.setLayer(jInternalFrame2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jDesktopPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 231, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 231, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcListaAlumnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcListaAlumnos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcListaAlumnos1ActionPerformed

    private void jcListaAlumnos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcListaAlumnos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcListaAlumnos2ActionPerformed

    private void jcListaAlumnos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcListaAlumnos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcListaAlumnos3ActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
       dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void JRBinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBinscriptasActionPerformed
      
      borrarFilas();
      JRBnoinscriptas.setSelected(false);
      cargaDatosInscriptos();
      jBanular.setEnabled(true);
      jBinscribir.setEnabled(false);
    }//GEN-LAST:event_JRBinscriptasActionPerformed

    private void JRBnoinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnoinscriptasActionPerformed
        
        borrarFilas();
        JRBinscriptas.setSelected(false);
        cargaDatosNoInscriptos();
        jBinscribir.setEnabled(true);
        jBanular.setEnabled(false);
        
    }//GEN-LAST:event_JRBnoinscriptasActionPerformed

    private void jBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscribirActionPerformed
        
        int filaSeleccionada = jtTablaMate.getSelectedRow();
        
        if(filaSeleccionada !=-1)
        {
            Alumno a =(Alumno)jcListaAlumnos3.getSelectedItem();
            
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada,1);
            int anio = (Integer) modelo.getValueAt(filaSeleccionada,2);
            
            Materia m = new Materia(idMateria, nombreMateria, anio, true);
             Inscripcion i = new Inscripcion(a,m,0);
             inscData.guardarInscripcion(i);
             borrarFilas();
        }
        
        
        
       
    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jBanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularActionPerformed
        
         
        int filaSeleccionada = jtTablaMate.getSelectedRow();
        
        if(filaSeleccionada !=-1)
        {
            Alumno a =(Alumno)jcListaAlumnos3.getSelectedItem();
            
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            
            
           
            
             inscData.borrarInscripcion(a.getIdAlumno(), idMateria);
             borrarFilas();
        }
        
        
    }//GEN-LAST:event_jBanularActionPerformed

    private void cargaAlumnos(){
        
        for(Alumno elem: lAlumno)
        {
            jcListaAlumnos3.addItem(elem);
     
        }
    
    }
    
    private void armarCabecera(){
        
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        
        for(Object tit : filaCabecera){
            
            modelo.addColumn(tit);
        }
        jtTablaMate.setModel(modelo);
    }
    
    private void borrarFilas(){
        
        int indice = modelo.getRowCount()-1;
        
        for (int i = indice; i >= 0 ; i--){
        
            modelo.removeRow(i);
        }
    
    
    }
    
    private void cargaDatosNoInscriptos(){
        
        borrarFilas();
        Alumno combo = (Alumno)jcListaAlumnos3.getSelectedItem();
        lMateria = (List) inscData.obternerMateriasNOCursadas(combo.getIdAlumno());
        
        for(Materia m : lMateria){
        
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    
    
    
    }
    
    private void cargaDatosInscriptos(){
    
        borrarFilas();
        Alumno combo = (Alumno)jcListaAlumnos3.getSelectedItem();
        lMateria = (List) inscData.obtenerMateriasCursadas(combo.getIdAlumno());
        
        for(Materia m : lMateria){
        
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    
    
    
    
    
    
    
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRBinscriptas;
    private javax.swing.JRadioButton JRBnoinscriptas;
    private javax.swing.JButton jBanular;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcListaAlumnos1;
    private javax.swing.JComboBox<String> jcListaAlumnos2;
    private javax.swing.JComboBox<Alumno> jcListaAlumnos3;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTable jtTabla1;
    private javax.swing.JTable jtTablaMate;
    // End of variables declaration//GEN-END:variables
}
