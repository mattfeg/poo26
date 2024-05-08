public class Regular extends Aluno{

    public Regular(String nome, String cpf, Integer idade, Integer matricula) {
        super(nome, cpf, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.printf("Regular pagando mensalidade...");
    }
}
