import java.util.ArrayList;
import java.util.List;

public class MailList {

	public List<String> getMails(String emails) {
		ArrayList<String> lista = new ArrayList<String>();
		if (emails.length() > 0) {
			MailVerifier verifier = new MailVerifier();
			String[] listaemails = splitEmails(emails);
			for (String email : listaemails) {
				if (verifier.isValidEmailAddress(email)) {
					lista.add(email);
				}
			}

		}
		return lista;

	}

	private String[] splitEmails(String emails) {
		String[] listaemails = emails.split(",");
		String[] cleanedEmails = new String[listaemails.length];
		for (int i = 0; i < listaemails.length; i++) {
			cleanedEmails[i] = listaemails[i].trim();
		}
		return cleanedEmails;
	}

}
