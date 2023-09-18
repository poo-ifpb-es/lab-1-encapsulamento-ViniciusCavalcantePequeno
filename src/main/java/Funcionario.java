class Funcionario {

    private String nome;
    private String sobrenome;
    private float salario;

    public Funcionario(String nome, String sobrenome, float salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalarioAnual(){
        salario = salario * 12;
        return salario;
    }

    public void concederAumento(float valor){
        salario = ((valor / 100) * salario) + salario;
        
    }
}