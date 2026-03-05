package haddou.net.dakishop.security;

public interface ITokenService {


    String genererAccessToken(User user);
    String genererRefreshToken(User user);
    String rafraichirToken(String refreshToken);
    boolean validerToken(String token);
    String extraireEmail(String token);
    Role extraireRole(String token);


}
