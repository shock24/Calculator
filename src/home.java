
import java.util.Arrays;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shrey
 */
public class home extends javax.swing.JFrame {
String newExp="";
int index=0;
String[] s1=new String[300];
String[] s2=new String[300];
double calculate(String exp){
    System.arraycopy(s1,0,s2,0,s1.length);
    int temp,n1,n2;
    for(int i=0;i<s2.length;i++){
        if(s2[i].equals("/")){
            temp=i;
            for(n1=1;;n1++){
            if(!"".equals(s2[temp-n1]))break;
            }
            for(n2=1;;n2++){
                try{
            if(!"".equals(s2[temp+n2]))break;
            }
            catch(Exception e){break;}}
            try{
            s2[i]=""+((Double.parseDouble(s2[temp-n1]))/(Double.parseDouble(s2[temp+n2])));
            s2[temp-n1]="";s2[temp+n2]="";
            }
            catch(Exception e){}
        }        
    }
    for(int i=0;i<s2.length;i++){
        if(s2[i].equals("*")){
            temp=i;
            for(n1=1;;n1++){
            if(!"".equals(s2[temp-n1]))break;
            }
            for(n2=1;;n2++){
           try{
            if(!"".equals(s2[temp+n2]))break;
            }
            catch(Exception e){break;} }
            try{
            s2[i]=""+((Double.parseDouble(s2[temp-n1]))*(Double.parseDouble(s2[temp+n2])));
            s2[temp-n1]="";s2[temp+n2]="";
            }
            catch(Exception e){}
        }        
    }
    for(int i=0;i<s2.length;i++){
        if(s2[i].equals("-")){
            temp=i;
            for(n1=1;;n1++){
            if(!"".equals(s2[temp-n1]))break;
            }
            for(n2=1;;n2++){
            try{
            if(!"".equals(s2[temp+n2]))break;
            }
            catch(Exception e){break;}}
            try{
            s2[i]=""+((Double.parseDouble(s2[temp-n1]))-(Double.parseDouble(s2[temp+n2])));
            s2[temp-n1]="";s2[temp+n2]="";
            }
            catch(Exception e){}
        }        
    }
    for(int i=0;i<s2.length;i++){
        if(s2[i].equals("+")){
            temp=i;
            for(n1=1;;n1++){
            if(!"".equals(s2[temp-n1]))break;
            }
            for(n2=1;;n2++){
            try{
            if(!"".equals(s2[temp+n2]))break;
            }
            catch(Exception e){break;}}
            try{
            s2[i]=""+((Double.parseDouble(s2[temp-n1]))+(Double.parseDouble(s2[temp+n2])));
            s2[temp-n1]="";s2[temp+n2]="";
            }
            catch(Exception e){}
        }        
    }
    for (String s11 : s2) {
        if (!"".equals(s11)) {
            return Double.parseDouble(s11);
        }
    }
    return 0.0;
}

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
     myinitComponents();
     Arrays.fill(s1, "");
           }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        bHistory = new javax.swing.JButton();
        fExp = new javax.swing.JTextField();
        fAns = new javax.swing.JTextField();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bDot = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bEqual = new javax.swing.JButton();
        bDel = new javax.swing.JButton();
        bDivide = new javax.swing.JButton();
        bMultiply = new javax.swing.JButton();
        bMinus = new javax.swing.JButton();
        bPlus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(450, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(java.awt.Color.white);
        jToggleButton1.setFont(new java.awt.Font("Ubuntu", 0, 22)); // NOI18N
        jToggleButton1.setText("Deg");
        jToggleButton1.setAlignmentY(0.0F);
        jToggleButton1.setOpaque(true);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        bHistory.setBackground(java.awt.Color.white);
        bHistory.setFont(new java.awt.Font("Ubuntu", 0, 22)); // NOI18N
        bHistory.setText("History");
        bHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(bHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 100, 40));

        fExp.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        getContentPane().add(fExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 80));

        fAns.setEditable(false);
        fAns.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        getContentPane().add(fAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 450, 60));

        b7.setBackground(java.awt.Color.black);
        b7.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b7.setForeground(java.awt.Color.white);
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, 100));

        b8.setBackground(java.awt.Color.black);
        b8.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b8.setForeground(java.awt.Color.white);
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 100, 100));

        b9.setBackground(java.awt.Color.black);
        b9.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b9.setForeground(java.awt.Color.white);
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 100, 100));

        b4.setBackground(java.awt.Color.black);
        b4.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b4.setForeground(java.awt.Color.white);
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 100, 100));

        b1.setBackground(java.awt.Color.black);
        b1.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b1.setForeground(java.awt.Color.white);
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 100, 100));

        b5.setBackground(java.awt.Color.black);
        b5.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b5.setForeground(java.awt.Color.white);
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 100, 100));

        b2.setBackground(java.awt.Color.black);
        b2.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b2.setForeground(java.awt.Color.white);
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 100, 100));

        b6.setBackground(java.awt.Color.black);
        b6.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b6.setForeground(java.awt.Color.white);
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 100, 100));

        b3.setBackground(java.awt.Color.black);
        b3.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b3.setForeground(java.awt.Color.white);
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 100, 100));

        bDot.setBackground(java.awt.Color.black);
        bDot.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        bDot.setForeground(java.awt.Color.white);
        bDot.setText(".");
        bDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDotActionPerformed(evt);
            }
        });
        getContentPane().add(bDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 100, 100));

        b0.setBackground(java.awt.Color.black);
        b0.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        b0.setForeground(java.awt.Color.white);
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        getContentPane().add(b0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 100, 100));

        bEqual.setBackground(java.awt.Color.black);
        bEqual.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        bEqual.setForeground(java.awt.Color.white);
        bEqual.setText("=");
        bEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqualActionPerformed(evt);
            }
        });
        getContentPane().add(bEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 100, 100));

        bDel.setBackground(java.awt.Color.darkGray);
        bDel.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        bDel.setForeground(java.awt.Color.white);
        bDel.setText("DEL");
        bDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelActionPerformed(evt);
            }
        });
        getContentPane().add(bDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 80, 80));

        bDivide.setBackground(java.awt.Color.darkGray);
        bDivide.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        bDivide.setForeground(java.awt.Color.white);
        bDivide.setText("÷");
        bDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivideActionPerformed(evt);
            }
        });
        getContentPane().add(bDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 80, 80));

        bMultiply.setBackground(java.awt.Color.darkGray);
        bMultiply.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        bMultiply.setForeground(java.awt.Color.white);
        bMultiply.setText("×");
        bMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(bMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 80, 80));

        bMinus.setBackground(java.awt.Color.darkGray);
        bMinus.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        bMinus.setForeground(java.awt.Color.white);
        bMinus.setText("-");
        bMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinusActionPerformed(evt);
            }
        });
        getContentPane().add(bMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 80, 80));

        bPlus.setBackground(java.awt.Color.darkGray);
        bPlus.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        bPlus.setForeground(java.awt.Color.white);
        bPlus.setText("+");
        bPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlusActionPerformed(evt);
            }
        });
        getContentPane().add(bPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 80, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void myinitComponents(){
fExp.setHorizontalAlignment(SwingConstants.RIGHT);
fAns.setHorizontalAlignment(SwingConstants.RIGHT);
}
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       s1[index]+="5";
        newExp+="5";
        fExp.setText(newExp); 
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
     s1[index]+="6";
        newExp+="6";
        fExp.setText(newExp); 
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        s1[index]+="1";
        newExp+="1";
        fExp.setText(newExp); 
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        s1[index]+="0";
        newExp+="0";
        fExp.setText(newExp);   
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b0ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        s1[index]+="9";
        newExp+="9";
        fExp.setText(newExp);   
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        s1[index]+="4";
        newExp+="4";
        fExp.setText(newExp);   
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        s1[index]+="7";
        newExp+="7";
        fExp.setText(newExp);
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        s1[index]+="2";
        newExp+="2";
        fExp.setText(newExp);    
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        s1[index]+="3";
        newExp+="3";
        fExp.setText(newExp);   
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        s1[index]+="8";
        newExp+="8";
        fExp.setText(newExp);    
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void bDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDotActionPerformed
        s1[index]+=".";
        newExp+=".";
        fExp.setText(newExp);  
        fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_bDotActionPerformed

    private void bDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDelActionPerformed
       try{
           s1[index]=s1[index].substring(0, s1[index].length()-1);
    }
       catch(Exception e){
           if(index>0)
           {index--;
       s1[index]=s1[index].substring(0, s1[index].length()-1);}
    }
        try{
    newExp=newExp.substring(0, newExp.length()-1);
fExp.setText(newExp);}
catch(Exception e){
}
fAns.setText(""+calculate(newExp));// TODO add your handling code here:
    }//GEN-LAST:event_bDelActionPerformed

    private void bDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivideActionPerformed
      if(newExp.endsWith("+")||newExp.endsWith("-")||newExp.endsWith("×")||newExp.endsWith("÷")){
       newExp=newExp.substring(0, newExp.length()-1)+"÷";
      s1[--index]="/";
       index++;}
       else
      { newExp+="÷";
       fExp.setText(newExp);  
       index++;
       s1[index]+="/";
       index++;
      } 
