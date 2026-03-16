package haddou.net.dakishop.dao.mappers.produit;

import haddou.net.dakishop.dao.entities.produit.VarianteProduit;
import haddou.net.dakishop.metier.dto.produit_service_dto.VariantProduitDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IVariantProduit {

    IVariantProduit INSTANCE = Mappers.getMapper(IVariantProduit.class);
    VarianteProduit toEntity(VariantProduitDTO varianteProduitDTO);
    VariantProduitDTO toDto(VarianteProduit  varianteProduit);
}
