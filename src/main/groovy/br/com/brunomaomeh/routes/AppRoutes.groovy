package br.com.brunomaomeh.routes

import br.com.brunomaomeh.handler.HotelHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse

import static org.springframework.http.MediaType.APPLICATION_JSON
import static org.springframework.web.reactive.function.server.RequestPredicates.*
import static org.springframework.web.reactive.function.server.RouterFunctions.nest
import static org.springframework.web.reactive.function.server.RouterFunctions.route

@Configuration
class AppRoutes {

  @Autowired
  private HotelHandler hotelHandler

  @Bean
  RouterFunction<ServerResponse> apis() {
    nest(path("/users"),
      nest(accept(APPLICATION_JSON),
        route(GET("/all"), hotelHandler.&hotels)))
  }

}
