package UserInterface;

import Components.Implementation.ComponentManager;
import UserInterface.Implementation.FastReader;
import UserInterface.Implementation.MenuManager;

public interface IUserInterface {
    void menu();
    FastReader getFastReader();
    ComponentManager getComponentManager();
    void showOptionsForTheUser();
    MenuManager getMenuManager();

}
