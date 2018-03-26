package oracleCertified.chapter6.GenericsandCollections;

class PairTest {
	
	public static void main(String[] args){
		Pair<String,Integer> worldCup = new Pair<String, Integer>("South Africa.",2014);
		System.out.println("World Cup " + worldCup.getSecond() + " in " + worldCup.getFirst());
	}
}
