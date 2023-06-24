class Pessoa {

    private String nome;
    private double peso, altura;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getIdade() {
        return this.idade;
    }

    public void engordar(double peso) {
        this.peso = this.peso + peso;
    }

    public void emagrecer(double peso) {
        this.peso = this.peso - peso;
    }

    public void crescer(double altura) {
        this.altura = this.altura + altura;
    }

    public void envelhecer(int idade) {

        do {
            if (this.idade >= 21) {
                this.idade++;
            } else {

                crescer(0.5);
                this.idade++;

            }
            idade--;
        } while (idade > 0);

    }

}