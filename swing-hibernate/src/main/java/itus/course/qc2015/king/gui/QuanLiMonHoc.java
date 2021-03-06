/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itus.course.qc2015.king.gui;

import itus.course.qc2015.king.dao.impl.SubjectDAO;
import itus.course.qc2015.king.model.Subject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class QuanLiMonHoc extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiMonHoc
     */
    public QuanLiMonHoc() {
        initComponents();
        subDAO = new SubjectDAO();
        list =  subDAO.getAll();
        this.updateTable(jTableSubject, list);
    }
    
     private final SubjectDAO subDAO;
    private List<Subject> list;
    
    private Subject find(String id)
    {
        for (Subject s : list)
        {
            if (s.getSubjID().equals(id))
                return s;
        }
        return null;
    }
    private void updateTable(JTable table, List<Subject> list)
    {
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
          int rowCount = dm.getRowCount();
          //Remove rows one by one from the end of the table
          for (int i = rowCount - 1; i >= 0; i--) {
              dm.removeRow(i);
          }
          list.forEach((subject) -> {
        dm.addRow( new Object[]{subject.getSubjID(), 
                                                      subject.getTitle(), 
                                                      subject.getBeginDate(), 
                                                      subject.getFinishDate(), 
                                                      subject.getBeginPeriod(),
                                                      subject.getFinishPeriod(),
                                                      subject.getDay(),
                                                      subject.getRoom()});
                  
          });
    }
    
    private int hightlightSelectedValue(JComboBox <String> cbb, String value)
       {
           DefaultComboBoxModel model = (DefaultComboBoxModel) cbb.getModel();
           return model.getIndexOf(value);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_Id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        JstartDate = new com.toedter.calendar.JDateChooser();
        JfinishDate = new com.toedter.calendar.JDateChooser();
        cbcdayinweek = new javax.swing.JComboBox<>();
        cbbstartperiod = new javax.swing.JComboBox<>();
        cbbfinishperiod = new javax.swing.JComboBox<>();
        txt_room = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSubject = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("M� m�n");

        jLabel2.setText("T�n m�n");

        jLabel3.setText("Ng�y b?t ??u");

        jLabel4.setText("Ng�y k?t th�c");

        jLabel5.setText("Th?");

        jLabel6.setText("Ti?t b?t ??u");

        jLabel7.setText("Ti?t k?t th�c");

        jLabel8.setText("Ph�ng");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("H?y");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Th�m");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("C?p nh?t");

        jButton4.setBackground(new java.awt.Color(238, 82, 83));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("X�a");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cbcdayinweek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur", "Sun" }));

        cbbstartperiod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00", "7:50", "8:40", "9:30", "10:20", "11:10", "12:30", "13:20", "14:10", "15:00", "15:50", "16:40" }));

        cbbfinishperiod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00", "7:50", "8:40", "9:30", "10:20", "11:10", "12:30", "13:20", "14:10", "15:00", "15:50", "16:40" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cbcdayinweek, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbstartperiod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbfinishperiod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_room, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JfinishDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JstartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3))
                            .addComponent(JstartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addComponent(JfinishDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbcdayinweek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbstartperiod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbfinishperiod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableSubject.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTableSubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M� M�n", "T�n M�n", "Ng�y B?t ??u", "Ng�y K?t Th�c", "Th?", "Ti?t B?t ??u", "Ti?t K?t Th�c", "Ph�ng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableSubject.setGridColor(new java.awt.Color(255, 255, 255));
        jTableSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSubjectMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSubject);
        if (jTableSubject.getColumnModel().getColumnCount() > 0) {
            jTableSubject.getColumnModel().getColumn(0).setResizable(false);
            jTableSubject.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSubjectMouseClicked
        try {
            // get the model from table
            DefaultTableModel model = (DefaultTableModel)jTableSubject.getModel();
            
            //get the selected row index
            int selectedRowIndex = jTableSubject.getSelectedRow();
            if (selectedRowIndex <0) return;
            
            String selectedId = (model.getValueAt(selectedRowIndex,0).toString());
            String name =  (model.getValueAt(selectedRowIndex,1).toString());
            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date startdate = myFormat.parse(model.getValueAt(selectedRowIndex,2).toString());
            Date finishdate = myFormat.parse(model.getValueAt(selectedRowIndex,3).toString());
            String startperiod = (model.getValueAt(selectedRowIndex,4).toString());
            String  endperiod = (model.getValueAt(selectedRowIndex,5).toString());
             String dayinweek =  (model.getValueAt(selectedRowIndex,6).toString());
             String room = (model.getValueAt(selectedRowIndex,7).toString());
             
            txt_Id.setText(selectedId);
            txt_name.setText(name);
            JstartDate.setDate(startdate);
            JfinishDate.setDate(finishdate);
           cbbstartperiod.setSelectedIndex(this.hightlightSelectedValue(cbbstartperiod, startperiod));
           cbbfinishperiod.setSelectedIndex(this.hightlightSelectedValue(cbbfinishperiod, endperiod));
           cbcdayinweek.setSelectedIndex(this.hightlightSelectedValue(cbbfinishperiod, dayinweek));
           txt_room.setText(room);
              } catch (ParseException ex) {
            Logger.getLogger(QuanLiMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableSubjectMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Subject sub = new Subject();
       sub.setSubjID(txt_Id.getText());
       sub.setTitle(txt_name.getText());
       sub.setBeginDate((JstartDate.getDate()));
        sub.setBeginDate(JstartDate.getDate());
        sub.setFinishDate(JfinishDate.getDate());
        sub.setBeginPeriod(cbbstartperiod.getSelectedItem().toString());
        sub.setFinishPeriod(cbbfinishperiod.getSelectedItem().toString());
        
        sub.setDay(cbcdayinweek.getSelectedItem().toString());
        sub.setRoom(txt_room.getText());
        
        if (this.subDAO.add(sub))
        {
            this.list.clear();
            this.list = subDAO.getAll();
            this.updateTable(jTableSubject, list);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       txt_Id.setText("");
            txt_name.setText("");
            JstartDate.setDate(null);
            JfinishDate.setDate(null);
           cbbstartperiod.setSelectedIndex(-1);
           cbbfinishperiod.setSelectedIndex(-1);
           cbcdayinweek.setSelectedIndex(-1);
           txt_room.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           DefaultTableModel model = (DefaultTableModel)jTableSubject.getModel();
            
            //get the selected row index
            int selectedRowIndex = jTableSubject.getSelectedRow();
            if (selectedRowIndex <0) return;
            String selectedId = (model.getValueAt(selectedRowIndex,0).toString());
            Subject  s = this.find(selectedId);
            if (s != null)
                if (subDAO.delete(s)) {
                    this.list.clear();
                    this.list = subDAO.getAll();
                    this.updateTable(jTableSubject, list);
                }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JfinishDate;
    private com.toedter.calendar.JDateChooser JstartDate;
    private javax.swing.JComboBox<String> cbbfinishperiod;
    private javax.swing.JComboBox<String> cbbstartperiod;
    private javax.swing.JComboBox<String> cbcdayinweek;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSubject;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_room;
    // End of variables declaration//GEN-END:variables
}
