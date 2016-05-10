package br.unifor.mimpreste.model;

import java.util.Date;

public class Emprestimo implements IModel{

    public enum EmprestimoStatus {
        PENDENTE,
        FINALIZADO;
    }

    private Integer id;
    private Pessoa pessoa;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private EmprestimoStatus status;

    public Emprestimo() {
    }

    public Emprestimo(Pessoa pessoa, Livro livro, Date dataEmprestimo, Date dataDevolucao, EmprestimoStatus status) {
        this(null, pessoa, livro, dataEmprestimo, dataDevolucao, status);
    }

    public Emprestimo(Integer id, Pessoa pessoa, Livro livro, Date dataEmprestimo, Date dataDevolucao, EmprestimoStatus status) {
        this.id = id;
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public EmprestimoStatus getStatus() {
        return status;
    }

    public void setStatus(EmprestimoStatus status) {
        this.status = status;
    }
}
