package BackEnd;
/*import java.util.*;
import java.io.*;

public class MenuCliente {
    File clientesCad = new File("./src/Arquivos/clientesCadastrados.txt");
    Random rand = new Random();
    public static void menuC() throws IOException {
        Scanner input = new Scanner(System.in);

    }
    public void cadastroCliente() throws IOException {
        Cliente cliente = new Cliente();
        FileWriter cadastrarFile = new FileWriter(clientesCad, true);
        BufferedWriter cadastrarBuff = new BufferedWriter(cadastrarFile);
        cliente.setCodigo(rand.nextInt(9999));
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
    }*/
    
    
    /*   int i = 0;
        int optC = 0;
        do {
            switch (optC) {
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
    }*/

