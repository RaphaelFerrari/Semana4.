public class Produto {
    public static void main(String[] args) {
        private String nome;
        private String descricao;
        private float precoUnitario;
        private int quantidade;

    public Produto(String nome, String descricao, float precoUnitario, int quantidade){
            this.nome = nome;
            this.descricao = descricao;
            this.precoUnitario = precoUnitario;
            this.quantidade = quantidade;
        }
        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public String getDescricao () {
            return descricao;
        }

        public void setDescricao (String descricao){
            this.descricao = descricao;
        }

        public float getPrecoUnitario () {
            return precoUnitario;
        }

        public void setPrecoUnitario ( float precoUnitario){
            this.precoUnitario = precoUnitario;
        }

        public int getQuantidade () {
            return quantidade;
        }

        public void setQuantidade ( int quantidade){
            this.quantidade = quantidade;
        }
        System.out.println(">> Dados do produto" );
        System.out.println(":: Nome: " + setNome);
        System.out.println(":: Descrição: " + setDescricao);
    }
}






