package haddou.net.dakishop.dao.mappers.users;


import haddou.net.dakishop.dao.entities.users.Client;
import haddou.net.dakishop.metier.dto.user_service_dto.ClientDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IClientMapper {
    IClientMapper INSTANCE= Mappers.getMapper(IClientMapper.class);

    Client toEntity(ClientDTO clientdto);
    ClientDTO toDto(Client client);
}
