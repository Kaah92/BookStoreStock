package bookStore;

import java.util.Scanner;

public class BookStoreControl {
        static Scanner sc;
        static String choiceTheOption;
        static BookStock stock;

        public static void imprime() {
            while(true) {
                System.out.println("==================================\n");
                System.out.println("CONTROLE DE ESTOQUE - LIVRARIA");
                System.out.println("Escolha uma opção:\n");
                System.out.println("[1] Novo");
                System.out.println("[2] Listar Produtos");
                System.out.println("[3] Remover Produtos");
                System.out.println("[4] Entrada Estoque");
                System.out.println("[5] Saída Estoque");
                System.out.println("[0] Sair");
                choiceTheOption = sc.next();
                switch (choiceTheOption) {
                    case "1":
                        stock.newBook1();
                        break;
                    case "2":
                        stock.listProducts1();
                        break;
                    case "3":
                        stock.removeProduct1();
                        break;
                    case "4":
                        stock.stockEntry1();
                        break;
                    case "5":
                        stock.stockOut1();
                        break;
                    case "0":
                        stock.exit1();
                        sc.close();
                        return;
                    default:
                        System.out.println("Opção não encontrada, digite novamente");
            }
        }
    }
    static {
        sc = new Scanner(System.in);
        stock = new BookStock();
    }
}
