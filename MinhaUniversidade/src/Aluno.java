public class Aluno extends Pessoa{

    private Integer matricula;

    public Aluno(String nome, String cpf, Integer idade, Integer matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public void pagarMensalidade(){
        System.out.printf("Aluno pagando mensalidade...");
    }
}
