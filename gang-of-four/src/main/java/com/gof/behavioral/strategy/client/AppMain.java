package com.gof.behavioral.strategy.client;

import com.gof.behavioral.strategy.model.Category;
import com.gof.behavioral.strategy.model.Program;
import com.gof.behavioral.strategy.model.TVChannel;
import com.gof.behavioral.strategy.printer.PrinterStrategy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class AppMain {

    public static void main(String[] args) {
        final TVChannel tvGuide = TVChannel.ChannelBuilder.aChannel()
                .withName("ESPN")
                .withCategories(Arrays.asList(Category.SPORT))
                .withProgramGuide(Arrays.asList(
                        Program.ProgramGuideBuilder.aProgramGuide()
                                .withStart(LocalDateTime.now())
                                .withFinish(LocalDateTime.now().plus(Duration.ofHours(1)))
                                .build(),
                        Program.ProgramGuideBuilder.aProgramGuide()
                                .withStart(LocalDateTime.now().plus(Duration.ofMinutes(65)))
                                .withFinish(LocalDateTime.now().plus(Duration.ofMinutes(95)))
                                .build()
                ))
                .build();
        PrinterStrategy jsonStrategy = PrinterStrategy.toJson();
        final String jsonFormat = jsonStrategy.print(tvGuide);
        System.out.println(jsonFormat);

        PrinterStrategy xmlStrategy = PrinterStrategy.toXML();
        final String xmlFormat = xmlStrategy.print(tvGuide);
        System.out.println(xmlFormat);
    }
}
