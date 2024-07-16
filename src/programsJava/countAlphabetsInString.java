package programsJava;

public class countAlphabetsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "my Name is Royalieeeie Rrroyyy";
		str= str.toLowerCase();

		char[] characters = str.toCharArray();

		int length =characters.length;


		for(int i=0; i<length; i++) {

			if (characters[i]!=' ') {
				int x=1;

				for(int j= i+1;j<length; j++) {

					if(characters[i]==characters[j]) {
						x=x+1;
						characters[j] = ' ';
						str=String.valueOf(characters);
					}
				}
			System.out.println(characters[i] + " is repeated " + x+ " times.");
			}
		}
	}

}
