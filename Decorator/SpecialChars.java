import java.util.Random;

public class SpecialChars extends PasswordDecorator {

    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
    }

    public String getPassword() {

        String newPass = "";
        Random r = new Random();
        char[] randomChars = { '*', '!', '%', '+', '.', '{', '}' };

        for (int i = 0; i < this.password.length(); i++) {
            int ranNum = r.nextInt(100) + 1;
            if (ranNum <= 30) {
                newPass += this.password.charAt(i);
                int charIndex = r.nextInt(7);
                newPass += randomChars[charIndex];
            } else {
                newPass += this.password.charAt(i);
            }

        }

        this.password = newPass;
        return this.password;
    }

}