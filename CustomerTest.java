import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void test() {

        Customer fregues = new Customer("Vaginildo");
        
	
	Movie a = new Movie("A volta dos que não foram", 0);
        Rental rental_a = new Rental(a, 1);
        fregues.addRental(rental_a);
	
	Movie b = new Movie("O penteado do rei careca", 1);
        Rental rental_b  = new Rental(b, 2);
        fregues.addRental(rental_b);

	Movie c = new Movie("Nunca morri na minha vida", 2);
        Rental rental_c  = new Rental(c, 3);
        fregues.addRental(rental_c);

        String cor = "Rental Record for Vaginildo\n";
        cor += "\tA volta dos que não foram\t2.0\n";
        cor += "\tO penteado do rei Careca\t6.5\n";
        cor += "\tNunca morri na minha vida\t2.0\n";
        cor += "Amount owed is 9.5\n";
        cor  += "You earned 4 frequent renter points";
        assertEquals(correct, fregues.statement());
    }

}
