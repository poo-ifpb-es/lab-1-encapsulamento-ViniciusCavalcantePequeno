class RelogioDigital {

    private int hora;
    private int minuto;

    public RelogioDigital(){
        this.hora = 12;
        this.minuto = 20;
    }
    public int getHora(){
        return this.hora;
    }
    public void setHora(int hora){
        this.hora = hora;
    }

    public int getMinuto(){
        return this.minuto;
        
    }
    public void setMinuto(int minuto){
        this.minuto = minuto;
    }

    public void tick(){
        if (this.minuto == 60){
            if (this.hora == 24){
                this.hora = 0;
                this.minuto = 0;}
            else{
                this.hora = hora + 1;
                this.minuto = 0;
            }
        else{
            this.minuto = this.minuto + 1;
        }
    }
}