public class main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        for(int i = 0; i < 20; i++){
            Pessoa p = new Pessoa(i);
            lista.adiciona(i, p);
        }

        while(true){
            if(lista.Tamanho() > 1){
                for(int i = 1; i <= lista.Tamanho(); i++){
                    System.out.println(lista.Tamanho());
                    lista.excluirElemento(i++);
                    i = i + 2;
                    if(i >= lista.totalDeElementos){
                        i = lista.Tamanho() + 1;
                    }
                }
            }else{
                System.out.println("o sobrevivente é a pessoa de indice: " + lista.pega(1));
            }
        }
    }
}
