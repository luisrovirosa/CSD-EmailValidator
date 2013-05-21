public class MailVerifier {

	public boolean isValidEmailAddress(String email) {
		return tieneSoloUnaArroba(email) && noTieneComasOEspacios(email)
				&& tienePuntoDespuesArroba(email);
	}

	private boolean tienePuntoDespuesArroba(String email) {
		return -1 != email.indexOf(".", email.indexOf("@"));
	}

	private boolean noTieneComasOEspacios(String email) {
		return !email.contains(" ") && !email.contains(",");
	}

	private boolean tieneSoloUnaArroba(String email) {
		return email.contains("@")
				&& email.indexOf("@") == email.lastIndexOf("@");
	}

}
