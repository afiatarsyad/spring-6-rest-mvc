package learning.springframework.spring6restmvc.mappers;

import learning.springframework.spring6restmvc.entities.Beer;
import learning.springframework.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

     Beer beerDtoToBeer(BeerDTO dto);

     BeerDTO beerToBeerDTO(Beer beer);
}
