import java.util.ArrayList;

public class Turma {
    private Integer codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(Integer codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(int index) {
        if (index >= 0 && index < alunos.size()) {
            alunos.remove(index);
        }
    }

    public void listarAlunos() {
        System.out.print("Alunos matriculados: ");
        int contador = 0;
        for (Aluno aluno : alunos) {
            if (contador > 0) {
                System.out.print(", ");
            }
            System.out.print(aluno.getNome());
            contador++;
        }
        System.out.println(".");
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}