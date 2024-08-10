public class User {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Lucas", 845321457);
        agenda.adicionarContato("Aline", 845324257);
        agenda.adicionarContato("Camila", 845324254);
        agenda.adicionarContato("Bob", 235458855);
        agenda.adicionarContato("Bob", 44745421);

        agenda.exibirContatos();

        agenda.removerContato("Camila");

        agenda.exibirContatos();

    }
}
