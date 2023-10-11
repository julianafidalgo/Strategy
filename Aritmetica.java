public class Aritmetica implements IClassMedia{
    public double CalculaMedia(double num1, double num2){
        return (num1+num2)/2;
    }

    public String Situacao(double media){
        if (media > 5){
            return "Aprovado";
        }
        return "Reprovado.";
    }
}