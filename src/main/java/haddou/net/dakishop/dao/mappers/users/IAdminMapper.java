package haddou.net.dakishop.dao.mappers.users;


import haddou.net.dakishop.dao.entities.users.Admin;
import haddou.net.dakishop.metier.dto.user_service_dto.AdminDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IAdminMapper {
    IAdminMapper INSTANCE = Mappers.getMapper(IAdminMapper.class);

    Admin toEntity(AdminDTO adminDTO);
    AdminDTO toDto(Admin admin);
}
