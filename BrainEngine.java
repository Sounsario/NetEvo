package sterling.spencer;

public class BrainEngine {
	public static void main(String[] args) {
		Axon axon = new Axon(0,1);
		System.out.println(axon.getLength());
		//input data as 2d array
		//expected output as 2d array
		//test input
		//expected test output

		//Surgeon surgeon = new Surgeon(populationSize, maxNumOfSpeciesPerPopulation, trainingInputs, trainingOutputs, testInputs, testOutputs, targetAccuracy, maxGenerations);
		Surgeon surgeon = new Surgeon();
		
		do {
			surgeon.train();
			surgeon.test();
		} while(!(surgeon.hasReachedTargetAccuracy() || surgeon.hasReachedMaxGeneration()));
		
		//save network solution to file
	}
}
