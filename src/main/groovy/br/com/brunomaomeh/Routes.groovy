package br.com.brunomaomeh

import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.EnableWebFlux

@Configuration
@EnableWebFlux
class Routes {

//    @Autowired
//    private HotelController hotelController;
//
//    @Bean
//    RouterFunction<?> apis() {
//        nest(path("/hotels"),
//                nest(accept(MediaType.APPLICATION_JSON),
//                        route(GET("/{id}"), hotelController::findHotelsWithLetter)
//                ))
//    }

}
