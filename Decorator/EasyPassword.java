import java.util.Random;

public class EasyPassword extends Password {

    public EasyPassword(String phrase) {
        this.password = phrase;

        String newPass = "";
        for (int i = 0; i < this.password.length(); i++) {
            if (this.password.charAt(i) != ' ') {
                newPass += this.password.charAt(i);
            }
        }
        Random r = new Random();
        int ranNum = r.nextInt(101);
        newPass += ranNum;
        this.password = newPass;
    }

    public String getPassword() {
        return this.password;
    }
}
