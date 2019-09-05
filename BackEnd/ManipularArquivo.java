package BackEnd;
import java.io.*;
import java.util.*;

public class ManipularArquivo {
    HashMap<Integer, String> linhasArquivo = new HashMap<Integer, String>();
    private String objetosRetornados = "";
    private String objetoEncontrado = "";
    
    public void escreverArquivo(File arquivo, String objeto) throws IOException{
        FileWriter cadastrarFile = new FileWriter(arquivo, true);
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
            objetosRetornados += linhaL + "\n";
        }
        listarBuff.close();
        listarFile.close();
    }
    
    public String getObjetosRetornados(){
        return objetosRetornados;
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
    public void setClienteEncontrado(int posicaoLinha){
        this.objetoEncontrado = linhasArquivo.get(posicaoLinha);
    }
    public String getClienteEncontrado(){
        return objetoEncontrado;
    }
    
    public void removerDoArquivo(File arquivo, String codigoRem, String nomeRem, String cpfRem) throws IOException{
        File tempArquivo = new File(arquivo + ".temp");
        BufferedReader leitorBuff = new BufferedReader(new FileReader(arquivo));
        PrintWriter imprimirTemp = new PrintWriter(new FileWriter(tempArquivo));
        String linhaT = null;
        while((linhaT = leitorBuff.readLine()) != null){
            if(!linhaT.equals(codigoRem) && !linhaT.equals(nomeRem) && !linhaT.equals(cpfRem)){
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
