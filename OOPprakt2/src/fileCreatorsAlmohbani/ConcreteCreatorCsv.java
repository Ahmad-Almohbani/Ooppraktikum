package fileCreatorsAlmohbani;

import java.io.IOException;

public class ConcreteCreatorCsv extends ReaderCreatorAlmohbani {

	
	

	
	public ReaderProductAlmohbani factoryMethod(String typ) throws IOException {
		if(typ.equals("txt")) {
			return new ConcreteProductA();
		}else
		return new ConcreteProductCsv();
	}

	
	

}
