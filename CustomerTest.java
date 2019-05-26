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

        String cor = "Rental Record for Vaginildo\n\tA volta dos que não foram\t2.0\n\tO penteado do rei Careca\t6.5\n\tNunca morri na minha vida\t2.0\nAmount owed is 9.5\nYou earned 4 frequent renter points";
        assertEquals(cor, fregues.statement());
    }

}
