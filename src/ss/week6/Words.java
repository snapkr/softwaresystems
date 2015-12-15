package ss.week6;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		System.out.print("Line (or \"end\") : ");
		Scanner in = new Scanner(System.in);

		while (in.hasNextLine()) {
			String inputString = in.nextLine();
			System.out.println("inputString: " + inputString);
			Scanner input = new Scanner(inputString);
			if (in.hasNext("end")) {
				System.out.println("Line (or \"end\") : " + in.next());
				in.close();
			} else {
				int count = 0;
				while (input.hasNext()) {
					count++;
					System.out.println("Word " + count + ": " + in.next());

				}
				input.close();

			}

		}
		System.out.println("End of programme.");
		System.exit(0);

	}

}
