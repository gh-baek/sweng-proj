public class User {
    // Singleton instance
    private static User instance;

    // Fields
    private String userId;
    private Calendar calendar;
    private NoteKing noteKing;

    // Private constructor to prevent instantiation
    private User() {
        // Initialize the fields
        this.noteKing = NoteKing.getInstance(this);
        this.calendar = Calendar.getInstance(this.noteKing);

    }

    // Public method to provide access to the singleton instance
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    // Getters and setters for userId and password
    public String getUserId() {
        return userId;
    }

}
