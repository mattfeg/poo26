//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina(1,"POO",1);
        Disciplina disciplina2 = new Disciplina(3,"Mat",1);
        Disciplina disciplina3 = new Disciplina(2,"ED",2);

        Regular aluno1 = new Regular("Joao","123.456.789-10",18,1234567);
        Regular aluno2 = new Regular("Maria","222.333.444-55",20,3434567);
        Bolsista aluno3 = new Bolsista("Jose","987.654.321-01",21,9876541);

        Professor professor1 = new Professor("Luis","123.789.654-88",35,"CCT");

        Visitante visitante1 = new Visitante("Carlos","753.159.753-46",22);
        Visitante visitante2 = new Visitante("Roberto","197.348.625-55",25);

        Turma turma1 = new Turma(111,disciplina1,professor1);
        Turma turma2 = new Turma(222,disciplina2,professor1);
        Turma turma3 = new Turma(333,disciplina3,professor1);

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        turma3.adicionarAluno(aluno1);
        turma3.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno3);

        System.out.println("----------- Turma 1 -----------");
        System.out.println("Codigo: " + turma1.getCodigo());
        System.out.println("Professor: " + turma1.getProfessor().getNome());
        System.out.println("Disciplina: " + turma1.getDisciplina().getNome());
        turma1.listarAlunos();

        System.out.println("----------- Turma 2 -----------");
        System.out.println("Codigo: " + turma2.getCodigo());
        System.out.println("Professor: " + turma2.getProfessor().getNome());
        System.out.println("Disciplina: " + turma2.getDisciplina().getNome());
        turma2.listarAlunos();

        System.out.println("----------- Turma 3 -----------");
        System.out.println("Codigo: " + turma3.getCodigo());
        System.out.println("Professor: " + turma3.getProfessor().getNome());
        System.out.println("Disciplina: " + turma3.getDisciplina().getNome());
        turma3.listarAlunos();
    }
}