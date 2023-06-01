package Ex_2;

import java.util.Random;

public class UserSessionManager {

    private static UserSessionManager instance;

    private Random token;
    private long lastTime;

    private UserSessionManager() {
        this.token = new Random();
        this.lastTime = System.currentTimeMillis();
    }

    public static synchronized UserSessionManager getInstance(){
        if(instance==null){
           return instance = new UserSessionManager();
        }
        return instance;
    }

    public void updateLastAccessTime() {
        this.lastTime = System.currentTimeMillis();
    }

    public Random getSessionToken() {
        return token;
    }

    public long getLastAccessTime() {
        return lastTime;
    }
}
