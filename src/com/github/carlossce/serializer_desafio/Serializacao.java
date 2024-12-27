package com.github.carlossce.serializer_desafio;

import com.github.carlossce.serializer_desafio.crm.Cliente;
import com.github.carlossce.serializer_desafio.crm.Endereco;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Serializacao {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        Path path = Path.of("C:\\Users\\Castro\\IdeaProjects\\Projetinhos\\objetos\\cliente.txt");

        System.out.println(cliente);

        try {
            Files.createDirectories(path.getParent());
            System.out.println("Diretório criado: " + path.getParent());

            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("Arquivo criado: " + path.toAbsolutePath());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // TODO implementar serialização
        try(var outputStream = new ObjectOutputStream(Files.newOutputStream(path, CREATE, WRITE))) {
            outputStream.writeObject(cliente);
        } catch (IOException e) {
            throw new RuntimeException("Não pode ser serializado", e);
        }
    }

}