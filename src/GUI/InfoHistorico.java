package GUI;

import Estructuras.NodoLista;
import javax.swing.DefaultListModel;
import logic.Cliente;
import logic.Habitacion;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class InfoHistorico extends javax.swing.JFrame {

    public InfoHistorico(Habitacion info) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        hab.setText(String.format("Habitación #%s", info.numHab));
        habInfo.setText(String.format("Piso: %d | Habitación %s | %s", info.piso, info.tipoHab, info.cliente == null? "Disponible":"Ocupada"));
        ocupante.setText(String.format("%s", info.cliente == null? "Habitación Disponible": info.cliente.nombre + " " + info.cliente.apellido));
        DefaultListModel mod = new DefaultListModel();
        lista.setModel(mod);
        for (NodoLista i = info.historico.first; i != null; i = i.siguente) {
            Cliente j = (Cliente) i.data;
            mod.addElement(String.format("<html><i COLOR=GRAY>Cliente:</i> %s %s <br/><i COLOR=GRAY>Cedula:</i> %s"
                    + "<br/><i COLOR=GRAY>Email:</i> %s <br/><i COLOR=GRAY>Genero:</i> %s <br/><i COLOR=GRAY>Llegada:</i> %s <br/> &nbsp;</html>",
                    j.nombre, j.apellido, j.cedula == 0 ? "-" : j.cedula, j.email, j.genero, j.llegada));
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

        arrival1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        hab = new javax.swing.JLabel();
        habInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ocupante = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        arrival1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        arrival1.setText("09/07/2023");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel12.setText("Fecha de llegada:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        hab.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        hab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hab.setText("Habitacion #");

        habInfo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        habInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        habInfo.setText("Piso: 1 | Habitacion simple");

        lista.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setViewportView(lista);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("Historial:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setText("Ocupada por:");

        ocupante.setText("cliente");

        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(habInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(hab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ocupante))
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hab)
                .addGap(0, 0, 0)
                .addComponent(habInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ocupante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrival1;
    private javax.swing.JButton back;
    private javax.swing.JLabel hab;
    private javax.swing.JLabel habInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JLabel ocupante;
    // End of variables declaration//GEN-END:variables
}
