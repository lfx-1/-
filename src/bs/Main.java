package bs;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/add", new AddHandler());
        server.createContext("/edit", new EditHandler());
        server.createContext("/delete", new DeleteHandler());
        server.createContext("/view", new ViewHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server is running on port 8000");
    }

    static class Contact {
        String name;
        String address;
        String phoneNumber;

        Contact(String name, String address, String phoneNumber) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }
    }
}