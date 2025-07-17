import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        SistemaEventos sistema = new SistemaEventos();

        Evento evento1 = new Evento("Aula de POO", LocalDate.of(2025, 07, 20), 10);
        Evento evento2 = new Evento("Aula Segurança", LocalDate.of(2025, 07, 20), 10);
        Evento evento3 = new Evento("Aula de Banco de Dados", LocalDate.of(2025, 07, 20), 10);

        sistema.adicionarEvento(evento1);
        sistema.adicionarEvento(evento2);
        sistema.adicionarEvento(evento3);

        Participante participante1 = new Participante("Maria", "maria@gamil.com", "123456789");
        Participante participante2 = new Participante("João", "joao@gmail.com", "987654321");
        Participante participante3 = new Participante("Amanda", "amanda@gmail.com", "456123789");
        Participante participante4 = new Participante("Pedro", "pedre@gmail.com", "789456123");
        Participante participante5 = new Participante("Sara", "sara@gmail.com", "852963741");

        evento1.adicionarParticipante(participante1);
        evento1.adicionarParticipante(participante2);
        evento1.adicionarParticipante(participante3);
        evento1.adicionarParticipante(participante4);
        evento1.adicionarParticipante(participante5);

        evento2.adicionarParticipante(participante1);
        evento2.adicionarParticipante(participante2);
        evento2.adicionarParticipante(participante3);
        evento2.adicionarParticipante(participante4);
        evento2.adicionarParticipante(participante5);

        evento3.adicionarParticipante(participante1);
        evento3.adicionarParticipante(participante2);
        evento3.adicionarParticipante(participante3);
        evento3.adicionarParticipante(participante4);
        evento3.adicionarParticipante(participante5);

        System.out.println("Lista dos eventos: ");
        sistema.listarEventos().forEach(System.out::println);
        System.out.println();

        System.out.println("Buscar evento: ");
        System.out.println(sistema.buscarEvento("Aula de POO"));
        System.out.println();

        System.out.println("Lista de participantes por nome (Aula de POO): ");
        evento1.listarParticipantesPorNome().forEach(System.out::println);

    }
}
