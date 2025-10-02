package tn.esprit.twin.projetspringclasse.services.Menu;

import tn.esprit.twin.projetspringclasse.models.Menu;
import java.util.List;

public interface ImenuS {

    List<Menu> retrieveAllMenus();

    Menu addMenu(Menu menu);

    List<Menu> addMenus(List<Menu> menus);

    Menu updateMenu(Menu menu);

    Menu retrieveMenu(Long id);

    void deleteMenu(Long id);
}
