package prac_15;

import java.io.*;
import java.net.*;
import java.util.Random;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class httpServer {

    private static final int PORT = 33; // Порт сервера
    private static final String HTML_FILE = "D:\\Projects\\Java\\BolotovMA_Java\\src\\prac_15\\index.html"; // Путь к HTML-файлу

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Сервер запущен на порту " + PORT);

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), StandardCharsets.UTF_8));
        OutputStream out = clientSocket.getOutputStream();

        String requestLine = in.readLine();
        if (requestLine == null) return;

        String[] requestParts = requestLine.split(" ");
        String path = requestParts[1];

        if (path.equals("/") || path.startsWith("/random")) {
            handleRandomNumber(path, out);
        } else {
            sendHttpResponse(out, 404, "<h1>404 Not Found</h1>");
        }
        out.flush();
    }

    private static void handleRandomNumber(String path, OutputStream out) throws IOException {
        int min = 0, max = 0, randomNumber = 0;
        boolean hasParams = path.contains("?");

        if (hasParams) {
            try {
                String query = path.split("\\?")[1];
                for (String param : query.split("&")) {
                    String[] keyValue = param.split("=");
                    if (keyValue[0].equals("min")) min = Integer.parseInt(keyValue[1]);
                    if (keyValue[0].equals("max")) max = Integer.parseInt(keyValue[1]);
                }

                if (min > max) {
                    sendHttpResponse(out, 400, "<h1>400 Bad Request</h1><p>Parameter 'min' must be less than or equal to 'max'.</p>");
                    return;
                }

                randomNumber = new Random().nextInt((max - min) + 1) + min;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                sendHttpResponse(out, 400, "<h1>400 Bad Request</h1><p>Invalid query parameters.</p>");
                return;
            }
        }

        String htmlContent = new String(Files.readAllBytes(Paths.get(HTML_FILE)), StandardCharsets.UTF_8);
        htmlContent = htmlContent.replace("%RANDOM_NUMBER%", hasParams ? "Случайное число: " + randomNumber : "");

        sendHttpResponse(out, 200, htmlContent);
    }


    private static void sendHttpResponse(OutputStream out, int statusCode, String body) throws IOException {
        String statusMessage = statusCode == 200 ? "OK" : "Bad Request";
        String response = "HTTP/1.1 " + statusCode + " " + statusMessage + "\r\n"
                + "Content-Type: text/html; charset=UTF-8\r\n"
                + "Content-Length: " + body.getBytes(StandardCharsets.UTF_8).length + "\r\n"
                + "\r\n"
                + body;

        out.write(response.getBytes(StandardCharsets.UTF_8));
    }
}
