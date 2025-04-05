package genericutility;

import java.time.LocalDateTime;

public class JavaUtility {
	
	/**
	 * It captures current date and time and return to the caller
	 * @return
	 */
	public String getSystemTime()
	{
		return LocalDateTime.now().toString().replace(":", "-");
	}

}
