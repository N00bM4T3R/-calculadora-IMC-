public class dados {
    public Double peso;
    public Double altura;
    

    public dados(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }


    public Double Cal(Double peso, Double altura) {
       return peso / (altura * altura);
    }

    
    
    

}
