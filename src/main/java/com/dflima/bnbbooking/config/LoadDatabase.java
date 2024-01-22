package com.dflima.bnbbooking.config;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dflima.bnbbooking.entity.Booking;
import com.dflima.bnbbooking.repository.BookingRepository;

@Configuration
public class LoadDatabase {
    private static final Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner initDatabase(BookingRepository repository) {
        return args -> {
            logger.info("Preloading " + repository.save(new Booking(UUID.randomUUID(), "ABC123",
                    new GregorianCalendar(2024, Calendar.FEBRUARY, 11).getTime(),
                    new GregorianCalendar(2024, Calendar.FEBRUARY, 19).getTime())));
            logger.info("Preloading " + repository.save(new Booking(UUID.randomUUID(), "ZYX456",
                    new GregorianCalendar(2024, Calendar.APRIL, 11).getTime(),
                    new GregorianCalendar(2024, Calendar.APRIL, 19).getTime())));
        };
    }
}
