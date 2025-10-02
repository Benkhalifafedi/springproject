package tn.esprit.twin.projetspringclasse.services.Detail;

import tn.esprit.twin.projetspringclasse.models.DetailComposant;
import tn.esprit.twin.projetspringclasse.repository.DetailComposantRepo;

import java.util.ArrayList;
import java.util.List;

public class DetailS implements IdetailS {
    private DetailComposantRepo detailComposantRepo;

    public DetailS(DetailComposantRepo detailComposantRepo) {
        this.detailComposantRepo = detailComposantRepo;
    }

    public void DetailCompSer(DetailComposantRepo detailComposantRepo) {
        this.detailComposantRepo = detailComposantRepo;
    }

    @Override
    public List<DetailComposant> retrieveAllDetails() {
        return detailComposantRepo.findAll();
    }

    @Override
    public DetailComposant addDetail(DetailComposant detail) {
        return detailComposantRepo.save(detail);
    }

    @Override
    public List<DetailComposant> addDetails(List<DetailComposant> details) {
        List<DetailComposant> saved = new ArrayList<>();
        for (DetailComposant d : details) {
            saved.add(detailComposantRepo.save(d));
        }
        return saved;
    }

    @Override
    public DetailComposant updateDetail(DetailComposant detail) {
        return detailComposantRepo.save(detail);
    }

    @Override
    public DetailComposant retrieveDetail(Long id) {
        return detailComposantRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteDetail(Long id) {
        detailComposantRepo.deleteById(id);
    }
}
