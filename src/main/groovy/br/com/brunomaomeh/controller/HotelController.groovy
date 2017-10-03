package br.com.brunomaomeh.controller

import br.com.brunomaomeh.model.Hotel
import br.com.brunomaomeh.service.HotelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

import static org.springframework.http.MediaType.APPLICATION_JSON

@RestController
class HotelController {

    private HotelService hotelService

    private hotels = Flux.just(
            new Hotel(1, "Hotel1"),
            new Hotel(2, "Hotel2"),
            new Hotel(3, "Hotel3"))


    @Autowired
    HotelController(HotelService hotelService) {
        this.hotelService = hotelService
    }

    @RequestMapping("/hotels")
    def hotels() {
//        Flux<Hotel> hotels = hotelService.all()
        ServerResponse.ok().contentType(APPLICATION_JSON).
                body(Flux.fromIterable(
                        Arrays.asList("Ola", "Mundo")), String.class)
    }

}
