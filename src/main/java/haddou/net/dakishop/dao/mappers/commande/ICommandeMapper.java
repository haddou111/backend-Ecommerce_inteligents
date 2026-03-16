package haddou.net.dakishop.dao.mappers.commande;

import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.metier.dto.commande_service_dto.CommandeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ICommandeMapper {

    ICommandeMapper INSTANCE = Mappers.getMapper(ICommandeMapper.class);

    Commande toEntity(CommandeDTO commandeDTO);
    CommandeDTO toDto(Commande commande);


}
