import java.util.ArrayList;
import java.util.List;

public class MailList {

	public List<String> getMails(String email) {
		ArrayList<String> lista = new ArrayList<String>();
		if (email.length() > 0)
			lista.add(email);
		return lista;

	}

}
