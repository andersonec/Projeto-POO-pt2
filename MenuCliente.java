import java.util.*;
import java.util.regex.*;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import java.io.*;
import BackEnd.*;

public class MenuCliente {
    public static void menuC() throws IOException {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Cliente cliente = new Cliente();
        File clientesCad = new File("./src/Arquivos/clientesCadastrados.txt");

        int i = 0;
        int optC = 0;
        do {
            System.out.println("\nMENU CLIENTE");
            System.out.println("1 - CADASTRAR CLIENTE");
            System.out.println("2 - LISTAR CLIENTES");
            System.out.println("3 - REMOVER CLIENTE");
            System.out.println("4 - LISTAR CLIENTES EXCLUIDOS");
            System.out.println("0 - VOLTAR");
            optC = input.nextInt();
            switch (optC) {
            case 1:
                FileWriter cadastrarFile = new FileWriter(clientesCad, true);
                BufferedWriter cadastrarBuff = new BufferedWriter(cadastrarFile);
                cliente.setCodigo(rand.nextInt(9999));
                cliente.cadastrar();
                try {
                    if (!clientesCad.exists()) {
                        clientesCad.createNewFile();
                    }
                    cadastrarBuff.write(cliente.getCadastroC() + "\n");
                    cadastrarBuff.close();
                    cadastrarFile.close();
                } catch (IOException except) {
                    except.printStackTrace();
                }
                break;
            case 2:
                FileReader listarFile = new FileReader(clientesCad);
                BufferedReader listarBuff = new BufferedReader(listarFile);
                try {
                    if (!clientesCad.exists()) {
                        System.out.println("NÃO TEMOS CLIENTES CADASTRADOS");
                    }
                    while (listarBuff.ready()) {
                        String linhaL = listarBuff.readLine();
                        System.out.println(linhaL);
                    }
                    listarBuff.close();
                    listarFile.close();
                } catch (IOException except) {
                    except.printStackTrace();
                }
                break;
            case 3:
                FileReader buscarFile = new FileReader(clientesCad);
                BufferedReader buscarBuff = new BufferedReader(buscarFile);
                int codigoC = 0;
                System.out.println("DIGITE O CÓDIGO DO CLIENTE A SER REMOVIDO: ");
                codigoC = input.nextInt();

                try {
                } catch (Exception except) {
                    except.printStackTrace();
                }
                buscarFile.close();
                buscarBuff.close();
                break;
            case 4:
                System.out.println("LISTA DE CLIENTES EXCLUIDOS");
                break;
            }
        } while (optC != 0);
    }
}
