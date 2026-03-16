package haddou.net.dakishop.dao.mappers.users;

import haddou.net.dakishop.dao.entities.users.Vendeur;
import haddou.net.dakishop.metier.dto.user_service_dto.VendeurDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IVendeurMapper {
    IVendeurMapper INSTANCE = Mappers.getMapper(IVendeurMapper.class);

    Vendeur toEntity(VendeurDTO vendeurDTO);
    VendeurDTO toDto(Vendeur vendeur);


}
