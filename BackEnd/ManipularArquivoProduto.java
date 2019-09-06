/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;
import java.io.*;
import java.util.*;
/**
 *
 * @author Alexandro
 */
public class ManipularArquivoProduto {
    File produtosCad = new File("./src/Arquivos/produtosCadastrados.txt");
    HashMap<Integer, String> linhasArquivo = new HashMap<Integer, String>();
    private String cadastrados = " ";
    private String produtoEncontrado = " ";
    public void escreverArquivo(File arquivo, String objeto) throws IOException{
        FileWriter cadastrarFile = new FileWriter(produtosCad, true);
        PrintWriter cadastrarPrint = new PrintWriter(cadastrarFile);
        cadastrarPrint.println(objeto);
        cadastrarPrint.flush();
        cadastrarPrint.close();
        cadastrarFile.close();
    }
    public void lerArquivo(File arquivo) throws IOException{
        FileReader listarFile = new FileReader(arquivo);
        BufferedReader listarBuff = new BufferedReader(listarFile);
        while (listarBuff.ready()) {
            String linhaL = listarBuff.readLine();
            cadastrados += linhaL + "\n";
        }
        listarBuff.close();
        listarFile.close();
    }
    public String getCadastrados(){
        return cadastrados;
    }
    public void mapearArquivo(File arquivo) throws IOException{
        BufferedReader mapearBuff = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)));
        String linhaM = null;
        int numLinha = 0;
        while((linhaM = mapearBuff.readLine()) != null){
            linhasArquivo.put(numLinha, linhaM);
            numLinha++;
        }
        mapearBuff.close();
        //usar linhasArquivo.get(NUMERO DA LINHA);
    }
    public void setProdutoEncontrado(int posicaoLinha){
        this.produtoEncontrado = linhasArquivo.get(posicaoLinha);
    }
    public String getProdutoEncontrado(){
        return produtoEncontrado;
    } 
    
    public void removerDoArquivo(File arquivo, String codigoRem, String nomeRem, String precoVendaRem, String precoCustoRem,
         String quantidadeRem, String fornecedorRem) throws IOException{
         File tempArquivo = new File(arquivo + ".temp");
         BufferedReader leitorBuff = new BufferedReader(new FileReader(arquivo));
         PrintWriter imprimirTemp = new PrintWriter(new FileWriter(tempArquivo));
         String linhaT = null;
         
         while((linhaT = leitorBuff.readLine()) != null){
             if(!linhaT.equals(codigoRem) && !linhaT.equals(nomeRem) && !linhaT.equals(precoVendaRem) 
                     && !linhaT.equals(precoCustoRem) && !linhaT.equals(quantidadeRem) && !linhaT.equals(fornecedorRem)){
                 imprimirTemp.println(linhaT);
                 imprimirTemp.flush();
             }
         }
         arquivo.delete();
         tempArquivo.renameTo(arquivo);
         imprimirTemp.close();
         imprimirTemp.flush();
        
     }
    public void AumentarQuantidade(File arquivo, String codigoRem, String nomeRem, String precoVendaRem, 
                            String precoCustoRem, String quantidadeRem, String fornecedorRem) throws IOException{
         File tempArquivo = new File(arquivo + ".temp");
         BufferedReader leitorBuff = new BufferedReader(new FileReader(arquivo));
         PrintWriter imprimirTemp = new PrintWriter(new FileWriter(tempArquivo));
         
         String linhaT = null;
         while((linhaT = leitorBuff.readLine()) != null){
             if( !linhaT.equals(quantidadeRem) ){
                 imprimirTemp.println(linhaT);
                 imprimirTemp.flush();
             }
         }
         arquivo.delete();
         tempArquivo.renameTo(arquivo);
         imprimirTemp.close();
         imprimirTemp.flush();
    
    }
}

