import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        ArrayList<User> clients = new ArrayList<>();

        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("INFO: Сервер запущен");
            while (true) {

                Socket socket = serverSocket.accept(); // Ожидаем клиента

                Thread thread = new Thread(new Runnable() { // Открываем поток для клиента

                    @Override
                    public void run() {
                        try {
                            while (true) {
                                DataInputStream in = new DataInputStream(socket.getInputStream()); // Поток ввода
                                DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // Поток вывода

                                out.writeUTF("Привет, клиент, введи свое Имя: ");
                                String userName = in.readUTF();

                                User user = new User(userName, socket);
                                System.out.println("Клиент " + userName + " подключился");
                                clients.add(user); //Добавляем клиента в список
                                user.sendMessage(clients,"Клиент "+userName+" подключился","СЕРВЕР");

                                while (true){
                                    String request = in.readUTF(); // Получаем сообщение от клиента
                                    System.out.println(request); // Печатаем сообщение от клиента на экране
                                    user.sendMessage(clients,request,userName); // Рассылаем всем это сообщение
                                }

                            }
                        }  catch (SocketException exception) {
                            System.out.println("Пользователь отключился");

                        }catch (IOException exception) {
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
