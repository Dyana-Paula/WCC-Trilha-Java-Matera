import org.junit.Assert;
import org.junit.Test;

public class TesteCalculadora{
	
	Calculadora calculadora = new Calculadora();

	@Test
	public void testeSoma(){
		calculadora.setNumeros(5,5);
		Assert.assertEquals(10,calculadora.getSoma(),0);
	}
	
}
