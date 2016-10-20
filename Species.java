package sterling.spencer;

public class Species {
	private Network[] networks;
	
	public Species(int speciesSize, double[] inputs, int numOfNeurons, int numOfOutputs) {
		initNetworks(speciesSize, inputs, numOfNeurons, numOfOutputs);
	}
	
	private void initNetworks(int speciesSize, double[] inputs, int numOfNeurons, int numOfOutputs) {
		networks = new Network[speciesSize];
		
		for(int i = 0; i < speciesSize; i++) {
			networks[i] = new Network(inputs, numOfNeurons, numOfOutputs);
		}
	}
}
