public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    public abstract String getPassword();
}
