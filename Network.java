package sterling.spencer;

import java.util.ArrayList;

public class Network {
	private Neuron[] inputNeurons;
	private Axon[][] inputAxons;
	
	private Neuron[] neurons;
	private Axon[] axons;
	
	private Neuron[] outputNeurons;
	
	public Network(double[] inputs, int numOfNeurons, int numOfOutputs) {
		setInputs(inputs, numOfNeurons);
		initOutputs(numOfOutputs);
	}
	
	private void setInputs(double[] inputs, int numOfNeurons) {
		inputNeurons = new Neuron[inputs.length];
		inputAxons = new Axon[inputs.length][numOfNeurons];
		
		for(int i = 0; i < inputNeurons.length; i++) {
			inputNeurons[i] = new Neuron(inputs[i]);
		}
		
		for(int i = 0; i < inputs.length; i++) {
			for(int j = 0; j < numOfNeurons; j++) {
				inputAxons[i][j] = new Axon(i,j);
			}
			//inputAxons[i] = new Axon();
		}
	}
	
	private void initOutputs(int numOfOutputs) {
		outputNeurons = new Neuron[numOfOutputs];
		
		for(int i = 0; i < numOfOutputs; i++) {
			outputNeurons[i] = new Neuron(0);
		}
	}
}
