package haddou.net.dakishop.dao.mappers.produit;

import haddou.net.dakishop.dao.entities.produit.Avis;
import haddou.net.dakishop.metier.dto.produit_service_dto.AvisDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IAvisMapper {

    IAvisMapper INSTANCE = Mappers.getMapper(IAvisMapper.class);

    Avis toEntity(AvisDTO avisdto);
    AvisDTO toDto(Avis avis);
}
