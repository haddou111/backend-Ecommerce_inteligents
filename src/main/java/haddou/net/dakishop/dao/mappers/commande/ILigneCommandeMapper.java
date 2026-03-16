package haddou.net.dakishop.dao.mappers.commande;

import haddou.net.dakishop.dao.entities.commande.LigneCommande;
import haddou.net.dakishop.metier.dto.commande_service_dto.LigneCommandeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ILigneCommandeMapper {

    ILigneCommandeMapper INSTANCE= Mappers.getMapper(ILigneCommandeMapper.class);

  LigneCommande tnEntity(LigneCommandeDTO ligneCommandeDTO);
    LigneCommandeDTO toDto(LigneCommande ligneCommande);
}
