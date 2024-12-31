package com.carlossce.logging;

import com.carlossce.logging.fragmentador.FragmentadorDeArquivo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        try {
            logger.info("Iniciando programa de fragmentação...");
            var fragmentador = new FragmentadorDeArquivo(
                    Path.of("fotos/picanha.jpg"),
                    1024 * 50);
            fragmentador.fragmentar();
            logger.info("Fragmentação concluída com sucesso!");
        } catch (Exception e) {
            logger.error("Erro fragmentando arquivo" + e);
        }
    }

}