package task2;

import java.io.*;

public class MainClass {
	public static void main(String[] args) {
		String directory = System.getProperty("user.dir");
		System.out.println("Current Directory is" + directory);
		MainClass mainClass = new MainClass();
		mainClass.getAllFiles(directory);

	}

	public void getAllFiles(String location) {
		Directory directory = new Directory() {

			@Override
			public void displayAllTheFiles(String location) {
				System.out.println("Using Anonymous");
				File file = new File(location);
				File arr[] = file.listFiles();
				System.out.println("All files in directory");
				for (File f : arr) {
					System.out.println(f.getName());

				}

			}

		};
		directory.displayAllTheFiles(location);
		Directory directory2 = (location1) -> {
			System.out.println("Using Lambda");
			File file = new File(location1);
			File arr[] = file.listFiles();
			System.out.println("All files in directory");
			for (File f : arr) {
				System.out.println(f.getName());

			}

		};
		directory2.displayAllTheFiles(location);
	}

}