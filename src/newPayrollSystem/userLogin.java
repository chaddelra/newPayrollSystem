package newPayrollSystem;

import payrollsystemMPH.UserRole;

public class userLogin {
	private int loginID;
    private UserRole role;
    private String loginEmail;
    private String loginPassword;

    // Constructor
    public UserLogin(int loginID, UserRole role, String loginEmail, String loginPassword) {
        this.loginID = loginID;
        this.role = role;
        this.loginEmail = loginEmail;
        this.loginPassword = loginPassword;
    }

    // Additional methods
    public void registerUser() {
        // Implementation for registering a user
    }

    public boolean authenticateUser() {
        // Implementation for authenticating a user
        return false;
    }

    public void resetPassword(String email) {
        // Implementation for resetting password
    }

    public void changePassword(String oldPassword, String newPassword) {
        // Implementation for changing password
    }

    public UserRole getUserRole() {
        return this.role;
    }

    public int loginAttempts() {
        // Implementation for counting login attempts
        return 0;
    }
}