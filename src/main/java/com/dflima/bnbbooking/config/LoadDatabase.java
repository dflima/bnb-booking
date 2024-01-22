package com.dflima.bnbbooking.config;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dflima.bnbbooking.entity.Booking;
import com.dflima.bnbbooking.entity.Guest;
import com.dflima.bnbbooking.entity.Host;
import com.dflima.bnbbooking.entity.Property;
import com.dflima.bnbbooking.repository.BookingRepository;
import com.dflima.bnbbooking.repository.GuestRepository;
import com.dflima.bnbbooking.repository.HostRepository;
import com.dflima.bnbbooking.repository.PropertyRepository;

@Configuration
public class LoadDatabase {
    private static final Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner initDatabase(BookingRepository bookingRepository,
            PropertyRepository propertyRepository, HostRepository hostRepository,
            GuestRepository guestRepository) {
        return args -> {
            Host host = Host.builder()
                .id(UUID.randomUUID())
                .properties(new ArrayList<Property>())
                .build();

            logger.info("Preloading " + hostRepository.save(host));

            Property property =
                    Property.builder()
                        .id(UUID.randomUUID())
                        .name("Empire State Building")
                        .owner(host)
                        .bookings(new ArrayList<Booking>())
                        .build();

            logger.info("Preloading " + propertyRepository.save(property));

            Guest guest = Guest.builder().id(UUID.randomUUID()).bookings(new ArrayList<Booking>())
                    .build();

            logger.info("Preloading " + guestRepository.save(guest));

            Booking booking1 = Booking.builder()
                .id(UUID.randomUUID())
                .code("ABC123")
                .startDate(new GregorianCalendar(2024, Calendar.FEBRUARY, 11).getTime())
                .endDate(new GregorianCalendar(2024, Calendar.FEBRUARY, 19).getTime())
                .property(property)
                .guest(guest)
                .build();

            Booking booking2 = Booking.builder()
                .id(UUID.randomUUID())
                .code("XYZ456")
                .startDate(new GregorianCalendar(2024, Calendar.APRIL, 11).getTime())
                .endDate(new GregorianCalendar(2024, Calendar.APRIL, 19).getTime())
                .property(property)
                .guest(guest)
                .build();

            logger.info("Preloading " + bookingRepository.save(booking1));
            logger.info("Preloading " + bookingRepository.save(booking2));

            logger.info("property " + property);
            logger.info("host " + host);
        };
    }
}
