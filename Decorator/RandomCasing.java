import java.util.Random;

public class RandomCasing extends PasswordDecorator {

    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
    }

    public String getPassword() {
        String newPass = "";
        String temp = "";
        Random r = new Random();

        for (int i = 0; i < this.password.length(); i++) {
            int namNum = r.nextInt(2);
            if (namNum == 1) {
                temp = "";
                temp += this.password.charAt(i);
                newPass += temp.toUpperCase();
            } else {
                temp = "";
                temp += this.password.charAt(i);
                newPass += temp.toLowerCase();
            }
        }
        this.password = newPass;
        return this.password;
    }

}