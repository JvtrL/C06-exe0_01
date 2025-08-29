public class Banda {
    String nome;
    String genero;
    Musica musicas [] = new Musica[10];
    Membro membros [] = new Membro[10];

    void mostraInfo()
    {
        System.out.println("A banda " + this.nome + " de " + this.genero + " tem as seguintes musicas:");
        for(Musica m : musicas)
        {
            if(m != null)
            {
                System.out.println(m.nome);
            }
        }

        System.out.println("Seus membros são:");
        for(Membro m : membros)
        {
            if(m != null)
            {
                System.out.println(m.nome);
            }
        }

    }

    void addMusicaNova(Musica musica)
    {
        for(int i = 0; i < musicas.length; i++)
        {
            if(musicas[i] == null)
            {
                musicas[i] = musica;
                break;
            }
        }
    }

    void addMembroNovo(Membro membro)
    {
        for(int i = 0; i < membros.length; i++)
        {
            if(membros[i] == null)
            {
                membros[i] = membro;
                break;
            }
        }
    }

    void Banda(String nome, String genero)
    {
        this.nome = nome;
        this.genero = genero;
    }

}
