package cld;

/**
 *
 * @author jhalejandro
 */
public class frameCld extends javax.swing.JFrame {

    String mostrar = "";
    String sign;

    /**
     * Creates new form frameCld
     */
    public frameCld() {
        initComponents();
        this.setSize(480, 640);
        this.setTitle("Calcololadora");
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
        plus = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        times = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        show = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 236, 243));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plus.setBackground(new java.awt.Color(168, 208, 230));
        plus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        plus.setForeground(new java.awt.Color(36, 48, 94));
        plus.setText("+");
        plus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 48, 94), 3, true));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 90, 90));

        divide.setBackground(new java.awt.Color(168, 208, 230));
        divide.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        divide.setForeground(new java.awt.Color(36, 48, 94));
        divide.setText("/");
        divide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 48, 94), 3, true));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        jPanel1.add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 90, 90));

        times.setBackground(new java.awt.Color(168, 208, 230));
        times.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        times.setForeground(new java.awt.Color(36, 48, 94));
        times.setText("*");
        times.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 48, 94), 3, true));
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });
        jPanel1.add(times, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 90, 90));

        minus.setBackground(new java.awt.Color(168, 208, 230));
        minus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        minus.setForeground(new java.awt.Color(36, 48, 94));
        minus.setText("-");
        minus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 48, 94), 3, true));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jPanel1.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 90, 90));

        n3.setBackground(new java.awt.Color(55, 71, 133));
        n3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n3.setForeground(new java.awt.Color(167, 194, 224));
        n3.setText("3");
        n3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });
        jPanel1.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 90, 90));

        n1.setBackground(new java.awt.Color(55, 71, 133));
        n1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n1.setForeground(new java.awt.Color(167, 194, 224));
        n1.setText("1");
        n1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        jPanel1.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 90));

        n2.setBackground(new java.awt.Color(55, 71, 133));
        n2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n2.setForeground(new java.awt.Color(167, 194, 224));
        n2.setText("2");
        n2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        jPanel1.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 90, 90));

        n6.setBackground(new java.awt.Color(55, 71, 133));
        n6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n6.setForeground(new java.awt.Color(167, 194, 224));
        n6.setText("6");
        n6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });
        jPanel1.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 90, 90));

        n4.setBackground(new java.awt.Color(55, 71, 133));
        n4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n4.setForeground(new java.awt.Color(167, 194, 224));
        n4.setText("4");
        n4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        jPanel1.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 90));

        n5.setBackground(new java.awt.Color(55, 71, 133));
        n5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n5.setForeground(new java.awt.Color(167, 194, 224));
        n5.setText("5");
        n5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });
        jPanel1.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 90, 90));

        n9.setBackground(new java.awt.Color(55, 71, 133));
        n9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n9.setForeground(new java.awt.Color(167, 194, 224));
        n9.setText("9");
        n9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });
        jPanel1.add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 90, 90));

        n7.setBackground(new java.awt.Color(55, 71, 133));
        n7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n7.setForeground(new java.awt.Color(167, 194, 224));
        n7.setText("7");
        n7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });
        jPanel1.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 90));

        n8.setBackground(new java.awt.Color(55, 71, 133));
        n8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n8.setForeground(new java.awt.Color(167, 194, 224));
        n8.setText("8");
        n8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });
        jPanel1.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 90, 90));

        delete.setBackground(new java.awt.Color(168, 208, 230));
        delete.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(55, 71, 133));
        delete.setText("DEL");
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 71, 133), 3, true));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 90, 90));

        n0.setBackground(new java.awt.Color(55, 71, 133));
        n0.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        n0.setForeground(new java.awt.Color(167, 194, 224));
        n0.setText("0");
        n0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 194, 224), 3, true));
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });
        jPanel1.add(n0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 90, 90));

        equal.setBackground(new java.awt.Color(168, 208, 230));
        equal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        equal.setForeground(new java.awt.Color(55, 71, 133));
        equal.setText("=");
        equal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 71, 133), 3, true));
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jPanel1.add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 90, 90));

        show.setBackground(new java.awt.Color(168, 208, 230));
        show.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        show.setForeground(new java.awt.Color(36, 48, 94));
        show.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 48, 94), 3, true));
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 52, 400, 100));

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
    }// </editor-fold>//GEN-END:initComponents

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        show.setText(show.getText() + "/");

    }//GEN-LAST:event_divideActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        show.setText("");
    }//GEN-LAST:event_deleteActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        int result = 0, i = 0;
        String showText = show.getText(), numOne = "", numTwo = "", extract = "";
        boolean pasar = true;
        System.out.println("Longitud: " + showText.length());
        // Numero 1
        while (i < showText.length() - 1 && pasar == true) {
            extract = showText.substring(i, i + 1);
            if (extract == "+" || extract == "-" || extract == "*" || extract == "/") {                
                sign = extract;
                pasar = false;
            } else {
                numOne = numOne + extract;
                i++;
                System.out.println("extract: "  + extract);
                System.out.println(numOne);                
            }
        }
        numOne = numOne.substring(0, numOne.length()-2);
        System.out.println("Numero 1: " + numOne);
        i++;
        System.out.println("Signo: " + sign);
        i++;
        // Numero 2
//        while (extract != "+" || extract != "-" || extract != "*" || extract != "/") {
//            numTwo = extract.substring(i, i + 1);
//            i++;
//            System.out.println(numTwo);
//        }
//        System.out.println("Numero 2: " + numTwo);
//        calcular(numOne, numTwo);
//        show.setText(Integer.toString(result));
    }//GEN-LAST:event_equalActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
//        showResult();
    }//GEN-LAST:event_showActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        show.setText(show.getText() + "1");

    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed

        show.setText(show.getText() + "2");
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed

        show.setText(show.getText() + "3");
    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed

        show.setText(show.getText() + "4");
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed

        show.setText(show.getText() + "5");
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed

        show.setText(show.getText() + "6");
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed

        show.setText(show.getText() + "7");
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed

        show.setText(show.getText() + "8");
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed

        show.setText(show.getText() + "9");
    }//GEN-LAST:event_n9ActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        show.setText(show.getText() + "+");
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        show.setText(show.getText() + "-");
    }//GEN-LAST:event_minusActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
        show.setText(show.getText() + "*");
    }//GEN-LAST:event_timesActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        show.setText(show.getText() + "0");
    }//GEN-LAST:event_n0ActionPerformed

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
            java.util.logging.Logger.getLogger(frameCld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameCld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameCld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameCld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameCld().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minus;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton plus;
    private javax.swing.JTextField show;
    private javax.swing.JButton times;
    // End of variables declaration//GEN-END:variables

//    public void calcular(numberOne, numberTwo) {
//        int result;
//        switch (sign) {
//            case "+":
//                result = numberOne + numberTwo;
//                break;
//            case "-":
//                result = numOne - numTwo;
//                break;
//            case "/":
//                result = numOne / numTwo;
//                break;
//            case "*":
//                result = numOne * numTwo;
//                break;
//        }
//    }
}
