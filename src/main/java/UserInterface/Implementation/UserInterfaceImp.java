package UserInterface.Implementation;

import Components.Implementation.ComponentManager;
import Components.Interfaces.Component;
import UserInterface.IUserInterface;
import UserInterface.Model.Menu;

import java.util.List;
import java.util.Locale;

public class UserInterfaceImp implements IUserInterface {
    private ComponentManager _componentManager;
    private FastReader _fastReader;
    private MenuManager _menuManager;
    public UserInterfaceImp(ComponentManager componentManager,MenuManager menuManager) {
        _componentManager=componentManager;
        _fastReader=new FastReader();
        _menuManager=menuManager;
    }

    @Override
    public void menu() {
        System.out.println("Welcome to the Coffee Maker!");
        System.out.println("Please set up the machine");
        Command command = _menuManager.getMenus().stream().filter(a->a.getName().equals("filter")).findFirst()
                .orElseThrow(()->new RuntimeException("Command not found")).getCommand();
        command.execute();


    }

    @Override
    public FastReader getFastReader() {
        return _fastReader;
    }

    @Override
    public ComponentManager getComponentManager() {
        return _componentManager;
    }
}
