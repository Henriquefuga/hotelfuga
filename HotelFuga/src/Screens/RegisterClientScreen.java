/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import database.DataBase;
import entities.Manager;
import entities.Tutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author henri
 */
public class RegisterClientScreen extends javax.swing.JFrame {

    /**
     * Creates new form RegisterClientScreen
     */
    public RegisterClientScreen() {
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

        jLabel10 = new javax.swing.JLabel();
        numberAddressField = new javax.swing.JTextField();
        registerTutorButton = new javax.swing.JButton();
        cepField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cpfField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        petField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        telephoneField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        emergencyTelephoneField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setText("Número");

        numberAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberAddressFieldActionPerformed(evt);
            }
        });

        registerTutorButton.setText("Cadastrar Tutor");
        registerTutorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerTutorButtonActionPerformed(evt);
            }
        });

        cepField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepFieldActionPerformed(evt);
            }
        });

        addressField.setToolTipText("(XX) XXXXX-XXXX");
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("Endereço");
        jLabel15.setToolTipText("(XX) XXXXX-XXXX");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_hotel.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel4.setText("Cadastro Tutor");

        jLabel5.setText("Nome Completo");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Cpf");

        cpfField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Pet");

        petField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("CEP");

        telephoneField.setToolTipText("(XX) XXXXX-XXXX");
        telephoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneFieldActionPerformed(evt);
            }
        });

        jLabel16.setText("Telefone ");
        jLabel16.setToolTipText("(XX) XXXXX-XXXX");

        emergencyTelephoneField.setToolTipText("(XX) XXXXX-XXXX");
        emergencyTelephoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyTelephoneFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("Telefone Emergência ");
        jLabel17.setToolTipText("(XX) XXXXX-XXXX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(numberAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(petField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emergencyTelephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(registerTutorButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emergencyTelephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(registerTutorButton)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberAddressFieldActionPerformed

    private void registerTutorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerTutorButtonActionPerformed
        // TODO add your handling code here:
        Tutor tutor = new Tutor();
        tutor.setCpfTutor(cpfField.getText());
        tutor.setNameTutor(nameField.getText());
        tutor.setTelephoneTutor(telephoneField.getText());
        tutor.setEmergencyTelephoneTutor(emergencyTelephoneField.getText());
        tutor.setAddress(addressField.getText());
        tutor.setNumberAddress(numberAddressField.getText());
        tutor.setCep(cepField.getText());
        tutor.setPet(petField.getText());
        DataBase db = new DataBase();

        
        //check cpf
        // Remove todos os caracteres não numéricos
        String cpfFormatado = tutor.getCpfTutor().replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpfFormatado.length() != 11) {
            System.out.println("O CPF NÃO está no formato correto.");
            return;
        }

        // Verifica se todos os caracteres são iguais
        if (cpfFormatado.matches("(\\d)\\1{10}")) {
            System.out.println("O CPF NÃO está no formato correto.");
            return;
        }

        // Calcula o primeiro dígito verificador (D1)
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpfFormatado.charAt(i)) * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito > 9) {
            primeiroDigito = 0;
        }

        // Calcula o segundo dígito verificador (D2)
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpfFormatado.charAt(i)) * (11 - i);
        }

        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito > 9) {
            segundoDigito = 0;
        }

        // Verifica se os dígitos verificadores estão corretos
        if (Character.getNumericValue(cpfFormatado.charAt(9)) == primeiroDigito
            && Character.getNumericValue(cpfFormatado.charAt(10)) == segundoDigito) {

        } else {
            JOptionPane.showMessageDialog(null, "Cpf em formato inválido\n" );
        }

        /*//check telephone
        // Define o padrão para o formato (XX) XXXX-XXXX

        String telephoneFormat = "^\\(\\d{2}\\)\\s\\d{4}-\\d{4}$";

        // Compila a expressão regular
        Pattern regex = Pattern.compile(telephoneFormat);

        // Cria um objeto Matcher para comparar a string fornecida com o padrão
        Matcher matcher2 = regex.matcher(tutor.getTelephoneTutor());

        if (matcher2.matches()) {

        } else {
            JOptionPane.showMessageDialog(null, "Telefone em formato inválido\n" );
        }*/

        db.registerTutor(tutor.getCpfTutor(), tutor.getNameTutor(), tutor.getPet(), tutor.getTelephoneTutor(), tutor.getEmergencyTelephoneTutor(),tutor.getCep(), tutor.getAddress(), tutor.getNumberAddress());
        
        RegisterPetScreen registerpetscreen = new RegisterPetScreen();
        registerpetscreen.setVisible(true);
        
    }//GEN-LAST:event_registerTutorButtonActionPerformed

    private void cepFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void cpfFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfFieldActionPerformed

    private void petFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petFieldActionPerformed

    private void telephoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telephoneFieldActionPerformed

    private void emergencyTelephoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyTelephoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergencyTelephoneFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterClientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterClientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterClientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterClientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterClientScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField cepField;
    private javax.swing.JTextField cpfField;
    private javax.swing.JTextField emergencyTelephoneField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField numberAddressField;
    private javax.swing.JTextField petField;
    private javax.swing.JButton registerTutorButton;
    private javax.swing.JTextField telephoneField;
    // End of variables declaration//GEN-END:variables
}
