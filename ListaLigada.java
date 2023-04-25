public class ListaLigada {
    Celula primeira;
    Celula ultima;
    int totalDeElementos;

    void AdicionaNoComeco(Object elemento){
        Celula nova = new Celula(this.primeira, elemento);
        this.primeira = nova;
        if(this.totalDeElementos == 0){
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;
    }

    void adiciona(Object elemento){
        if(this.totalDeElementos == 0){
            this.AdicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    boolean posicaoOcupada(int posicao){
        return((posicao>=0) && (posicao < this.totalDeElementos));
    }

    Celula pegaCelula(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao nao Existe");
        }else{
            Celula atual = this.primeira;
            for(int i=0; i < posicao; i++){
                atual = atual.getProxima();
                }
            return atual;
        }
    }

    void adiciona(int pos, Object elemento){
        if(pos == 0){
            this.AdicionaNoComeco(elemento);
        }else if(pos == this.totalDeElementos){
            this.adiciona(elemento);
        }else {
            Celula anterior = this.pegaCelula(pos-1);
            Celula Nova = new Celula(anterior.getProxima(),elemento);
            anterior.setProxima(Nova);
            this.totalDeElementos++;
        }
    }

    Object pega(int posicao){
        return(this.pegaCelula(posicao).getElemento());
    }

    void removeDoComeco(){
        if(!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posição não Existe");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalDeElementos--;
            if(this.totalDeElementos == 0){
                this.ultima = null;
            }
        } 
    }

    boolean Contem(Object elemento){
        Celula atual = this.primeira;
        while(atual!=null){
            if(atual.getElemento().equals(elemento)){
                return(true);
            }
            atual = atual.getProxima();
        }
        return(false); 
    }

    int Tamanho(){
        return(this.totalDeElementos);
    }    

    void excluirElemento(int indice){
            if(!posicaoOcupada(indice)){
                throw new IllegalArgumentException("Posicao nao Existe");
            }else{
                Celula atual = this.primeira;
                for(int i = 0; i < this.Tamanho(); i++){
                    if(indice == Celula.getElemento){

                    }
                }
                
    }
    }
}
