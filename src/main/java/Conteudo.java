public abstract class Conteudo {
    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Conteudo(){
        this.titulo = "Titulo não informado";
        this.descricao = "Descrição não informada";
    }

    public abstract double calcularXp();

}
