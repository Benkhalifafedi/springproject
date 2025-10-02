package tn.esprit.twin.projetspringclasse.services.Detail;

import tn.esprit.twin.projetspringclasse.models.DetailComposant;
import java.util.List;

public interface IdetailS {

    List<DetailComposant> retrieveAllDetails();

    DetailComposant addDetail(DetailComposant detail);

    List<DetailComposant> addDetails(List<DetailComposant> details);

    DetailComposant updateDetail(DetailComposant detail);

    DetailComposant retrieveDetail(Long id);

    void deleteDetail(Long id);
}
