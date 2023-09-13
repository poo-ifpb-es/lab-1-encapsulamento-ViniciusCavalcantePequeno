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
        if (minuto == 60){
            if (hora == 24){
                hora = 0;
                minuto = 0;}
            else{
                hora = hora + 1;
                minuto = 0;
            }}
        else{
            minuto = minuto + 1;
        }
    }
}