package cld;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.lang.Math;

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
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(395, 485);
        this.setTitle("Calcololatrice");
        ImageIcon img = new ImageIcon("images/icono.png");
        setIconImage(img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
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
        n9 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        show = new javax.swing.JTextField();
        toG = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        toB = new javax.swing.JButton();
        times = new javax.swing.JButton();
        potency = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        toR = new javax.swing.JButton();
        toY = new javax.swing.JButton();
        square = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(244, 241, 222));
        bg.setForeground(new java.awt.Color(230, 230, 230));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plus.setBackground(new java.awt.Color(129, 178, 154));
        plus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        plus.setForeground(new java.awt.Color(61, 64, 91));
        plus.setText("+");
        plus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 64, 91), 3, true));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        bg.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 60, 60));

        divide.setBackground(new java.awt.Color(129, 178, 154));
        divide.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        divide.setForeground(new java.awt.Color(61, 64, 91));
        divide.setText("/");
        divide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 64, 91), 3, true));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        bg.add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 60, 60));

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
        bg.add(deleteOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 60, 60));

        minus.setBackground(new java.awt.Color(129, 178, 154));
        minus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        minus.setForeground(new java.awt.Color(61, 64, 91));
        minus.setText("-");
        minus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 64, 91), 3, true));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        bg.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 60, 60));

        n3.setBackground(new java.awt.Color(242, 204, 143));
        n3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n3.setForeground(new java.awt.Color(224, 122, 95));
        n3.setText("3");
        n3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });
        bg.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 60, 60));

        n1.setBackground(new java.awt.Color(242, 204, 143));
        n1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n1.setForeground(new java.awt.Color(224, 122, 95));
        n1.setText("1");
        n1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        bg.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 60));

        n2.setBackground(new java.awt.Color(242, 204, 143));
        n2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n2.setForeground(new java.awt.Color(224, 122, 95));
        n2.setText("2");
        n2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        bg.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 60, 60));

        n6.setBackground(new java.awt.Color(242, 204, 143));
        n6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n6.setForeground(new java.awt.Color(224, 122, 95));
        n6.setText("6");
        n6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });
        bg.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 60, 60));

        n4.setBackground(new java.awt.Color(242, 204, 143));
        n4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n4.setForeground(new java.awt.Color(224, 122, 95));
        n4.setText("4");
        n4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        bg.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, 60));

        n5.setBackground(new java.awt.Color(242, 204, 143));
        n5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n5.setForeground(new java.awt.Color(224, 122, 95));
        n5.setText("5");
        n5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });
        bg.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 60, 60));

        n9.setBackground(new java.awt.Color(242, 204, 143));
        n9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n9.setForeground(new java.awt.Color(224, 122, 95));
        n9.setText("9");
        n9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });
        bg.add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 60, 60));

        n7.setBackground(new java.awt.Color(242, 204, 143));
        n7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n7.setForeground(new java.awt.Color(224, 122, 95));
        n7.setText("7");
        n7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });
        bg.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 60, 60));

        n8.setBackground(new java.awt.Color(242, 204, 143));
        n8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n8.setForeground(new java.awt.Color(224, 122, 95));
        n8.setText("8");
        n8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });
        bg.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 60, 60));

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
        bg.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 60, 60));

        n0.setBackground(new java.awt.Color(242, 204, 143));
        n0.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        n0.setForeground(new java.awt.Color(224, 122, 95));
        n0.setText("0");
        n0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });
        bg.add(n0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 60, 60));

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
        bg.add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 60, 60));

        show.setBackground(new java.awt.Color(255, 215, 186));
        show.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        show.setForeground(new java.awt.Color(224, 122, 95));
        show.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 122, 95), 3, true));
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        bg.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, 60));

        toG.setBackground(new java.awt.Color(173, 208, 173));
        toG.setFont(new java.awt.Font("Yu Gothic Light", 1, 10)); // NOI18N
        toG.setForeground(new java.awt.Color(51, 78, 50));
        toG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 78, 50), 2, true));
        toG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toGActionPerformed(evt);
            }
        });
        bg.add(toG, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 50, 30));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(224, 122, 95));
        jLabel1.setText("Citrice");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, -1));

        toB.setBackground(new java.awt.Color(168, 208, 230));
        toB.setFont(new java.awt.Font("Yu Gothic Light", 1, 10)); // NOI18N
        toB.setForeground(new java.awt.Color(36, 48, 94));
        toB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 48, 94), 2, true));
        toB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBActionPerformed(evt);
            }
        });
        bg.add(toB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 30));

        times.setBackground(new java.awt.Color(129, 178, 154));
        times.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        times.setForeground(new java.awt.Color(61, 64, 91));
        times.setText("*");
        times.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 64, 91), 3, true));
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });
        bg.add(times, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 60, 60));

        potency.setBackground(new java.awt.Color(129, 178, 154));
        potency.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        potency.setForeground(new java.awt.Color(61, 64, 91));
        potency.setText("^");
        potency.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 64, 91), 3, true));
        potency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencyActionPerformed(evt);
            }
        });
        bg.add(potency, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 60, 60));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Soon");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 50, 30));

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Soon");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 50, 30));

        toR.setBackground(new java.awt.Color(235, 167, 184));
        toR.setFont(new java.awt.Font("Yu Gothic Light", 1, 10)); // NOI18N
        toR.setForeground(new java.awt.Color(94, 47, 33));
        toR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 47, 33), 2, true));
        toR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toRActionPerformed(evt);
            }
        });
        bg.add(toR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 50, 30));

        toY.setBackground(new java.awt.Color(227, 214, 122));
        toY.setFont(new java.awt.Font("Yu Gothic Light", 1, 10)); // NOI18N
        toY.setForeground(new java.awt.Color(174, 149, 44));
        toY.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 103, 18), 2, true));
        toY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toYActionPerformed(evt);
            }
        });
        bg.add(toY, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 50, 30));

        square.setBackground(new java.awt.Color(129, 178, 154));
        square.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        square.setForeground(new java.awt.Color(61, 64, 91));
        square.setText("√");
        square.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 64, 91), 3, true));
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });
        bg.add(square, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 60, 60));

        factorial.setBackground(new java.awt.Color(129, 178, 154));
        factorial.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        factorial.setForeground(new java.awt.Color(61, 64, 91));
        factorial.setText("!");
        factorial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 64, 91), 3, true));
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });
        bg.add(factorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 60, 60));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Soon");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 40, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Soon");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 40, -1));

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Soon");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 50, 30));

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Soon");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 50, 30));

        jLabel7.setFont(new java.awt.Font("MV Boli", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Soon");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed

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

    private void deleteOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOneActionPerformed
        if (!"".equals(show.getText())) {
            show.setText(show.getText().substring(0, show.getText().length() - 1));
        }
    }//GEN-LAST:event_deleteOneActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        show.setText(show.getText() + "0");
    }//GEN-LAST:event_n0ActionPerformed

    private void toGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toGActionPerformed
        green g = new green();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toGActionPerformed

    private void toRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toRActionPerformed
        //red r = new red();
        //r.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_toRActionPerformed

    private void toYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toYActionPerformed
        //yellow y = new yellow();
        //y.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_toYActionPerformed

    private void toBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toBActionPerformed
        blue b = new blue();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toBActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
        show.setText(show.getText() + "*");
    }//GEN-LAST:event_timesActionPerformed

    private void potencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencyActionPerformed
        show.setText(show.getText() + "^");
    }//GEN-LAST:event_potencyActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed

    }//GEN-LAST:event_squareActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
        show.setText(show.getText() + "!");
    }//GEN-LAST:event_factorialActionPerformed

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
    private javax.swing.JPanel bg;
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteOne;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JButton factorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JButton potency;
    private javax.swing.JTextField show;
    private javax.swing.JButton square;
    private javax.swing.JButton times;
    private javax.swing.JButton toB;
    private javax.swing.JButton toG;
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
