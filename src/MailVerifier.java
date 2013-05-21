public class MailVerifier {

	public boolean isValidEmailAddress(String email) {
		return email.contains("@")
				&& email.indexOf("@") == email.lastIndexOf("@");
	}

}
