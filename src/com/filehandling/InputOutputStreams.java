package com.filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class InputOutputStreams {
	
	static File file = new File("/Users/apple/Desktop/FileHandlingBasics/demo.txt");

	
	public static void createFile() {
		
		try {
			if(file.createNewFile()) {
				System.out.println("File created : "+file.getName());
			}else{
				System.out.println("File exists : "+file.getName());
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void getFileInformation() {
		
		if(file.exists()) {
			System.out.println("File name : "+file.getName());
			System.out.println("Readable : "+file.canRead());
			System.out.println("Writable : "+file.canWrite());
			System.out.println("Executable : "+file.canExecute());
			System.out.println("Absolute path : "+file.getAbsolutePath());
			System.out.println("Path : "+file.getPath());
			System.out.println("Characters of file : "+file.length());
		}
	}
	
	public static void writingToFile() {
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			String contentOfFile = "Hello Bridgelabz, My Name is Tejaswini Shelake, I am working here as a Quality Assurance";
			fileWriter.write(contentOfFile);
			fileWriter.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deleteFile() {
		
		try {
			if(file.delete()) {
				System.out.println(file.getName()+" deleted ");
			}else {
				throw new Exception("File is already deleted ");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void readFile() {
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String readLine = sc.nextLine();
				System.out.println(readLine);
			}
			sc.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		createFile();
		getFileInformation();
		writingToFile();
		readFile();
		deleteFile();
	}

}
