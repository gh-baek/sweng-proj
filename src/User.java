//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class User {
    String userId;
    String password;
    NoteManager[] notes;
    Calendar calendar;
    NoteKing noteKing;

    void login() {}
    void logout() {}
    void updateProfile() {}
}