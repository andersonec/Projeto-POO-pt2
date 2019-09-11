/*package BackEnd;
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import java.util.Iterator;
public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        List<Cliente> clientes = new ArrayList<Cliente>();
        Cliente[] cliente = new Cliente[100];
        /*List<Venda> vendas = new ArrayList<Venda>();
        Venda[] venda = new Venda[1000];
        List<Produto> produtos = new ArrayList<Produto>();

        int n, i, num, j = 1;
        int opt = 0;
        int optC = 0;
        int c = 1;
        int v = 1;
        int optP, vCont = 0;
        int optV, vC = 0;
        int codigoC = 0;
        int vCont1 = 0;
        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1 - CLIENTES");
            System.out.println("2 - PRODUTOS");
            System.out.println("3 - VENDAS");
            System.out.println("0 - SAIR");
            opt = input.nextInt();
            switch (opt) {
            case 1:
                MenuCliente menuCliente = new MenuCliente();
                menuCliente.menuC();
                break;
            case 2:
                /*while (opt == 2) {
                    System.out.println("MENU PRODUTO");
                    System.out.println(" 1 - Cadrastar produto:  ");
                    System.out.println(" 2 - Lista de produtos cadrastado: ");
                    System.out.println(" 3 - Aumentar o estoque:  ");
                    System.out.println(" 4 - Lista de estoque disponivel:  ");
                    System.out.println(" 5 - Lista de estoque estogotado:  ");

                    num = input.nextInt();
                    if (num == 1) {
                        Produto[] produto = new Produto[100];
                        produto[j] = new Produto();
                        produto[j].codigo = rand.nextInt(9999);
                        produto[j].nome = "Produto " + j;
                        produto[j].precoVenda = rand.nextInt(999);
                        produto[j].quantidade = rand.nextInt(99);
                        produtos.add(produto[j]);
                        System.out.println("CADASTRADO");
                        j++;

                    }
                    if (num == 2) {
                        System.out.println("todos os produtos ");
                        for (i = 0; i < produtos.size(); i++) {
                            System.out.println("Codigo do produto: " + produtos.get(i).getCodigo() + "\nNome: "
                                    + produtos.get(i).getNome() + "\nPrecoVenda" + produtos.get(i).getPrecoVenda()
                                    + "\nQuantidade: " + produtos.get(i).getQuantidade());
                            System.out.println("\n");
                        }
                    }
                    if (num == 3) {
                        System.out.println("estoque: ");

                    }
                }
                break;
            case 3:
                /*while (opt == 3) {
                    System.out.println("MENU VENDAS");
                    System.out.println("1 - CADASTRAR VENDA");
                    System.out.println("2 - LISTAR VENDAS");
                    System.out.println("3 - BUSCAR CLIENTE");
                    System.out.println("0 - VOLTAR");
                    optV = input.nextInt();
                    switch (optV) {
                    case 1:
                        System.out.println("DIGITE O C脫DIGO DO CLIENTE:");
                        codigoC = input.nextInt();
                        for (i = 0; i < clientes.size(); i++) {
                            if (codigoC == clientes.get(i).getCodigo()) {
                                venda[v] = new Venda();
                                venda[v].setCodigoVenda(rand.nextInt(9999));
                                venda[v].setDiaV(input.nextInt());
                                venda[v].setMesV(input.nextInt());
                                venda[v].setCliente(clientes.get(i).getNome());
                                // clientes.get(i).setComprou(vendas.get(v).getCodigoVenda());
                                vendas.add(venda[v]);
                                v++;
                                vCont1++;
                            }
                        }
                        if (v > 0) {
                        } else {
                            System.out.println("CLIENTE N脙O ENCONTRADO");
                        }
                        break;
                    case 2:
                        System.out.println("LISTA DE VENDAS FEITAS");
                        for (i = 0; i < vendas.size(); i++) {
                            System.out.println("\nC贸digo da venda: " + vendas.get(i).getCodigoVenda() + "\nData: "
                                    + vendas.get(i).getDiaV() + "/" + vendas.get(i).getMesV() + "\nCliente: "
                                    + vendas.get(i).getCliente());
                        }
                        break;
                    case 3:
                        System.out.println("DIGITE O C脫DIGO DO CLIENTE:");
                        codigoC = input.nextInt();
                        for (i = 0; i < clientes.size(); i++) {
                            if (codigoC == clientes.get(i).getCodigo()) {
                                System.out.println("\nC贸digo: " + clientes.get(i).getCodigo() + "\nNome: "
                                        + clientes.get(i).getNome() + "\nCPF: " + clientes.get(i).getCpf());
                                vCont++;
                            }
                        }
                        if (vCont == 0) {
                            System.out.println("CLIENTE N脙O ENCONTRADO");
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        } while (opt != 0);
    }
}*/
