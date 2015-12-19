package formatBuilder;

import parser.MasterBuilder;

public class ConsoleFormatter implements MasterFormatter {

	public String format(MasterBuilder dslResult) {
		
		return dslResult.toString();
	}
}
