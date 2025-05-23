import java.util.*;
import java.io.*;
public class StockMarket{
	void main(){
		System.out.println("Welcome!\n");
		File data=new File("data\\");
		if(!data.exists()){
			data.mkdir();
		}
		
	}
	//data should be saved for:
		//all previous stock prices, their current stock, current target value, and time to target
		//possibly supply/demand info? 
			//more buys means higher prices/supply, fewer buys means lower prices/supply, doesn't apply to some limited stocks
		//all user inventories
		
}

