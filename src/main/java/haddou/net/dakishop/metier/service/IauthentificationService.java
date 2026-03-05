package haddou.net.dakishop.metier.service;



public interface IauthentificationService {

    // register selon le rôle
    AuthResponse registerClient(RegisterClientDTO dto);
    AuthResponse registerVendeur(RegisterVendeurDTO dto);

    // login unique — le rôle est dans le token
    AuthResponse login(LoginDTO dto);

    // commun
    void logout(String token);
    void resetPassword(String email);
}
