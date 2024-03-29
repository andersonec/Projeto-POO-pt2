/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.ManipularArquivoProduto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandro
 */
public class CategoriasProdutos extends javax.swing.JInternalFrame {
        File produtoCad = new File("./src/arquivos/produtosCadastrados.txt");
        File produtoRem = new File("./src/arquivos/produtosRemovido.txt");
        String codigoP = null;
        String dadosProdutos = " ";
        ManipularArquivoProduto imprimirNome = new ManipularArquivoProduto();
        ManipularArquivoProduto imprimirPrecoVenda = new ManipularArquivoProduto();
        ManipularArquivoProduto imprimirPrecoCusto = new ManipularArquivoProduto();
        ManipularArquivoProduto imprimirQuantidade = new ManipularArquivoProduto();
        ManipularArquivoProduto imprimirFornecedor = new ManipularArquivoProduto();
        String produtoBusca = null;
    /**
     * Creates new form CategoriasProdutos
     */
    public CategoriasProdutos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        categorias = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listarcategorias = new javax.swing.JTextArea();

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(95, 94, 94));
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(95, 94, 94));
        jLabel1.setText("CATEGORIAS DE PRODUTOS ");

        categorias.setBackground(new java.awt.Color(153, 153, 153));
        categorias.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        categorias.setForeground(new java.awt.Color(95, 94, 94));
        categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAPATO", "CALÇA", "CASACO", "MOLETON", "CAMISA", "MERMUDA", "MEIA" }));
        categorias.setName(""); // NOI18N
        categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(95, 94, 94));
        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listarcategorias.setEditable(false);
        listarcategorias.setBackground(new java.awt.Color(153, 153, 153));
        listarcategorias.setColumns(20);
        listarcategorias.setRows(5);
        listarcategorias.setDisabledTextColor(new java.awt.Color(95, 94, 94));
        jScrollPane2.setViewportView(listarcategorias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(57, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasActionPerformed
            int posicao = 0;
            codigoP = categorias.getItemAt(WIDTH);
       
         
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
                else{
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    
                }
                
            }
            listarcategorias.append(dadosProdutos); 
            JOptionPane.showMessageDialog(null, dadosProdutos);
            listarBuff.close();
            listarFile.close();
        }   catch (IOException except) {
                except.printStackTrace();
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasActionPerformed

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
            java.util.logging.Logger.getLogger(CategoriasProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriasProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriasProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriasProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriasProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categorias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea listarcategorias;
    // End of variables declaration//GEN-END:variables
}
