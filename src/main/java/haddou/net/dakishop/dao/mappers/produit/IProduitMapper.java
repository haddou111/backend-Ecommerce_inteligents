package haddou.net.dakishop.dao.mappers.produit;


import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.dao.mappers.commande.IPanierMapper;
import haddou.net.dakishop.metier.dto.produit_service_dto.ProduitDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IProduitMapper {
    IProduitMapper INSTANCE= Mappers.getMapper(IProduitMapper.class);

    Produit toEntity(ProduitDTO produitdto);

    ProduitDTO toDto(Produit produit);

 }
