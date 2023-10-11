import java.lang.Math;

public class Geometrica implements IClassMedia{
    public double CalculaMedia(double num1, double num2){
        return Math.sqrt(num1*num2);
    }
    
    public String Situacao(double media){
        if (media > 7){
            return "Aprovado.";
        }
        return "Reprovado.";
    }
}