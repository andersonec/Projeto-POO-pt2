/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;
import java.io.*;
import BackEnd.ManipularArquivoProduto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import BackEnd.*;
/**
 *
 * @author Alexandro
 */
public class Quantidade extends javax.swing.JInternalFrame {
    File produtoCad = new File("./src/arquivos/produtosCadastrados.txt");
    String codigoP = null;
    /**
     * Creates new form Quantidade
     */
    public Quantidade() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscarq = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoproduto = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        mudarquantidade = new javax.swing.JFormattedTextField();
        pesquisarp = new javax.swing.JButton();
        Adicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(894, 598));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(95, 94, 94));
        jLabel1.setText("AUMENTAR QUANTIDADE DE PRODUTO");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(95, 94, 94));
        jLabel2.setText("DIGITE O CODIGO DO PRODUTO ");

        buscarq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarqActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(31, 35, 38));
        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(95, 94, 94));
        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        infoproduto.setBackground(new java.awt.Color(153, 153, 153));
        infoproduto.setColumns(20);
        infoproduto.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        infoproduto.setRows(5);
        infoproduto.setDisabledTextColor(new java.awt.Color(95, 94, 94));
        infoproduto.setEnabled(false);
        infoproduto.setOpaque(false);
        jScrollPane1.setViewportView(infoproduto);

        jLabel3.setBackground(new java.awt.Color(32, 35, 38));
        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(95, 94, 94));
        jLabel3.setText("DIGITE A QUANTIDADE DO PRODUTO QUE DESEJA: ");

        mudarquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarquantidadeActionPerformed(evt);
            }
        });

        pesquisarp.setBackground(new java.awt.Color(31, 34, 38));
        pesquisarp.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        pesquisarp.setForeground(new java.awt.Color(95, 94, 94));
        pesquisarp.setText("PESQUISAR");
        pesquisarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarpActionPerformed(evt);
            }
        });

        Adicionar.setBackground(new java.awt.Color(31, 35, 38));
        Adicionar.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        Adicionar.setForeground(new java.awt.Color(95, 94, 94));
        Adicionar.setText("ADICIONAR");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscarq, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesquisarp))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mudarquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Adicionar)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarp))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mudarquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adicionar))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pesquisarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarpActionPerformed
         ManipularArquivoProduto imprimirNome = new ManipularArquivoProduto();
         ManipularArquivoProduto imprimirPrecoVenda = new ManipularArquivoProduto();
         ManipularArquivoProduto imprimirPrecoCusto = new ManipularArquivoProduto();
         ManipularArquivoProduto imprimirQuantidade = new ManipularArquivoProduto();
         ManipularArquivoProduto imprimirFornecedor = new ManipularArquivoProduto();
         int posicao = 0;
         codigoP = buscarq.getText();
         String dadosProdutos = null;
         
        try {
            FileReader listarFile = new FileReader(produtoCad);
            BufferedReader listarBuff = new BufferedReader(listarFile);
            
            imprimirNome.mapearArquivo(produtoCad);
            imprimirPrecoVenda.mapearArquivo(produtoCad);
            imprimirPrecoCusto.mapearArquivo(produtoCad);
            imprimirQuantidade.mapearArquivo(produtoCad);
            imprimirFornecedor.mapearArquivo(produtoCad);
             
            
            for ( int i = 0 ; i < produtoCad.length() ; i++ ) {
                String linhaL = listarBuff.readLine();
                if(("CODIGO: " + codigoP).equals(linhaL)){
                    JOptionPane.showMessageDialog(null, "Produto encontrado!");
                    posicao = i + 1;
                    
                    imprimirNome.setProdutoEncontrado(posicao);
                    imprimirPrecoVenda.setProdutoEncontrado(posicao +1);
                    imprimirPrecoCusto.setProdutoEncontrado(posicao + 2);
                    imprimirQuantidade.setProdutoEncontrado(posicao + 3);
                    imprimirFornecedor.setProdutoEncontrado(posicao + 4);
                    
                    dadosProdutos = codigoP + "\n"+imprimirNome.getProdutoEncontrado() + "\n" 
                               + imprimirPrecoVenda.getProdutoEncontrado() +
                                    "\n" + imprimirPrecoCusto.getProdutoEncontrado() + "\n" +
                                        imprimirQuantidade.getProdutoEncontrado() +"\n" + 
                                            imprimirFornecedor.getProdutoEncontrado();
                    
                    
                }
                
            }
            infoproduto.append(dadosProdutos); 
            JOptionPane.showMessageDialog(null, dadosProdutos);
            listarBuff.close();
            listarFile.close();
        }   catch (IOException except) {
                except.printStackTrace();
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarpActionPerformed

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        codigoP = mudarquantidade.getText();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_AdicionarActionPerformed

    private void buscarqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarqActionPerformed
         
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarqActionPerformed

    private void mudarquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mudarquantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(Quantidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quantidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quantidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quantidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quantidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JFormattedTextField buscarq;
    private javax.swing.JTextArea infoproduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField mudarquantidade;
    private javax.swing.JButton pesquisarp;
    // End of variables declaration//GEN-END:variables
}
