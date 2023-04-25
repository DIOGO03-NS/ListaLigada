public class Celula {
    Celula proxima;
    Object elemento;


    public Celula(Celula proxima, Object elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    public Celula(Object elemento) {
        this.elemento = elemento;
    }


    public Celula getProxima() {
        return this.proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Object getElemento() {
        return this.elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}
