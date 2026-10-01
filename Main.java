import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listaLivro = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        

        for (int i = 0; i <= 1; i++) {
            Livro livrinho = new Livro();
            System.out.println("Digite o titulo do seu livro: ");
            livrinho.setTitulo(leitor.nextLine());
            System.out.println("Digite o autor do seu livro: ");
            livrinho.setAutor(leitor.nextLine());
            System.out.println("Digite o preço do seu livro: ");
            livrinho.setPreco(leitor.nextDouble());

            listaLivro.add(livrinho);
            leitor.nextLine();
            // listaLivro.remove(0);
            // listaLivro.size();
        };
        for (int i = 0; i < listaLivro.size(); i++) {
            Livro l = listaLivro.get(i);
            System.out.println("Livro: " + l.getTitulo() + "| Autor:" + l.getAutor() + "| R$  " + l.getPreco());

        };
        leitor.close();
    }
}
