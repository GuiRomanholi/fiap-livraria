// classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        //instaciando o objeto => criar o objeto na memoria
        // tipoObjeto nomeObjeto = operadorInstanciação construtor;
        //  Livro       favorito =         new           Livro();
        //Instanciar editora
        Editora editora = new Editora();
        editora.nome = "Harper Collin";
        editora.representante = "João";



        Livro favorito = new Livro("Harry Potter");
        //favorito.titulo = "Harry Potter";
        favorito.autor = "JK Rolling";
        favorito.editora = editora;
        favorito.valor = 50.98;
        favorito.resumo = "Magia e diversão bla bla bla...";
        favorito.tipoCapa = "Comum";

        System.out.println("Meu livro favorito é " + favorito.titulo + " \no seu autor é " + favorito.autor);
        System.out.println(favorito.exibirDados());

        Livro meuLivro = new Livro("Diario de um Banana");
        meuLivro.tipoCapa = "Dura";
        meuLivro.valor = 10.40;
        meuLivro.paginas = 60;
        meuLivro.editora = editora;
        //meuLivro.titulo = "Diario de um Banana";

        System.out.println(meuLivro.exibirDados());

    }

}
