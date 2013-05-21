import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MailListTest {

	@Test
	public void recibeListaVaciaDevuelveListaVacia() {
		MailList list = new MailList();
		assertEquals(0, list.getMails("").size());
	}

	@Test
	public void recibeEmailDevuelveListaConElEmail() {
		MailList list = new MailList();
		assertEquals(1, list.getMails("mi@email.com").size());
		assertTrue(list.getMails("mi@email.com").contains("mi@email.com"));
	}

}
