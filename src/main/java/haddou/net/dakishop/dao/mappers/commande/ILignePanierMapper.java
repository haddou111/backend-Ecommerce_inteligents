package haddou.net.dakishop.dao.mappers.commande;

import haddou.net.dakishop.dao.entities.commande.LignePanier;
import haddou.net.dakishop.metier.dto.commande_service_dto.LignePanierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ILignePanierMapper {
   ILignePanierMapper INSTANCE = Mappers.getMapper(ILignePanierMapper.class);

   LignePanier toEntity(LignePanierDTO lignePanierDTO);
   LignePanierDTO ToDto(LignePanier lignepanier);
}


