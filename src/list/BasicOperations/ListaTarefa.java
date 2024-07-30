package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {


    private List<Tarefa> listTarefa;


    public ListaTarefa() {
        this.listTarefa = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao){
        listTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listTarefa) {
            if(t.getDescription().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        listTarefa.removeAll(tarefasParaRemover);
    }


    public int obterNumeroTotalTarefas() {
        return listTarefa.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listTarefa);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
