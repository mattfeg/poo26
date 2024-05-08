public class Professor extends Pessoa{

    private String centro;

    public Professor(String nome, String cpf, Integer idade, String centro) {
        super(nome, cpf, idade);
        this.centro = centro;
    }

    public void darAula(){
        System.out.printf("Dando Aula...");
    }
}
