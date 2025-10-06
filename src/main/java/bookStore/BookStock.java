package bookStore;

import java.util.Scanner;

public class BookStock {

        Scanner sc;
        private String bookName;
        private String writer;
        private String bookGender;
        private int bookPosition;
        private int output;
        private int quantifyOfBook;
        private double bookPrice;

        public BookStock() {
            this.sc = new Scanner(System.in);
        }

        public BookStock(String bookName, String writer, int bookPosition, int output, double bookPrice) {
            this.sc = new Scanner(System.in);
            this.bookName = bookName;
            this.writer = writer;
            this.bookGender = this.bookGender;
            this.bookPosition = bookPosition;
            this.output = output;
            this.quantifyOfBook = this.quantifyOfBook;
            this.bookPrice = bookPrice;
        }

        public String getBookName() {
            return this.bookName;
        }

        public void setBookName() {
            this.bookName = this.bookName;
        }

        public String getWriter() {
            return this.writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }

        public String getBookGender() {
            return this.bookGender;
        }

        public void setBookGender(String bookGender) {
            this.bookGender = bookGender;
        }

        public int getBookPosition() {
            return this.bookPosition;
        }

        public void setBookPosition(int bookPosition) {
            this.bookPosition = bookPosition;
        }

        public int getOutput() {
            return this.output;
        }

        public void setOutput(int output) {
            this.output = output;
        }

        public int getQuantifyOfBook() {
            return this.quantifyOfBook;
        }

        public void setQuantifyOfBook(int quantifyOfBook) {
            this.quantifyOfBook = quantifyOfBook;
        }

        public double getBookPrice() {
            return this.bookPrice;
        }

        public void setBookPrice(double bookPrice) {
            this.bookPrice = bookPrice;
        }

        public void newBook1() {
            System.out.println("Informe o nome do Livro: ");
            this.bookName = this.sc.nextLine();
            System.out.println("Informe o autor(a): ");
            this.writer = this.sc.nextLine();
            System.out.println("Informe o Gênero: ");
            this.bookGender = this.sc.nextLine();
            System.out.println("Informe o preço:");
            this.bookPrice = this.sc.nextDouble();
            System.out.println("Livro adicionado!");
        }

        public void listProducts1() {
            this.bookPosition = this.sc.nextInt();
            System.out.println(this.bookPosition + "." + this.bookName + "(" + this.bookPrice + ") |" + (this.quantifyOfBook - this.output) + " no estoque");
        }

        public void removeProduct1() {
            System.out.println("Informe a posição do livro a ser removido: ");
            System.out.println(this.bookPosition = this.sc.nextInt());
        }

        public void stockEntry1() {
            System.out.println("Informe a posição do livro: ");
            System.out.println(this.bookPosition = this.sc.nextInt());
            System.out.println("Informe a quantidade de Entrada: ");
            System.out.println(this.quantifyOfBook = this.sc.nextInt());
        }

        public void stockOut1() {
            System.out.println("Informe a posição do livro: ");
            System.out.println(this.bookPosition = this.sc.nextInt());
            System.out.println("Quantidade de saída: ");
            System.out.println(this.output = this.sc.nextInt());
        }

        public void exit1() {
            String closeMenu = "0";
            if ("0".equals("0")) {
                System.out.println("Fechando programa!\n");
        }
    }
}
