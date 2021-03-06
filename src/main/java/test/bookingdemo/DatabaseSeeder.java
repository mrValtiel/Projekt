package test.bookingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component
public class DatabaseSeeder implements CommandLineRunner
{
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository)
    {
        this.bookingRepository = bookingRepository;
    }


    @Override
    public void run(String... strings) throws Exception
    {
        List<HotelBooking> bookings = new ArrayList<>();
        bookings.add(new HotelBooking("Marriot", 200.50, 3));
        bookings.add(new HotelBooking("Ibis", 90, 4));
        bookings.add(new HotelBooking("Novotel", 140.74, 1));
        bookings.add(new HotelBooking("Sandra", 120, 7));
        bookings.add(new HotelBooking("Ski", 96.60, 5));
        bookings.add(new HotelBooking("U Justyny", 70.40, 4));

        bookingRepository.save(bookings);
    }

}
