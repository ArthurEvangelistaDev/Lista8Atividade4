public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Arthur Siqueira Evangelista");
        pessoa.setIdade(20);
        pessoa.setPeso(60.5);
        pessoa.setAltura(180);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura() + "\n\n");

        pessoa.engordar(10);
        System.out.println("Peso: " + pessoa.getPeso() + "\n\n");

        pessoa.emagrecer(5.5);
        System.out.println("Peso: " + pessoa.getPeso() + "\n\n");

        pessoa.crescer(20);
        System.out.println("Altura: " + pessoa.getAltura() + "\n\n");

        pessoa.envelhecer(2);
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura() + "\n\n");

    }
}
