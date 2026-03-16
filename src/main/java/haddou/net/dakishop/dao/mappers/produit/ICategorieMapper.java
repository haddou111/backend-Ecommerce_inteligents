package haddou.net.dakishop.dao.mappers.produit;

import haddou.net.dakishop.dao.entities.produit.Categorie;
import haddou.net.dakishop.dao.mappers.commande.ICommandeMapper;
import haddou.net.dakishop.metier.dto.produit_service_dto.CategorieDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ICategorieMapper {
    ICategorieMapper INSTANCE= Mappers.getMapper(ICategorieMapper.class);
    Categorie toEntity(CategorieDTO categorieDTO);
    Categorie toDto(Categorie categorie);


}
