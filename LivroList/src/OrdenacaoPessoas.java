import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoPessoas {
private List<Pessoa> pessoaList;

public OrdenacaoPessoas(){
  this.pessoaList = new ArrayList<Pessoa>(); }

public void adicionarPessoa(String nome, int idade, double altura){
  pessoaList.add(new Pessoa(nome, idade, altura));
}

public List<Pessoa> ordenarPorIdade() {
  List<Pessoa> pessoaPorIdade = new ArrayList<Pessoa>(pessoaList);
  Collections.sort(pessoaPorIdade);
  return pessoaPorIdade;
}

public List<Pessoa> ordenarPorAltura() {
  List<Pessoa> pessoaPorAltura = new ArrayList<Pessoa>(pessoaList);
  Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
  return pessoaPorAltura;
}  
}