import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet mars = new Mars();
        Planet mercury = new Mercury();
        Planet neptune = new Neptune();
        Planet saturn = new Saturn();
        Planet uranus = new Uranus();
        Planet venus = new Venus();

        Explorer astronaut = new HumanExplorer();
        Explorer Jarvis = new RobotExplorer();

        earth.accept(astronaut);
        jupiter.accept(astronaut);
        mars.accept(astronaut);
        mercury.accept(astronaut);
        neptune.accept(astronaut);
        saturn.accept(astronaut); 
        uranus.accept(astronaut);
        venus.accept(astronaut);

        earth.accept(Jarvis);
        jupiter.accept(Jarvis);
        mars.accept(Jarvis);
        mercury.accept(Jarvis);
        neptune.accept(Jarvis);
        saturn.accept(Jarvis);
        uranus.accept(Jarvis);
        venus.accept(Jarvis);
    }
}