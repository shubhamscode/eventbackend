package com.casestudy.events.WebController;



import java.util.List;



import javax.validation.Valid;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.casestudy.events.Entity.Booking;
import com.casestudy.events.Exceptions.BookingNotFoundException;
import com.casestudy.events.Service.BookingService;

@RestController // marks the class as web controller, capable of handling the requests.
@RequestMapping("/app") // maps HTTP request with a path to a controller method.
@CrossOrigin(origins = { "http://localhost:8080", "http://localhost:4200" }, allowedHeaders = "*")
public class BookingController {

   @Autowired 
   BookingService bookingService;
   
   @GetMapping("/booking")
    public List<Booking> getAllBooking() {
        return bookingService.findAll();
    }

   @GetMapping("/getbookingbyid/{bookingId}")
    public ResponseEntity<Booking> getBookingById(@PathVariable("bookingId") int bookingId)
            throws BookingNotFoundException {
        Booking retrievedBooking = bookingService.getBookingById(bookingId);
        return new ResponseEntity<Booking>(retrievedBooking, HttpStatus.OK);
    }

   @PostMapping("/addbooking")
    public Booking createBooking(@Valid @RequestBody Booking booking) {
         //public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
   }

   @DeleteMapping("/delete/{bookingId}")
    public boolean deleteBooking(@PathVariable int bookingId) {
        return bookingService.deleteBooking(bookingId);
   }

   /// creating put mapping that updates the booking detail
    @PutMapping("/update/{bookingId}")
    public boolean updateBooking(@PathVariable int bookingId, @RequestBody Booking booking) {
        return bookingService.updateById(bookingId, booking);
    }
}