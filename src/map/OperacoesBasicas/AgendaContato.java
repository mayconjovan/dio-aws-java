package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }


    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }


    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Maycon", 123456);
        agendaContato.adicionarContato("Maycon", 5665);
        agendaContato.adicionarContato("Maycon J", 1111111);
        agendaContato.adicionarContato("Maycon JP", 654987);
        agendaContato.adicionarContato("Maria Silva", 1111111);
        agendaContato.adicionarContato("Maycon", 44444);


        agendaContato.exibirContatos();

        agendaContato.removerContato("Maria Silva");

        agendaContato.exibirContatos();



    }

}
