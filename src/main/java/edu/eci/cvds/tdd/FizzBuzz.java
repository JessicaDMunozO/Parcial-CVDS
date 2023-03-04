package edu.eci.cvds.tdd;

public class FizzBuzz {
    public String revisarNumero(int numero) {
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String FizzBuzz = "FizzBuzz";
        String cadenaNumero = String.valueOf(numero);

        if (cadenaNumero.contains("3") && cadenaNumero.contains("5")){
            return FizzBuzz;
        }
    
        if (numero % 3 == 0 && numero % 5 == 0){
            return FizzBuzz;
        }
    
        if (numero % 3 == 0) {
            return Fizz;
        } 
    
        if (cadenaNumero.contains("3")) {
            return Fizz;
        }
    
        if (numero % 5 == 0) {
            return Buzz;
        }
            
        if (cadenaNumero.contains("5")) {
            return Buzz;
        }
    return cadenaNumero;

    }
}
