package com.dariosavarese.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {

	private FileUtil() {
	}

	public static  List<String> read(String filePath) throws IOException   {
	          
	    Path path = Paths.get(filePath);
	          
	    Stream<String> lines = Files.lines(path);
	    List<String> data = lines.collect(Collectors.toCollection(LinkedList::new));
	    lines.close();
	    
	    return data;
	          
	}

	public static void write(String filePath, String solution) throws IOException {
		    FileOutputStream outputStream = new FileOutputStream(filePath);
		    byte[] strToBytes = solution.getBytes();
		    outputStream.write(strToBytes);
		    outputStream.close();
		
	}
}
