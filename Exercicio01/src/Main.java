public class Main {

    public static void main(String[] args) {

        Banda banda = new Banda();

        Membro chester = new Membro("Chester Bennington", "Vocalista");
        Membro emily = new Membro("Emily Armstrong", "Vocalista");
        Membro shinoda = new Membro("Mike Shinoda", "Vocalista, Tecladista");
        Membro brad = new Membro("Brad Delson", "Guitarrista");
        Membro phoenix = new Membro("Dave Farrell", "Baixista");

        Musica somewhere = new Musica("Somewhere I Belong", 3.37);
        Musica faint = new Musica("Faint", 2.42);
        Musica intheend = new Musica("In The End", 3.36);
        Musica emptinessmachine = new Musica("The Emptiness Machine", 3.10);

        Empresario empresario = new Empresario("Linkin Park Management", 12345678912345L);

        banda.Banda("Linkin Park", "Rock");

        banda.addMembroNovo(chester);
        banda.addMembroNovo(emily);
        banda.addMembroNovo(shinoda);
        banda.addMembroNovo(brad);
        banda.addMembroNovo(phoenix);

        banda.addMusicaNova(faint);
        banda.addMusicaNova(intheend);
        banda.addMusicaNova(emptinessmachine);
        banda.addMusicaNova(somewhere);

        banda.mostraInfo();

    }

}
