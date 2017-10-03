package br.com.brunomaomeh.handler

import br.com.brunomaomeh.domain.Hotel
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Flux

import static org.springframework.http.MediaType.APPLICATION_JSON

@RestController
class HotelHandler {

  private hotels = Flux.fromIterable([
    new Hotel(1, "Hotel1"),
    new Hotel(2, "Hotel2"),
    new Hotel(3, "Hotel3")
  ])

  def hotels(ServerRequest request) {
    ServerResponse.ok().contentType(APPLICATION_JSON).body(hotels, Hotel.class)
  }

}
