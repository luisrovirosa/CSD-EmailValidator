public class MailVerifier {

	public boolean isValidEmailAddress(String email) {
		return tieneSoloUnaArroba(email) && noTieneComasOEspacios(email);
	}

	private boolean noTieneComasOEspacios(String email) {
		return !email.contains(" ") && !email.contains(",");
	}

	private boolean tieneSoloUnaArroba(String email) {
		return email.contains("@")
				&& email.indexOf("@") == email.lastIndexOf("@");
	}

}
