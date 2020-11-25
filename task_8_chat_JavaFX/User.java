import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class User {
    private String name;
    private Socket socket;

    public User(String name, Socket socket) {
        this.name = name;
        this.socket = socket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public void sendMessage(ArrayList<User> users, String message, String name){
        for (User user: users) { // Перебираем список пользователей
            DataOutputStream out = null;
            try {
                out = new DataOutputStream(user.getSocket().getOutputStream());
                if(user.getName().equals(this.name)) { // Проверяем текущий пользователь или нет
                    out.writeUTF("Сервер: отправлено"); // Отправляем сообщение
                    continue; // Пропускаем оставшийся код
                }

                out.writeUTF(name+": "+message); // Отправляем сообщение
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
