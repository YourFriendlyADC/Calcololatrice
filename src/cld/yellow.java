package cld;

import javax.swing.ImageIcon;

/**
 *
 * @author Victor1
 */
public class yellow extends javax.swing.JFrame {

    String mostrar = "";
    String sign;
    /**
     * Creates new form yellow
     */
    public yellow() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(395, 480);
        this.setTitle("Calcololatrice");
        ImageIcon img = new ImageIcon("images/icono.png");
        setIconImage(img.getImage());
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
        show = new javax.swing.JTextField();
        plus = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        deleteOne = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n10 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        times = new javax.swing.JButton();
        potency = new javax.swing.JButton();
        square = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        toO = new javax.swing.JButton();
        toG = new javax.swing.JButton();
        toR = new javax.swing.JButton();
        toY = new javax.swing.JButton();
        toB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show.setBackground(new java.awt.Color(255, 255, 204));
        show.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        show.setForeground(new java.awt.Color(102, 102, 0));
        show.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 340, 60));

        plus.setBackground(new java.awt.Color(255, 255, 204));
        plus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        plus.setForeground(new java.awt.Color(102, 102, 0));
        plus.setText("+");
        plus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 60, 60));

        divide.setBackground(new java.awt.Color(255, 255, 204));
        divide.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        divide.setForeground(new java.awt.Color(102, 102, 0));
        divide.setText("/");
        divide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        jPanel1.add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 60, 60));

        deleteOne.setBackground(new java.awt.Color(190, 149, 196));
        deleteOne.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        deleteOne.setForeground(new java.awt.Color(94, 84, 142));
        deleteOne.setText("C");
        deleteOne.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 84, 142), 3, true));
        deleteOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOneActionPerformed(evt);
            }
        });
        jPanel1.add(deleteOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 60, 60));

        minus.setBackground(new java.awt.Color(255, 255, 204));
        minus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        minus.setForeground(new java.awt.Color(102, 102, 0));
        minus.setText("-");
        minus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jPanel1.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 60, 60));

        n3.setBackground(new java.awt.Color(255, 255, 255));
        n3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n3.setForeground(new java.awt.Color(102, 102, 102));
        n3.setText("3");
        n3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });
        jPanel1.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 60));

        n1.setBackground(new java.awt.Color(255, 255, 255));
        n1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n1.setForeground(new java.awt.Color(102, 102, 102));
        n1.setText("1");
        n1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        jPanel1.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 60));

        n2.setBackground(new java.awt.Color(255, 255, 255));
        n2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n2.setForeground(new java.awt.Color(102, 102, 102));
        n2.setText("2");
        n2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        jPanel1.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 60, 60));

        n6.setBackground(new java.awt.Color(255, 255, 255));
        n6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n6.setForeground(new java.awt.Color(102, 102, 102));
        n6.setText("6");
        n6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });
        jPanel1.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, 60));

        n4.setBackground(new java.awt.Color(255, 255, 255));
        n4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n4.setForeground(new java.awt.Color(102, 102, 102));
        n4.setText("4");
        n4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        jPanel1.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 60, 60));

        n5.setBackground(new java.awt.Color(255, 255, 255));
        n5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n5.setForeground(new java.awt.Color(102, 102, 102));
        n5.setText("5");
        n5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });
        jPanel1.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 60, 60));

        n10.setBackground(new java.awt.Color(255, 255, 255));
        n10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n10.setForeground(new java.awt.Color(102, 102, 102));
        n10.setText("9");
        n10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n10ActionPerformed(evt);
            }
        });
        jPanel1.add(n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 60, 60));

        n7.setBackground(new java.awt.Color(255, 255, 255));
        n7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n7.setForeground(new java.awt.Color(102, 102, 102));
        n7.setText("7");
        n7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });
        jPanel1.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 60, 60));

        n8.setBackground(new java.awt.Color(255, 255, 255));
        n8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n8.setForeground(new java.awt.Color(102, 102, 102));
        n8.setText("8");
        n8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });
        jPanel1.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 60, 60));

        delete.setBackground(new java.awt.Color(190, 149, 196));
        delete.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(94, 84, 142));
        delete.setText("DEL");
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 84, 142), 3, true));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 60, 60));

        n0.setBackground(new java.awt.Color(255, 255, 255));
        n0.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n0.setForeground(new java.awt.Color(102, 102, 102));
        n0.setText("0");
        n0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });
        jPanel1.add(n0, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 60, 60));

        equal.setBackground(new java.awt.Color(190, 149, 196));
        equal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        equal.setForeground(new java.awt.Color(94, 84, 142));
        equal.setText("=");
        equal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 84, 142), 3, true));
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jPanel1.add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 60, 60));

        times.setBackground(new java.awt.Color(255, 255, 204));
        times.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        times.setForeground(new java.awt.Color(102, 102, 0));
        times.setText("*");
        times.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });
        jPanel1.add(times, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 60, 60));

        potency.setBackground(new java.awt.Color(255, 255, 204));
        potency.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        potency.setForeground(new java.awt.Color(102, 102, 0));
        potency.setText("^");
        potency.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        potency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencyActionPerformed(evt);
            }
        });
        jPanel1.add(potency, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 60, 60));

        square.setBackground(new java.awt.Color(255, 255, 204));
        square.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        square.setForeground(new java.awt.Color(102, 102, 0));
        square.setText("√");
        square.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });
        jPanel1.add(square, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 60, 60));

        factorial.setBackground(new java.awt.Color(255, 255, 204));
        factorial.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        factorial.setForeground(new java.awt.Color(102, 102, 0));
        factorial.setText("!");
        factorial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });
        jPanel1.add(factorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, 60));

        toO.setBackground(new java.awt.Color(255, 215, 186));
        toO.setFont(new java.awt.Font("Yu Gothic Light", 1, 10)); // NOI18N
        toO.setForeground(new java.awt.Color(224, 122, 95));
        toO.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 51, 0), 2, true));
        toO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toOActionPerformed(evt);
            }
        });
        jPanel1.add(toO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 60, 30));

        toG.setBackground(new java.awt.Color(173, 208, 173));
        toG.setFont(new java.awt.Font("Yu Gothic Light", 1, 10)); // NOI18N
        toG.setForeground(new java.awt.Color(51, 78, 50));
        toG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 78, 50), 2, true));
        toG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toGActionPerformed(evt);
            }
        });
        jPanel1.add(toG, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 60, 30));

        toR.setBackground(new java.awt.Color(235, 167, 184));
        toR.setFont(new java.awt.Font("Yu Gothic Light", 1, 10)); // NOI18N
        toR.setForeground(new java.awt.Color(94, 47, 33));
        toR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 47, 33), 2, true));
        toR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toRActionPerformed(evt);
            }
        });
        jPanel1.add(toR, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 60, 30));

        toY.setBackground(new java.awt.Color(227, 214, 122));
        toY.setFont(new java.awt.Font("Yu Gothic Light", 1, 10)); // NOI18N
        toY.setForeground(new java.awt.Color(174, 149, 44));
        toY.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 103, 18), 2, true));
        toY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toYActionPerformed(evt);
            }
        });
        jPanel1.add(toY, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 60, 30));

        toB.setBackground(new java.awt.Color(168, 208, 230));
        toB.setFont(new java.awt.Font("Yu Gothic Light", 1, 10)); // NOI18N
        toB.setForeground(new java.awt.Color(36, 48, 94));
        toB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 48, 94), 2, true));
        toB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBActionPerformed(evt);
            }
        });
        jPanel1.add(toB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 30));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Citrice");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 70, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed

    }//GEN-LAST:event_showActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        show.setText(show.getText() + "+");
    }//GEN-LAST:event_plusActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        show.setText(show.getText() + "/");
    }//GEN-LAST:event_divideActionPerformed

    private void deleteOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOneActionPerformed
        if (!"".equals(show.getText())) {
            show.setText(show.getText().substring(0, show.getText().length() - 1));
        }
    }//GEN-LAST:event_deleteOneActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        show.setText(show.getText() + "-");
    }//GEN-LAST:event_minusActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        show.setText(show.getText() + "3");
    }//GEN-LAST:event_n3ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        show.setText(show.getText() + "1");
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        show.setText(show.getText() + "2");
    }//GEN-LAST:event_n2ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        show.setText(show.getText() + "6");
    }//GEN-LAST:event_n6ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        show.setText(show.getText() + "4");
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        show.setText(show.getText() + "5");
    }//GEN-LAST:event_n5ActionPerformed

    private void n10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n10ActionPerformed
        show.setText(show.getText() + "9");
    }//GEN-LAST:event_n10ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        show.setText(show.getText() + "7");
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        show.setText(show.getText() + "8");
    }//GEN-LAST:event_n8ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        show.setText("");
    }//GEN-LAST:event_deleteActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        show.setText(show.getText() + "0");
    }//GEN-LAST:event_n0ActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        String showText = show.getText(), extract = "";
        String numOne = "", numTwo = "";
        boolean pass = false;
        // Separating numbers and sign
        for (int i = 0; i < showText.length(); i++) {
            // Number 1
            extract = showText.substring(i, i + 1);
            // Here takes the number 1 until pass gets true and can get the sign and the number 2
            if (pass == false) {
                // Type of operation
                if ("+".equals(extract) || "-".equals(extract) || "*".equals(extract) || "/".equals(extract) || "^".equals(extract) || "√".equals(extract) || "!".equals(extract)) {
                    sign = extract;
                    pass = true;
                } else { // Number One
                    numOne = numOne + extract;
                }
            } else { // Number Two
                numTwo = numTwo + extract;
            }
        }
        int nOne = Integer.parseInt(numOne);
        int nTwo = Integer.parseInt(numTwo);
        calc(nOne, nTwo, sign);
    }//GEN-LAST:event_equalActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
        show.setText(show.getText() + "*");
    }//GEN-LAST:event_timesActionPerformed

    private void potencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencyActionPerformed
        show.setText(show.getText() + "^");
    }//GEN-LAST:event_potencyActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed

    }//GEN-LAST:event_squareActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed

    }//GEN-LAST:event_factorialActionPerformed

    private void toOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toOActionPerformed
        frameCld menu = new frameCld();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toOActionPerformed

    private void toGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toGActionPerformed
        green g = new green();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toGActionPerformed

    private void toRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toRActionPerformed
        red r = new red();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toRActionPerformed

    private void toYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toYActionPerformed
        
    }//GEN-LAST:event_toYActionPerformed

    private void toBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toBActionPerformed
        blue b = new blue();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toBActionPerformed

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
            java.util.logging.Logger.getLogger(yellow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yellow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yellow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yellow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yellow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteOne;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JButton factorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minus;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n10;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton plus;
    private javax.swing.JButton potency;
    private javax.swing.JTextField show;
    private javax.swing.JButton square;
    private javax.swing.JButton times;
    private javax.swing.JButton toB;
    private javax.swing.JButton toG;
    private javax.swing.JButton toO;
    private javax.swing.JButton toR;
    private javax.swing.JButton toY;
    // End of variables declaration//GEN-END:variables

    public void calc(int nOne, int nTwo, String sign) {
        int result = 0;
        switch (sign) {
            case "+":
                result = nOne + nTwo;
                break;
            case "-":
                result = nOne - nTwo;
                break;
            case "/":
                if (nTwo != 0) {
                    result = nOne / nTwo;
                }
                break;
            case "*":
                result = nOne * nTwo;
                break;
            case "^":
                if (nTwo != 0) {
                    result = (int) Math.pow(nOne, nTwo);
                }
                break;
            case "√":
                result = (int) Math.sqrt(nTwo);
                break;
            case "!":
                result = factorial(nOne);
                break;
        }
        if (nTwo == 0 && ("/".equals(sign) || "^".equals(sign))) {
            show.setText("Undefined");
        } else {
            show.setText(Integer.toString(result));
        }    
    }

    public int factorial(int nOne) {
        if (nOne <= 1) {
            return 1;
        } else {
            return nOne * factorial(nOne);
        }
    }
}
