public class PhraseBoi
{
	public static void main (String[] args)
	{
		String[] wordList1 = {"24/7", "multi-Tier","30,OOO foot", "B-to-B", "win-win", "front-end", 
				"web-based" , "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

		String[] wordList2 = {"empowered", "sticky",
				"value-added", "oriented", "centric", "distributed",
				"clustered", "branded", "outside-the-box", "positioned",
				"networked", "focused", "leveraged", "aligned",
				"targeted", "shared", "cooperative", "accelerated"};

		String[] wordList3 = {"process", "tipping-point", "solution", "architecture", "core competency",
				"strategy", "mindshare", "portal", "apace", "vision",
				"paradigm", "mission"};

		int length1 = wordList1.length;
		int length2 = wordList2.length;
		int length3 = wordList3.length;

		int rand1 = (int) (Math.random() * length1);
		int rand2 = (int) (Math.random() * length2);
		int rand3 = (int) (Math.random() * length3);

		String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];

		System.out.println("What we need is a " + phrase);
	}
}