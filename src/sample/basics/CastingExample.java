package sample.basics;

public class CastingExample {

	public static void main(String[] args) {
		/*OpenPositions [] positins= { new OpenPositions(), new OpenPositionsCategory(), new OpenPositions()};
	
		for (OpenPositions openPositions : positins) {
			if(openPositions instanceof OpenPositionsCategory){
			//	openPositions.JavaOpenings();
			}
		}*/
		
		//with child reference 
		OpenPositionsCategory positions = new OpenPositionsCategory();
		positions.NumberOfPositions();
		positions.JavaOpenings();
		
		OpenPositions position = new OpenPositionsCategory();
		position.NumberOfPositions();
		((OpenPositionsCategory)position).JavaOpenings();
		
		OpenPositions positions_1 = new OpenPositions();
		//OpenPositionsCategory positions_cat = (OpenPositionsCategory) OpenPositions;
		OpenPositions positions_2 = positions_1;
		OpenPositions positions_3 = (OpenPositions)positions_1;
		
	}
}
