import java.util.ArrayList;
import java.util.List;

public class MailList {

	public List<String> getMails(String emails) {
		ArrayList<String> lista = new ArrayList<String>();
		if (emails.length() > 0) {
			MailVerifier verifier = new MailVerifier();
			String[] listaemails = emails.split(",");
			for (String email : listaemails) {
				String cleanedEmail = email.trim();
				if (verifier.isValidEmailAddress(cleanedEmail)) {
					lista.add(cleanedEmail);
				}
			}

		}
		return lista;

	}

}
