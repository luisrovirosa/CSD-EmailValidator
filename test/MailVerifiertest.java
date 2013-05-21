import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MailVerifiertest {
	MailVerifier verifier = new MailVerifier();

	@Test
	public void solaUnaArroba() {
		assertTrue(verifier.isValidEmailAddress("correo@correo.es"));
		assertFalse(verifier.isValidEmailAddress("correocorreo.es"));
		assertFalse(verifier.isValidEmailAddress("correo@correo@es"));
	}

	@Test
	public void noTieneEspaciosNiComas() {
		assertFalse(verifier.isValidEmailAddress("correo@coreo es"));
		assertFalse(verifier.isValidEmailAddress("correo@coreo,es"));
		assertFalse(verifier.isValidEmailAddress("co rr,eo@coreo,es"));
	}

	@Test
	public void tienePuntoDespuesArroba() {
		assertTrue(verifier.isValidEmailAddress("correo@coreo.es"));
		assertFalse(verifier.isValidEmailAddress("correo@coreoes"));
		assertFalse(verifier.isValidEmailAddress("cor.reo@coreoes"));
		assertTrue(verifier.isValidEmailAddress("cor.reo@coreo.es"));
	}

}
