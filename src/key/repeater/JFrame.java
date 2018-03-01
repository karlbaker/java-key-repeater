package key.repeater;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class JFrame extends javax.swing.JFrame{
    int key;
    Thread t;
    robot r;
    
    private class MyDispatcher implements KeyEventDispatcher {
        @Override
        public boolean dispatchKeyEvent(KeyEvent eKey) {
            if (eKey.getID() == KeyEvent.KEY_PRESSED) {
                String sKey1 = "" + eKey.getKeyChar();
                switch (eKey.getKeyCode()) {
                    case KeyEvent.VK_F1:
                        jLabel1.setText("F1");
                        break;
                    case KeyEvent.VK_F2:
                        jLabel1.setText("F2");
                        break;
                    case KeyEvent.VK_F3:
                        jLabel1.setText("F3");
                        break;
                    case KeyEvent.VK_F4:
                        jLabel1.setText("F4");
                        break;
                    case KeyEvent.VK_F5:
                        jLabel1.setText("F5");
                        break;
                    case KeyEvent.VK_F6:
                        jLabel1.setText("F6");
                        break;
                    case KeyEvent.VK_F7:
                        jLabel1.setText("F7");
                        break;
                    case KeyEvent.VK_F8:
                        jLabel1.setText("F8");
                        break;
                    case KeyEvent.VK_F9:
                        jLabel1.setText("F9");
                        break;
                    case KeyEvent.VK_F10:
                        jLabel1.setText("F10");
                        break;
                    case KeyEvent.VK_F11:
                        jLabel1.setText("F11");
                        break;
                    case KeyEvent.VK_F12:
                        jLabel1.setText("F12");
                        break;
                    case KeyEvent.VK_SHIFT:
                        jLabel1.setText("<SHIFT>");
                        break;
                    case KeyEvent.VK_SPACE:
                        jLabel1.setText("<SPACE BAR>");
                        break;
                    case KeyEvent.VK_CONTROL:
                        jLabel1.setText("<CTRL>");
                        break;
                    case KeyEvent.VK_ALT:
                        jLabel1.setText("<ALT>");
                        break;
                    case KeyEvent.VK_WINDOWS:
                        jLabel1.setText("<WIN KEY>");
                        break;
                    case KeyEvent.VK_CONTEXT_MENU:
                        jLabel1.setText("<CONTEXT MENU>");
                        break;
                    default:
                        jLabel1.setText(sKey1);
                        break;
                }
                key = eKey.getKeyCode();
                repaint();
                
            } else if (eKey.getID() == KeyEvent.KEY_RELEASED) {
                
            } else if (eKey.getID() == KeyEvent.KEY_TYPED) {
                
            }
            return false;
        }

    }

    
    public JFrame() {
        initComponents();
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Keystroke Replicator");

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Assigned Key");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Status: Stopped");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jLabel1.getText().equals("--")){
            r = new robot(key);
            t = new Thread(r);
            t.start();
            jLabel3.setText("Status: Started"); 
        }else{
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Press a key before starting.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        r.setStartStop(false);
        t.interrupt();
        jLabel3.setText("Status: Stopped");
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
