package haddou.net.dakishop.security;

import haddou.net.dakishop.dao.entities.users.Utilisateur;
import haddou.net.dakishop.metier.enums.Role;

public interface ITokenService {


    String genererAccessToken(Utilisateur user);
    String genererRefreshToken(Utilisateur user);
    String rafraichirToken(String refreshToken);
    boolean validerToken(String token);
    String extraireEmail(String token);
    Role extraireRole(String token);


}
