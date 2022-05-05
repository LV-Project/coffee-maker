package UserInterface;

import Components.Implementation.ComponentManager;
import UserInterface.Implementation.FastReader;

public interface IUserInterface {
    void menu();
    FastReader getFastReader();
    ComponentManager getComponentManager();
    void showOptionsForTheUser();

}
