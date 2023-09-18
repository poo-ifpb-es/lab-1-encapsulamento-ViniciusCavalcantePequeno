public class CarroAluguel {
    private float valorPorKm;
    private int distanciaPercorrida;
    private boolean disponivel;
    private boolean sinistro;
    private float debito;

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
        this.distanciaPercorrida = 0;
        this.disponivel = true;
        this.sinistro = false;
        this.debito = 0.0f;
    }

    public void setValorPorKm(float valor) {
        this.valorPorKm = valor;
    }

    public float getValorPorKm() {
        return valorPorKm;
    }

    public void setDistanciaPercorrida(int distancia) {

        this.distanciaPercorrida = distancia;
    }

    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false; 
        } else {
            throw new CarroIndisponivelException("O carro está indisponível.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            if (getDebito() == 0.0f) {
                disponivel = true;
                distanciaPercorrida = 0;
                sinistro = false;
            } else {
                throw new CarroNaoPagoException("O carro não foi pago.");
            }
        } else {
            throw new CarroDisponivelException("O carro est\u00E1 dispon\u00EDvel.");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public boolean hasSinistro() {
        return sinistro;
    }

    public void setSinistro(boolean sinistro) {
        this.sinistro = sinistro;
    }

    public float getDebito() {
        float debito = valorPorKm * distanciaPercorrida;
        if (sinistro) {
            debito += 0.6f * debito;
            this.sinistro = false;
        }
        return debito;
    }

    public void pagar() {
        distanciaPercorrida = 0;
        sinistro = false;
        if (disponivel) {
            throw new CarroIndisponivelException("O carro está indisponível.");
        }
    }
}

class CarroDisponivelException extends RuntimeException {
    public CarroDisponivelException(String message) {
        super(message);
    }
}

class CarroNaoPagoException extends RuntimeException {
    public CarroNaoPagoException(String message) {
        super(message);
    }
}

class CarroIndisponivelException extends RuntimeException {
    public CarroIndisponivelException(String message) {
        super(message);
    }
}
