package br.com.brunomaomeh.service

import br.com.brunomaomeh.model.Hotel
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class HotelService {

    private List<Hotel> hotels = [
            new Hotel(1, "Hotel1"),
            new Hotel(2, "Hotel2"),
            new Hotel(3, "Hotel3")
    ]

    Flux<Hotel> all() {
        Flux.fromIterable(hotels)
    }

}
