package jade.vampusWorld.agents;

import jade.core.AID;
import jade.core.Agent;

public class VampusAgent extends Agent {
    public boolean maximumSpectologsReached() {
        return true;
    }

    public boolean isRegisteredSpectologs(AID senderAID) {
        return true;
    }

    public boolean isSpectologsAlive(AID senderAID) {
        return true;
    }

    public void processAction(AID senderAID, String content) {

    }
}
