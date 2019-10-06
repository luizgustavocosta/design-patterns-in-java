package com.gof.behavioral.strategy.client;

import com.gof.behavioral.strategy.model.Category;
import com.gof.behavioral.strategy.model.Program;
import com.gof.behavioral.strategy.model.TVChannel;
import com.gof.behavioral.strategy.printer.PrinterStrategy;
import org.apache.log4j.Logger;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * The type App main.
 */
public class AppMain {

    private static final Logger log = Logger.getLogger(AppMain.class);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final TVChannel tvChannel = TVChannel.ChannelBuilder.aChannel()
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

        log.info("Using client consumers of strategy");
        log.info("Type Rest");
        Context restApi = new RestApi();
        restApi.defineStrategy(PrinterStrategy.toJson());
        log.info(restApi.print(tvChannel));

        log.info("Type Browser");
        Context browser = new Browser();
        browser.defineStrategy(PrinterStrategy.toGzip());
        log.info(browser.print(tvChannel));

        log.info("Calling directly..only for didactics reason");
        PrinterStrategy normalStrategy = PrinterStrategy.normalStrategy();
        final String normalFormat = normalStrategy.print(tvChannel);
        log.info("Normal strategy");
        log.info(normalFormat);

        PrinterStrategy jsonStrategy = PrinterStrategy.toJson();
        final String jsonFormat = jsonStrategy.print(tvChannel);
        log.info("JSON strategy");
        log.info(jsonFormat);

        PrinterStrategy xmlStrategy = PrinterStrategy.toXML();
        final String xmlFormat = xmlStrategy.print(tvChannel);
        log.info("XML strategy");
        log.info(xmlFormat);

        PrinterStrategy gzipStrategy = PrinterStrategy.toGzip();
        final String gzipFormat = gzipStrategy.print(tvChannel);
        log.info("GZIP strategy");
        log.info(gzipFormat);
    }
}
