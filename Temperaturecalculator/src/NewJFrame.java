/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMAN10-PC
 */
public class NewJFrame extends javax.swing.JFrame {
 
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        Celsius = new javax.swing.JLabel();
        Kelvin = new javax.swing.JLabel();
        TempSlider1 = new javax.swing.JSlider();
        Fahrenheit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Celsius.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Celsius.setForeground(new java.awt.Color(255, 51, 51));
        Celsius.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Celsius.setText("0 celsius");
        Celsius.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));

        Kelvin.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Kelvin.setForeground(new java.awt.Color(0, 153, 0));
        Kelvin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kelvin.setText("273.15 Kelvin");
        Kelvin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));

        TempSlider1.setBackground(java.awt.Color.blue);
        TempSlider1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TempSlider1.setForeground(new java.awt.Color(255, 255, 255));
        TempSlider1.setMajorTickSpacing(10);
        TempSlider1.setMaximum(120);
        TempSlider1.setMinimum(-120);
        TempSlider1.setMinorTickSpacing(1);
        TempSlider1.setPaintLabels(true);
        TempSlider1.setPaintTicks(true);
        TempSlider1.setSnapToTicks(true);
        TempSlider1.setValue(0);
        TempSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TempSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TempSlider1StateChanged(evt);
            }
        });

        Fahrenheit.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Fahrenheit.setForeground(new java.awt.Color(0, 153, 0));
        Fahrenheit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fahrenheit.setLabelFor(Fahrenheit);
        Fahrenheit.setText("32 Fahranheit");
        Fahrenheit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        Fahrenheit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Temperature Calculator");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Note :- Just move the pointer of the slider with mouse and convert the temperature in Fahrenhiet and kelvin");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(Celsius, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TempSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Celsius, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(TempSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        Kelvin.getAccessibleContext().setAccessibleName("32 Fahrenhiet");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TempSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TempSlider1StateChanged
        // TODO add your handling code here:

        int temperature = TempSlider1.getValue();
        Celsius.setText(""+temperature+"º Celsius");
        
        float tempkel = (float) (temperature  + 273.15) ;
        Kelvin.setText(""+tempkel+"º Kelvin");
        
        float tempfah = (float) ((temperature * 1.8) + 32) ;
        Fahrenheit.setText(""+tempfah+"º Fahrenheit");
        
}//GEN-LAST:event_TempSlider1StateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Celsius;
    private javax.swing.JLabel Fahrenheit;
    private javax.swing.JLabel Kelvin;
    private javax.swing.JSlider TempSlider1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
