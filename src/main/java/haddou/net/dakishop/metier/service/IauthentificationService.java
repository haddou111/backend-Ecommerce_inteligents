package haddou.net.dakishop.metier.service;


import haddou.net.dakishop.metier.dto.auth.AuthResponseDTO;
import haddou.net.dakishop.metier.dto.auth.LoginDTO;
import haddou.net.dakishop.metier.dto.registrer.RegistrerClientDTO;
import haddou.net.dakishop.metier.dto.registrer.RegistrerVendeurDTO;

public interface IauthentificationService {

    // register selon le rôle
    AuthResponseDTO registerClient(RegistrerClientDTO dto);
    AuthResponseDTO registerVendeur(RegistrerVendeurDTO dto);

    // login unique — le rôle est dans le token
    AuthResponseDTO login(LoginDTO dto);

    // commun
    void logout(String token);
    void resetPassword(String email);
}
