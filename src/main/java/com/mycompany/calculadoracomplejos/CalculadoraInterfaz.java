package com.mycompany.calculadoracomplejos;
import java.awt.*;
import javax.swing.JOptionPane;

public class CalculadoraInterfaz extends javax.swing.JFrame {

    public CalculadoraInterfaz() {
        initComponents();
        calculadora = new Calculadora();
        numerosComplejos = new Pila();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historial = new javax.swing.JTextArea();
        undo = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        numeroComplejo1 = new javax.swing.JTextField();
        numeroComplejo2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Numeros Complejos");
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setText("Calculadora numeros complejos");

        jLabel2.setText("Ingrese el primer numero complejo");

        jLabel5.setText("Ingrese el segundo numero complejo");

        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multiplicacion.setText("x");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        division.setText("÷");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        historial.setEditable(false);
        historial.setColumns(10);
        historial.setRows(2);
        historial.setAutoscrolls(false);
        historial.setFocusable(false);
        jScrollPane1.setViewportView(historial);

        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel3.setText("Historial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suma)
                            .addComponent(multiplicacion))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(division)
                                .addGap(18, 18, 18)
                                .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resta)
                                .addGap(18, 18, 18)
                                .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(numeroComplejo1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(numeroComplejo2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numeroComplejo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(numeroComplejo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suma)
                            .addComponent(resta)
                            .addComponent(undo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(multiplicacion)
                            .addComponent(division)
                            .addComponent(limpiar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        if(!numerosComplejos.pilaVacia()){
            NumeroComplejo ultimoComplejoHistorial = numerosComplejos.pop();
            numeroComplejo1.setText(ultimoComplejoHistorial.toString());
            numeroComplejo2.setText("");
        } else{
            JOptionPane.showMessageDialog(null, "Ya no hay numeros en la pila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_undoActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        suma.setBackground(Color.LIGHT_GRAY);
        resta.setBackground(null);
        division.setBackground(null);
        multiplicacion.setBackground(null);
        
        String textComplejo1 = numeroComplejo1.getText().replace("i", ""); 
        String textComplejo2 = numeroComplejo2.getText().replace("i", ""); 

        String [] primerNumeroComplejo = textComplejo1.split("(?=[+-])"); 
        String [] segundoNumeroComplejo = textComplejo2.split("(?=[+-])");
        
        NumeroComplejo num1 = new NumeroComplejo(Float.parseFloat(primerNumeroComplejo[0]), Float.parseFloat(primerNumeroComplejo[1])); 
        NumeroComplejo num2 = new NumeroComplejo(Float.parseFloat(segundoNumeroComplejo[0]), Float.parseFloat(segundoNumeroComplejo[1]));
        resultadoFinal = calculadora.suma(num1, num2);
        
        historial.append(num1.toString() + "\n");
        historial.append(num2.toString() + "\n");
        historial.append(resultadoFinal.toString() + "\n");
        
        numerosComplejos.push(num1);
        numerosComplejos.push(num2);
        numerosComplejos.push(resultadoFinal);
        
//        historial.setText(resultadoFinal);
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        resta.setBackground(Color.LIGHT_GRAY);
        division.setBackground(null);
        multiplicacion.setBackground(null);
        suma.setBackground(null);
        
        String textComplejo1 = numeroComplejo1.getText().replace("i", ""); 
        String textComplejo2 = numeroComplejo2.getText().replace("i", ""); 

        String [] primerNumeroComplejo = textComplejo1.split("(?=[+-])"); 
        String [] segundoNumeroComplejo = textComplejo2.split("(?=[+-])");
        
        NumeroComplejo num1Resta = new NumeroComplejo(Float.parseFloat(primerNumeroComplejo[0]), Float.parseFloat(primerNumeroComplejo[1])); 
        NumeroComplejo num2Resta = new NumeroComplejo(Float.parseFloat(segundoNumeroComplejo[0]), Float.parseFloat(segundoNumeroComplejo[1]));
        resultadoFinal = calculadora.resta(num1Resta, num2Resta);
        
        historial.append(num1Resta.toString() + "\n");
        historial.append(num2Resta.toString() + "\n");
        historial.append(resultadoFinal.toString() + "\n");
        
        numerosComplejos.push(num1Resta);
        numerosComplejos.push(num2Resta);
        numerosComplejos.push(resultadoFinal);
        
//        historial.setText(resultadoFinal);
    }//GEN-LAST:event_restaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        multiplicacion.setBackground(Color.LIGHT_GRAY);
        division.setBackground(null);
        suma.setBackground(null);
        resta.setBackground(null);
        
        String textComplejo1 = numeroComplejo1.getText().replace("i", ""); 
        String textComplejo2 = numeroComplejo2.getText().replace("i", ""); 

        String [] primerNumeroComplejo = textComplejo1.split("(?=[+-])"); 
        String [] segundoNumeroComplejo = textComplejo2.split("(?=[+-])");
        
        NumeroComplejo num1Multi = new NumeroComplejo(Float.parseFloat(primerNumeroComplejo[0]), Float.parseFloat(primerNumeroComplejo[1])); 
        NumeroComplejo num2Multi = new NumeroComplejo(Float.parseFloat(segundoNumeroComplejo[0]), Float.parseFloat(segundoNumeroComplejo[1])); 
        resultadoFinal = calculadora.multiplicacion(num1Multi, num2Multi);
        
        historial.append(num1Multi.toString() + "\n");
        historial.append(num2Multi.toString() + "\n");
        historial.append(resultadoFinal.toString() + "\n");
        
        numerosComplejos.push(num1Multi);
        numerosComplejos.push(num2Multi);
        numerosComplejos.push(resultadoFinal);
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        division.setBackground(Color.LIGHT_GRAY);
        multiplicacion.setBackground(null);
        suma.setBackground(null);
        resta.setBackground(null);
        
        String textComplejo1 = numeroComplejo1.getText().replace("i", ""); 
        String textComplejo2 = numeroComplejo2.getText().replace("i", ""); 

        String [] primerNumeroComplejo = textComplejo1.split("(?=[+-])"); 
        String [] segundoNumeroComplejo = textComplejo2.split("(?=[+-])");
        
        NumeroComplejo num1Div = new NumeroComplejo(Float.parseFloat(primerNumeroComplejo[0]), Float.parseFloat(primerNumeroComplejo[1])); 
        NumeroComplejo num2Div = new NumeroComplejo(Float.parseFloat(segundoNumeroComplejo[0]), Float.parseFloat(segundoNumeroComplejo[1]));
        resultadoFinal = calculadora.division(num1Div, num2Div);
        
        historial.append(num1Div.toString() + "\n");
        historial.append(num2Div.toString() + "\n");
        historial.append(resultadoFinal.toString() + "\n");
        
        numerosComplejos.push(num1Div);
        numerosComplejos.push(num2Div);
        numerosComplejos.push(resultadoFinal);
    }//GEN-LAST:event_divisionActionPerformed
    
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        historial.setText("");
        resultadoFinal = null;
        multiplicacion.setBackground(null);
        division.setBackground(null);
        suma.setBackground(null);
        resta.setBackground(null);
        
        while(!numerosComplejos.pilaVacia()){
            numerosComplejos.pop();
        }
    }//GEN-LAST:event_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton division;
    private javax.swing.JTextArea historial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JTextField numeroComplejo1;
    private javax.swing.JTextField numeroComplejo2;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
    private int operacion;
    private Calculadora calculadora;
    private NumeroComplejo resultadoFinal;
    private Pila<NumeroComplejo> numerosComplejos;
}
