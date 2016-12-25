package jade.vampusWorld.agents;

import jade.core.Agent;

import java.util.List;

public interface NavigatorListener {
    void navigatorListModelChanged(List<? super Agent> hunters);
}
