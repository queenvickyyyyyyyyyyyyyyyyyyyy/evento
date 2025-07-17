import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaEventos{
    public Map<String, Evento> eventos = new HashMap<>();

    public void adicionarEvento(Evento evento){
        if(evento != null){
            eventos.put(evento.getNome(), evento);
        }
    }

    public Evento buscarEvento(String nome){
        return eventos.get(nome);
    }

    public List<Evento> listarEventos(){
        return new ArrayList<>(eventos.values());
    }
    
}
