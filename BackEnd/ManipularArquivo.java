package BackEnd;
import java.io.*;
import java.util.*;

public class ManipularArquivo {
    File clientesCad = new File("./src/Arquivos/clientesCadastrados.txt");
    HashMap<Integer, String> linhasArquivo = new HashMap<Integer, String>();
    private String cadastrados = null;
    private String clienteEncontrado = null;
    public void escreverArquivo(String objeto) throws IOException{
        FileWriter cadastrarFile = new FileWriter(clientesCad, true);
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
    public void setClienteEncontrado(int posicaoLinha){
        this.clienteEncontrado = linhasArquivo.get(posicaoLinha);
    }
    public String getClienteEncontrado(){
        return clienteEncontrado;
    }
}
