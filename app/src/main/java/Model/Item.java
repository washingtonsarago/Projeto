package Model;

/**
 * Created by Sarago on 06/02/16.
 */
public class Item {
    private  int imagem;
    private String nome;
    private String descricao;

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Item(int imagem, String nome, String descricao) {
        this.imagem = imagem;
        this.nome = nome;
        this.descricao = descricao;
    }
}

