package org.sleuthkit.autopsy.modules.virustotalonlinecheck;

import org.sleuthkit.autopsy.ingest.IngestModuleIngestJobSettings;
import org.sleuthkit.autopsy.ingest.IngestModuleIngestJobSettingsPanel;

public class VirusTotalOnlineCheckJobSettingsPanel extends IngestModuleIngestJobSettingsPanel {

    private VirusTotalOnlineCheckSettings settings;

    VirusTotalOnlineCheckJobSettingsPanel(VirusTotalOnlineCheckSettings settings) {
        initComponents();
        this.settings = settings;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        apiKeyLabel = new javax.swing.JLabel();
        apiKeyTextField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(VirusTotalOnlineCheckJobSettingsPanel.class, "VirusTotalOnlineCheckJobSettingsPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(apiKeyLabel, org.openide.util.NbBundle.getMessage(VirusTotalOnlineCheckJobSettingsPanel.class, "VirusTotalOnlineCheckJobSettingsPanel.apiKeyLabel.text")); // NOI18N

        apiKeyTextField.setText(org.openide.util.NbBundle.getMessage(VirusTotalOnlineCheckJobSettingsPanel.class, "VirusTotalOnlineCheckJobSettingsPanel.apiKeyTextField.text")); // NOI18N
        apiKeyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apiKeyTextFieldActionPerformed(evt);
            }
        });
        apiKeyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apiKeyTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apiKeyLabel)
                    .addComponent(apiKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apiKeyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apiKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void apiKeyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apiKeyTextFieldActionPerformed

    }//GEN-LAST:event_apiKeyTextFieldActionPerformed

    private void apiKeyTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apiKeyTextFieldKeyTyped
        settings.setApiKey(apiKeyTextField.getText());
    }//GEN-LAST:event_apiKeyTextFieldKeyTyped

    @Override
    public IngestModuleIngestJobSettings getSettings() {
        return settings;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apiKeyLabel;
    private javax.swing.JTextField apiKeyTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}