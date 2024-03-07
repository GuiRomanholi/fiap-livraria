// classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        //instaciando o objeto => criar o objeto na memoria
        // tipoObjeto nomeObjeto = operadorInstanciação construtor;
        //  Livro       favorito =         new           Livro();
        Livro favorito = new Livro();
        favorito.titulo = "Harry Potter";
        favorito.autor = "JK Rolling";
        favorito.editora = "Felicidade";
        favorito.valor = 50.98;
        favorito.resumo = "Magia e diversão bla bla bla...";
        favorito.tipoCapa = "Comunm";

        System.out.println("Meu livro favorito é " + favorito.titulo + " \no seu autor é " + favorito.autor);

        Livro meuLivro = new Livro();
        meuLivro.tipoCapa = "Dura";
        meuLivro.valor = 10.40;
        meuLivro.paginas = 60;
        meuLivro.titulo = "Diario de um Banana";

    }

}
