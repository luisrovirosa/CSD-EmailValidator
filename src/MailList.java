import java.util.ArrayList;
import java.util.List;

public class MailList {

	public List<String> getMails(String email) {
		ArrayList<String> lista = new ArrayList<String>();
		if (email.length() > 0) {
			MailVerifier verifier = new MailVerifier();
			if (verifier.isValidEmailAddress(email)) {
				lista.add(email);
			}

		}
		return lista;

	}

}
