public class Bolsista extends Aluno{

    public Bolsista(String nome, String cpf, Integer idade, Integer matricula) {
        super(nome, cpf, idade, matricula);  // Chama o construtor de Aluno
    }

    @Override
    public void pagarMensalidade() {
        System.out.printf("Bolsista pagando mensalidade...");
    }
}
