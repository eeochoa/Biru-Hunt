package com.ernesto.biruhunt.biruhunt;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

@SpringBootApplication
public class BiruHuntApplication {



    public static void main(String[] args) throws Exception {
        SpringApplication.run(BiruHuntApplication.class, args);
    }

}
