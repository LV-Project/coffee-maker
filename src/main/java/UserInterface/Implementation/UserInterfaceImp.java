package UserInterface.Implementation;

import Components.Implementation.ComponentManager;
import UserInterface.IUserInterface;
import Model.Menu;

import java.util.List;


public class UserInterfaceImp implements IUserInterface {
    private ComponentManager _componentManager;
    private FastReader _fastReader;
    private MenuManager _menuManager;

    public UserInterfaceImp(ComponentManager componentManager, MenuManager menuManager) {
        _componentManager = componentManager;
        _fastReader = new FastReader();
        _menuManager = menuManager;
    }

    @Override
    public void menu() {
        while (true) {
            Command command = _menuManager.getMenus().stream().filter(a -> a.getCode() == 0).findFirst()
                    .orElseThrow(() -> new RuntimeException("Command not found" )).getCommand();
            command.execute();
        }
    }

    @Override
    public FastReader getFastReader() {
        return _fastReader;
    }

    @Override
    public ComponentManager getComponentManager() {
        return _componentManager;
    }

    @Override
    public void showOptionsForTheUser() {
        List<Menu> menuList = _menuManager.getMenus();
        System.out.println("Type any code that you want to proceed " );
        System.out.println("This are the options: " );
        System.out.println("Code Name" );
        for (Menu varmenu : menuList) {
            System.out.println(varmenu.getCode() + "    " + varmenu.getName());
        }
    }

    @Override
    public MenuManager getMenuManager() {
        return _menuManager;
    }
}
