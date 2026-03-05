package haddou.net.dakishop.metier.service.besoin_metier.statistique;

import haddou.net.dakishop.metier.dto.StatistiqueDTO;

import java.util.List;

public interface IStatistiqueGlobal {


     List<Client> getAllclient();
     List<Produit> getAllprodact();
     List<Commande> getAllcommande();
     StatistiqueDTO getdatachiffreaboutsysteme();
}
