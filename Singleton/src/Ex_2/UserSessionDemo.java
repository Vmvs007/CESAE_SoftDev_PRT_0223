package Ex_2;

import java.util.Random;

public class UserSessionDemo {
    public static void main(String[] args) {

        // Instanciar pela primeira vez
        UserSessionManager sessionManager = UserSessionManager.getInstance();

        // Get dos Atributos
        Random sessionToken = sessionManager.getSessionToken();
        System.out.println("Token: "+ sessionToken.nextDouble());

        long lastAccessTime = sessionManager.getLastAccessTime();
        System.out.println("Tempo: "+lastAccessTime);

        // Atualizar o tempo da ultima sessão
        sessionManager.updateLastAccessTime();
    }
}
