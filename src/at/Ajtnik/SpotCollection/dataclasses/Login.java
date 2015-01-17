package at.Ajtnik.SpotCollection.dataclasses;

/**
 * Created by ajtma_000 on 17.01.2015.
 */
public class Login {

    private boolean save;
    private String username;
    private String password;

    public Login(boolean save, String username, String password) {
        this.save = save;
        this.username = username;
        this.password = password;
    }

    public boolean isSave() {
        return save;
    }

    public void setSave(boolean save) {
        this.save = save;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
