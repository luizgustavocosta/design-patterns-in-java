package com.gof.behavioral.strategy.client;

import com.gof.behavioral.strategy.model.Category;
import com.gof.behavioral.strategy.model.Program;
import com.gof.behavioral.strategy.model.TVChannel;
import com.gof.behavioral.strategy.printer.PrinterStrategy;
import org.apache.log4j.Logger;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class AppMain {

    private static final Logger log = Logger.getLogger(AppMain.class);

    public static void main(String[] args) {
        final TVChannel tvGuide = TVChannel.ChannelBuilder.aChannel()
                .withName("ESPN")
                .withCategories(Arrays.asList(Category.SPORT))
                .withProgramGuide(Arrays.asList(
                        Program.ProgramGuideBuilder.aProgramGuide()
                                .withStart(LocalDateTime.now())
                                .withFinish(LocalDateTime.now().plus(Duration.ofHours(1)))
                                .withDescription("Mickey movie")
                                .withCategory(Arrays.asList(Category.KIDS, Category.MOVIES))
                                .build(),
                        Program.ProgramGuideBuilder.aProgramGuide()
                                .withStart(LocalDateTime.now().plus(Duration.ofMinutes(65)))
                                .withFinish(LocalDateTime.now().plus(Duration.ofMinutes(95)))
                                .withDescription("New Zeland x Canada - soccer match")
                                .withCategory(Arrays.asList(Category.SPORT))
                                .build()
                ))
                .build();
        PrinterStrategy normalStrategy = PrinterStrategy.normalStrategy();
        final String normalFormat = normalStrategy.print(tvGuide);
        log.info("Normal strategy");
        log.info(normalFormat);

        PrinterStrategy jsonStrategy = PrinterStrategy.toJson();
        final String jsonFormat = jsonStrategy.print(tvGuide);
        log.info("JSON strategy");
        log.info(jsonFormat);

        PrinterStrategy xmlStrategy = PrinterStrategy.toXML();
        final String xmlFormat = xmlStrategy.print(tvGuide);
        log.info("XML strategy");
        log.info(xmlFormat);

        PrinterStrategy gzipStrategy = PrinterStrategy.toGzip();
        final String gzipFormat = gzipStrategy.print(tvGuide);
        log.info("GZIP strategy");
        log.info(gzipFormat);
    }
}
