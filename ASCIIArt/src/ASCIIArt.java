/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

public class ASCIIArt {
	public static void main (String [] args) {
		System.out.println("This is a balloon flying away from a sharp object.\n");
		balloon();
		point();
	}
	
	public static void balloon () {
		System.out.println("    ••••••••");
		System.out.println("  ••       •••");
		System.out.println(" ••         ••");
		System.out.println("••    • •    ••");
		System.out.println(" ••  \" o \"  ••");
		System.out.println(" •••       •••");
		System.out.println("   ••     ••");
		balloonBot();
		balloonBot();
		stringMid();
		stringLeft();
		stringLeft();
		stringMid();
		stringRight();
		stringRight();
		stringMid();
		stringLeft();
		stringLeft();
		System.out.println();
	}
	
	public static void balloonBot () {
		System.out.println("     •••••");
	}
	
	public static void stringMid () {
		System.out.println("      ••");
	}
	
	public static void stringLeft () {
		System.out.println("     ••");
	}
	
	public static void stringRight () {
		System.out.println("       ••");
	}
	
	public static void point () {
		System.out.println("     /\\");
		System.out.println("    /  \\");
		System.out.println("   / v  \\");
		System.out.println("  / •_•  \\");
		System.out.println("  \\ | |  /");
	}
}
