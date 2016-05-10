package br.unifor.mimpreste.model;

public class Livro implements IModel{

    private Integer id;
    private String nome;
    private String autor;
    private int ano;
    private String imagem;

    public Livro() {
    }

    public Livro(String nome, String autor, int ano, String imagem) {
        this(null, nome, autor, ano, imagem);
    }

    public Livro(Integer id, String nome, String autor, int ano, String imagem) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.imagem = imagem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}
