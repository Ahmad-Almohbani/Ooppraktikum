package fileCreatorsAlmohbani;

import java.io.IOException;

public abstract class ReaderProductAlmohbani {
		public abstract String[] leseAusDatei()throws IOException;
		public abstract void schliesseDatei()throws IOException;
}
