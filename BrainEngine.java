package sterling.spencer;

public class BrainEngine {
	public static void main(String[] args) {
		Axon axon = new Axon(0,1);
		System.out.println(axon.getLength());
		//input data as 2d array
		//expected output as 2d array
		//test input
		//expected test output
		
		int populationSize = 1000;
		int maxNumOfSpeciesPerPopulation = 10;
		
		double[][] trainingInputs = new double[0][0];	//change this
		double[][] trainingOutputs = new double[0][0];	//change this
		double[][] testInputs = new double[0][0];		//change this
		double[][] testOutputs = new double[0][0];		//change this
		
		int targetAccuracy = 90;
		int maxGenerations = 100;

		Surgeon surgeon = new Surgeon(populationSize, maxNumOfSpeciesPerPopulation,
									  trainingInputs, trainingOutputs, testInputs, testOutputs,
									  targetAccuracy, maxGenerations);
		
		do {
			surgeon.train();
			surgeon.test();
		} while(!(surgeon.hasReachedTargetAccuracy() || surgeon.hasReachedMaxGeneration()));
		
		//save network solution to file
	}
}
