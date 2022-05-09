package UserInterface;

import Components.Implementation.ComponentManager;

public interface IUserInterface {
    void menu();
    FastReader getFastReader();
    ComponentManager getComponentManager();
    void showOptionsForTheUser();
    MenuManager getMenuManager();
    void print(String text);

}
