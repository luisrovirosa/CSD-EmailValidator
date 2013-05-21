import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MailVerifiertest {

	@Test
	public void solaUnaArroba() {
		MailVerifier email = new MailVerifier();
		assertTrue(email.isValidEmailAddress("correo@correo.es"));
		assertFalse(email.isValidEmailAddress("correocorreo.es"));
		assertFalse(email.isValidEmailAddress("correo@correo@es"));
	}

	@Test
	public void noTieneEspaciosNiComas() {
		MailVerifier verifier = new MailVerifier();
		assertFalse(verifier.isValidEmailAddress("correo@coreo es"));
		assertFalse(verifier.isValidEmailAddress("correo@coreo,es"));
		assertFalse(verifier.isValidEmailAddress("co rr,eo@coreo,es"));
	}

}
