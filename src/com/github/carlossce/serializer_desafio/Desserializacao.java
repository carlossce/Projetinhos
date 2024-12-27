package com.github.carlossce.serializer_desafio;

import com.github.carlossce.serializer_desafio.crm.Cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.READ;

public class Desserializacao {

    public static void main(String[] args) {
        // TODO implementar desserialização

        Path path = Path.of("C:\\Users\\Castro\\IdeaProjects\\Projetinhos\\objetos\\cliente.txt");

        try(ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Cliente cliente = (Cliente) inputStream.readObject();
            System.out.println(cliente);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}