package br.com.testecrud.model;

//onde esta localizado os atributos e os metodos sets e gets deles
public class Discente {
    private Long matricula;
    private String nome;
    private String email;
    private String curso;

    public Discente(Long matricula, String nome, String email, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
    }
    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}
