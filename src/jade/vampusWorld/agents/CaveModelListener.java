package jade.vampusWorld.agents;

import jade.vampusWorld.enviroments.CaveNodes;

public interface CaveModelListener {
    void CaveModelChanged(CaveNodes[][] caveMap);
}
