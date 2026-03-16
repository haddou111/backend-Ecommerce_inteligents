package haddou.net.dakishop.dao.mappers.commande;

import haddou.net.dakishop.dao.entities.commande.Panier;
import haddou.net.dakishop.metier.dto.commande_service_dto.PanierDTO;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IPanierMapper {

    IPanierMapper INSTANCE= Mappers.getMapper(IPanierMapper.class);

    Panier toEntity(PanierDTO panierDTO);
    PanierDTO toDto(Panier panier);


}
