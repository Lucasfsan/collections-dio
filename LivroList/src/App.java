public class App {
    public static void main(String[] args) throws Exception {
        OrdenacaoPessoas ordenarPessoas = new OrdenacaoPessoas();

        ordenarPessoas.adicionarPessoa("João", 25, 1.75);
        ordenarPessoas.adicionarPessoa("Maria", 30, 1.65);
        ordenarPessoas.adicionarPessoa("Pedro", 35, 1.80);
        ordenarPessoas.adicionarPessoa("Ana", 28, 1.70);
    
        System.out.println(ordenarPessoas.ordenarPorIdade());
        System.out.println(ordenarPessoas.ordenarPorAltura());
      
    }
}
