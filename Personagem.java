public class Personagem {
    boolean vivo = true;
    String nome;
    int vida = 100;
    int poderAtaque = 5;
    int defesa = 2;
    int nivel = 1;
    int exp = 0;

    public void atacar(Personagem alvo){
        System.out.println(this.nome + " atacou " + alvo.nome);

        int dano = this.poderAtaque - alvo.defesa;
        if (dano > 0){
            alvo.vida -= dano;
            this.exp += 10;
            System.out.println(alvo.nome+" ficou com "+alvo.vida);

        if (alvo.vida <=0){
            System.out.println(alvo.nome+" morreu!");
            System.out.println("Parabéns "+this.nome+" você venceu!");
        }

        } else {
            System.out.println("O oponente é forte demais, nenhum dano foi causado!");
        }
    }

    public void treinar(){
        this.exp += 50;
        System.out.println(this.nome + " treinou. ");

        if (this.exp >= 100) {
            this.nivel++;
            this.defesa += 2;
            this.poderAtaque += 5;
            this.recuperar();
            this.exp = this.exp - 100;
            System.out.println(this.nome+ "subiu de nivel, seu nivel atual é " +this.nivel);
        }
    }

    public void recuperar(){
        this.vida +=20;
        System.out.println(this.nome + " se recuperou, sua vida agora é: "+this.vida);
    }

}