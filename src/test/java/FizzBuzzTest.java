import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import edu.eci.cvds.tdd.FizzBuzz;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();
    
    @Test
    public void revisarNumero_MultiploTres_Fizz() {
        //Arrange
        int numero = 9;
        //Act
        String imprimir = fizzBuzz.revisarNumero(numero);
        //Assert
        assertEquals("Fizz", imprimir);
    }

    @Test
    public void revisarNumero_ContieneTres_Fizz() {
        //Arrange
        int numero = 13;
        //Act
        String imprimir = fizzBuzz.revisarNumero(numero);
        //Assert
        assertEquals("Fizz", imprimir);
    }

    @Test
    public void revisarNumero_MultiploContieneTres_Fizz() {
        //Arrange
        int numero = 3;
        //Act
        String imprimir = fizzBuzz.revisarNumero(numero);
        //Assert
        assertEquals("Fizz", imprimir);
    }

    @Test
    public void revisarNumero_MultiploCinco_Buzz() {
        //Arrange
        int numero = 10;
        //Act
        String imprimir = fizzBuzz.revisarNumero(numero);
        //Assert
        assertEquals("Buzz", imprimir);
    }

    @Test
    public void revisarNumero_ContieneCinco_Buzz() {
        //Arrange
        int numero = 5;
        //Act
        String imprimir = fizzBuzz.revisarNumero(numero);
        //Assert
        assertEquals("Buzz", imprimir);
    }

    @Test
    public void revisarNumero_MultiploContieneCinco_Buzz() {
        //Arrange
        int numero = 25;
        //Act
        String imprimir = fizzBuzz.revisarNumero(numero);
        //Assert
        assertEquals("Buzz", imprimir);
    }

    @Test
    public void revisarNumero_MultiploTresCinco_FizzBuzz() {
        //Arrange
        int numero = 15;
        //Act
        String imprimir = fizzBuzz.revisarNumero(numero);
        //Assert
        assertEquals("FizzBuzz", imprimir);
    }

    @Test
    public void revisarNumero_ContieneTresCinco_FizzBuzz() {
        //Arrange
        int numero = 53;
        //Act
        String imprimir = fizzBuzz.revisarNumero(numero);
        //Assert
        assertEquals("FizzBuzz", imprimir);
    }

    @Test
    public void revisarNumero_NoCumpleCondiciones_Numero() {
        //Arrange
        int numero = 1;
        //Act
        String imprimir = fizzBuzz.revisarNumero(numero);
        //Assert
        assertEquals("1", imprimir);
    }
}
