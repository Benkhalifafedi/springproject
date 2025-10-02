package tn.esprit.twin.projetspringclasse.services.Menu;

import org.springframework.stereotype.Service;
import tn.esprit.twin.projetspringclasse.models.Menu;
import tn.esprit.twin.projetspringclasse.repository.MenuRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuSer implements ImenuS {

    private final MenuRepo menuRepo;

    public MenuSer(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    public List<Menu> retrieveAllMenus() {
        return menuRepo.findAll();
    }

    public Menu addMenu(Menu menu) {
        return menuRepo.save(menu);
    }

    public List<Menu> addMenus(List<Menu> menus) {
        List<Menu> saved = new ArrayList<>();
        for (Menu m : menus) {
            saved.add(menuRepo.save(m));
        }
        return saved;
    }

    public Menu updateMenu(Menu menu) {
        return menuRepo.save(menu);
    }

    public Menu retrieveMenu(Long id) {
        return menuRepo.findById(id).orElse(null);
    }

    public void deleteMenu(Long id) {
        menuRepo.deleteById(id);
    }
}
