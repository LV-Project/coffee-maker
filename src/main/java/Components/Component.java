package Components;

public interface Component {
    String execute();
    String getName();
    void activate();
    void deactivate();
    boolean isSetup();
}
