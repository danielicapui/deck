package deck.carta;
import javax.swing.*;
public enum Carta {
    
    DOIS("2", 2), TRES("3", 3), QUATRO("4", 4), CINCO("5", 5), SEIS("6", 6), 
    SETE("7", 7), OITO("8", 8), NOVE("9", 9), DEZ("10", 10), J ("Valete", 11),
    Q ("Dama", 12), K ("Rei", 13), A("Az", 14);
        
    private final String nome;
    private final int pontos;
    private final ImageIcon imagem;
    private Carta(String nome, int pontos) 
    {
        this.nome = nome;
        this.pontos = pontos;
        //this.imagem=new ImageIcon(nome.concat(".png);
    }

    public String getNome() {
        return this.nome;
    }

    public int getPontos() {
        return this.pontos;
    }
    public Image getImagem()
    {
        return this.imagem;   
    }
    public void setImagem(String nome)
    {
        this.imagem=new ImageIcon(nome.concat(".png"));   
    }
    
}