fExp.setText(newExp); // TODO add your handling code here:
    }//GEN-LAST:event_bDivideActionPerformed

    private void bMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiplyActionPerformed
        if(newExp.endsWith("+")||newExp.endsWith("-")||newExp.endsWith("×")||newExp.endsWith("÷")){
       newExp=newExp.substring(0, newExp.length()-1)+"×";}
       else
        newExp+="×";
       fExp.setText(newExp);
       index++;
       s1[index]+="*";
       index++;
        // TODO add your handling code here:
    }//GEN-LAST:event_bMultiplyActionPerformed

    private void bMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinusActionPerformed
        if(newExp.endsWith("+")||newExp.endsWith("-")||newExp.endsWith("×")||newExp.endsWith("÷")){
       newExp=newExp.substring(0, newExp.length()-1)+"-";}
       else
        newExp+="-";
       fExp.setText(newExp);
       index++;
       s1[index]+="-";
       index++;
        
    }//GEN-LAST:event_bMinusActionPerformed

    private void bPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlusActionPerformed
        if(newExp.endsWith("+")||newExp.endsWith("-")||newExp.endsWith("×")||newExp.endsWith("÷")){
       newExp=newExp.substring(0, newExp.length()-1)+"+";}
       else
        newExp+="+";
       fExp.setText(newExp);
       index++;
       s1[index]+="+";
       index++;
        
    }//GEN-LAST:event_bPlusActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void bHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHistoryActionPerformed
System.out.println(s1[0]+" "+s1[1]+" "+s1[2]+" "+s1[3]);        // TODO add your handling code here:
    }//GEN-LAST:event_bHistoryActionPerformed

    private void bEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEqualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEqualActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bDel;
    private javax.swing.JButton bDivide;
    private javax.swing.JButton bDot;
    private javax.swing.JButton bEqual;
    private javax.swing.JButton bHistory;
    private javax.swing.JButton bMinus;
    private javax.swing.JButton bMultiply;
    private javax.swing.JButton bPlus;
    private javax.swing.JTextField fAns;
    private javax.swing.JTextField fExp;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
