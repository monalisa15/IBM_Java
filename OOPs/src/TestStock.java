import com.ibm.stock.StockSingleton;
import com.ibm.stock.Holder;
import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;

public class TestStock {

	public static void main(String[] args) {

		//Stock ibm = new Stock();
		
		Holder h = StockSingleton.getStock();
		h.view();
		
		Broker b = StockSingleton.getStock();
		b.get();
		
		Exchange e = StockSingleton.getStock();
		e.set();

		System.out.println(h == b);
	}

}
