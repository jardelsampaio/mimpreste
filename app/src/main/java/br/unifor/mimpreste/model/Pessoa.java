package br.unifor.mimpreste.model;

public class Pessoa {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String foto;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String email, String foto) {
        this(null, nome, telefone, email, foto);
    }

    public Pessoa(Long id, String nome, String telefone, String email, String foto) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
