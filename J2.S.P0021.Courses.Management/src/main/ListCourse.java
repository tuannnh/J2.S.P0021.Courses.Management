package main;

import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuannnh
 */
public class ListCourse extends javax.swing.JFrame {

    /**
     * Creates new form ListCourse
     * @param courseList
     */
    public ListCourse(List<Course> courseList) {
        initComponents();
        this.setSize(400, 400);
        txtList.setEditable(false);
        Collections.sort(courseList, new  CourseComparator());
        for(Course aCourse : courseList){
            txtList.append(aCourse.toString() + "\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("List of Courses");
        setPreferredSize(null);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LIST OF ALL COURSES (ORDER BY CREDIT)");
        jLabel4.setPreferredSize(new java.awt.Dimension(259, 80));
        getContentPane().add(jLabel4, java.awt.BorderLayout.PAGE_START);

        txtList.setColumns(20);
        txtList.setRows(5);
        jScrollPane1.setViewportView(txtList);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtList;
    // End of variables declaration//GEN-END:variables
}
