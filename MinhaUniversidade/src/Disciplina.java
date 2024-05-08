public class Disciplina {
    private Integer codigo;
    private String nome;
    private Integer semestre;

    public Disciplina(Integer codigo, String nome, Integer semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getSemestre() {
        return semestre;
    }
}
