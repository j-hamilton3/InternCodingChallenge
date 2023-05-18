/**
 * A solution to the coding challenge provided by Fleets Coffee.
 *
 * @author James Hamilton
 * @version 1.0.0
 */
public class InternCodingChallenge
{
	/**
	 * Returns the first non-repeated character in a given string.
	 *
	 * @param s A string containing lowercase and/or uppercase English letters.
	 * @return A string representing the first non-repeated character in the input string, or an empty string
	 * if there is no non-repeated character.
	 */
	public static String firstNonRepeated(String s)
	{
		// Loop through the string indexes.
		for (int i = 0; i < s.length(); i++)
		{
			char currentCharacter = s.charAt(i);
			boolean repeatFlag = false;

			// Loop through the indexes to see if currentCharacter matches.
			for (int j = 0 ; j < s.length(); j++)
			{
				// If the currentCharacter is equal to another character that isn't at the same index...
				if (currentCharacter == s.charAt(j) && i != j)
				{
					repeatFlag = true;
					break;
				}
			}

			// If the currentCharacter hasn't been flagged as repeating...
			if (!repeatFlag)
			{
				return String.valueOf(currentCharacter);
			}
		}

		return "";
	}


	public static void main(String args[])
	{
	     // In this case, the result should be "e".
		 String testString = "aabbccddefg";

		 String result = firstNonRepeated(testString);

		 System.out.printf("The result is: %s ", result);
	}
}