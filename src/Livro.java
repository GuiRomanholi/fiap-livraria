// classe modelo
public class Livro {
    // + (public) TipoDado nomeAtributoOuvariavel
    public String titulo;
    public String autor;
    public double valor;
    public Editora editora;
    public int paginas;
    public String resumo;
    public String tipoCapa;

    //--- MÉTODOS ---
    public String exibirDados(){
        String dados = "" +
                "-------------" +
                "\nTituo: " + this.titulo +
                "\nResumo: " + this.resumo +
                "\nPerço: R$" + this.valor +
                "\nPáginas: " + this.paginas +
                "\nAutor: " + this.autor +
                "\nEditora " + this.editora.nome +
                "\n-----------------";
        return dados;

    }
    //atributo é uma carcteristica do objeto
    public Livro(String titulo) {
        this.titulo = titulo;
    }
    public  Livro(String titulo, double preco){
        this.titulo = titulo;
        this.valor = preco;
    }
    public Livro(String titulo,  double valor,
                 String editora,
                 int paginas, String resumo,
                 String tipoCapa){
        this.titulo = titulo;
        this.valor = valor;
        //this.editora = editora;
        this.resumo = resumo;
        this.tipoCapa = tipoCapa;
    }

}
