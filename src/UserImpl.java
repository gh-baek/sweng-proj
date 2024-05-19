public class UserImpl extends User {

    private UserImpl() {
        // Initialize user-specific details
        this.calendar = Calendar.getInstance();
        this.noteKing = NoteKing.getInstance(this);
    }

    @Override
    public void logout() {
        // Implementation of logout
    }

    @Override
    public void updateProfile() {
        // Implementation of updateProfile
    }

    @Override
    public static User getInstance() {
        if (instance == null) {
            instance = new UserImpl();
        }
        return instance;
    }
}