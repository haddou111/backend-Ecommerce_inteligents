package haddou.net.dakishop.dao.mappers.produit;

import haddou.net.dakishop.dao.entities.produit.Promotion;
import haddou.net.dakishop.metier.dto.produit_service_dto.PromotionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IPromotionMapper {
    IPromotionMapper INSTANCE= Mappers.getMapper(IPromotionMapper.class);

    Promotion toEntity(PromotionDTO promotiondto);
    PromotionDTO toDto(Promotion promtion);
}
