public class Symbols extends PasswordDecorator {

    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
    }

    public String getPassword() {
        String newPass = "";
        for (int i = 0; i < this.password.length(); i++) {
            if (this.password.charAt(i) == 'a') {
                newPass += "@";
            } else if (this.password.charAt(i) == 'b') {
                newPass += "8";
            } else if (this.password.charAt(i) == 'e') {
                newPass += "3";
            } else if (this.password.charAt(i) == 'g') {
                newPass += "9";
            } else if (this.password.charAt(i) == 'i') {
                newPass += "!";
            } else if (this.password.charAt(i) == 'o') {
                newPass += "0";
            } else if (this.password.charAt(i) == 's') {
                newPass += "$";
            } else if (this.password.charAt(i) == 't') {
                newPass += "7";
            } else
                newPass += this.password.charAt(i);
        }

        this.password = newPass;
        return this.password;
    }
}
