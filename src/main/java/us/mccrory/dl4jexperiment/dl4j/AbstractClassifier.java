package us.mccrory.dl4jexperiment.dl4j;

import org.deeplearning4j.api.storage.StatsStorage;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.optimize.listeners.ScoreIterationListener;
import org.deeplearning4j.ui.api.UIServer;
import org.deeplearning4j.ui.stats.StatsListener;
import org.deeplearning4j.ui.storage.InMemoryStatsStorage;

public abstract class AbstractClassifier {

	/**
	 * Initializes the model/network and adds two listeners.
	 * 
	 * @see https://deeplearning4j.org/docs/latest/deeplearning4j-nn-visualization
	 * @param net
	 */
	protected static void initializeNetworkAndListeners(MultiLayerNetwork net) {
		
		// Initialize the model/network
		net.init();
				
	    //Initialize the user interface backend
	    UIServer uiServer = UIServer.getInstance();
	
	    //Configure where the network information (gradients, score vs. time etc) is to be stored. Here: store in memory.
	    StatsStorage statsStorage = new InMemoryStatsStorage();         //Alternative: new FileStatsStorage(File), for saving and loading later
	
	    //Attach the StatsStorage instance to the UI: this allows the contents of the StatsStorage to be visualized
	    uiServer.attach(statsStorage);
	
	    //Then add the StatsListener to collect this information from the network, as it trains
	    net.setListeners(new ScoreIterationListener(10), new StatsListener(statsStorage));
	    
	}

}