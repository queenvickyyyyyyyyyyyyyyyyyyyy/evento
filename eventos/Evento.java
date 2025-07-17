import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Evento {
    private String nome;
    private Set<Participante>participantes;
    private LocalDate data;
    private int capacidadeMaxima;


    public Evento(String nome, LocalDate data, int capacidadeMaxima){
        this.nome = nome;
        this.data = data;
        this.capacidadeMaxima = capacidadeMaxima;
        this.participantes = new HashSet<>();
    }

    public String getNome(){
        return nome;
    }

    public LocalDate getData(){
        return data;
    }

    public int getCapacidadeMaxima(){
        return capacidadeMaxima;
    }

    public Set<Participante> getParticipantes(){
        return participantes;
    }

    public boolean adicionarParticipante(Participante p){
        if (participantes.size() < capacidadeMaxima){
            return participantes.add(p);
        }
        return false;
    }

    public List<Participante> listarParticipantesPorNome(){
        return participantes.stream()
                .sorted(Comparator.comparing(Participante::getNome))
                .collect(Collectors.toList());
    }

    public Set<Participante> buscarParticipantesPorInicial(char letra){
        return participantes.stream()
                .filter(p -> p.getNome().toUpperCase().charAt(0) == Character.toUpperCase(letra))
                .collect(Collectors.toSet());
    }

}
