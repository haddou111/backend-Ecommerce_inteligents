package haddou.net.dakishop.dao.mappers.paiement;


import haddou.net.dakishop.dao.entities.paiement.Paiement;
import haddou.net.dakishop.metier.dto.paiement_service_dto.PaiementDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IPaiementMapper {
    IPaiementMapper INSTANCE = Mappers.getMapper(IPaiementMapper.class);
    Paiement toEntity(PaiementDTO paiementDTO );
    PaiementDTO toDto(Paiement paiement);
}
