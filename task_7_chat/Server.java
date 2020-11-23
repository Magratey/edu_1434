import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ArrayList<User> clients = new ArrayList<>();
        Socket socket = null;
        String userName;
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("INFO: Сервер запущен");
            while (true) {

                socket = serverSocket.accept(); // Ожидаем клиента
                DataInputStream in = new DataInputStream(socket.getInputStream()); // Поток ввода
                DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // Поток вывода
                out.writeUTF("Привет, клиент, введи свое Имя: ");
                userName = in.readUTF();
                User user = new User(userName, socket);

                System.out.println("Клиент " + userName + " подключился");
                clients.add(user); //Добавляем клиента в список
                Thread thread = new Thread(new Runnable() { // Открываем поток для клиента
                    @Override
                    public void run() {
                        try {
                            while (true) {
                                System.out.println("Ожидаем сообщение...");
                                String request = in.readUTF();
                                String name = user.getName();
                                System.out.println("Клиент " + name + " прислал сообщение: " + request);
                                for (User user : clients) { // Перебираем список клиентов
                                    DataOutputStream out = new DataOutputStream(user.getSocket().getOutputStream());
                                    out.writeUTF(name + " отправил сообщение: " + request);
                                }
                            }
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
