package com.dariosavarese.utils;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import com.dariosavarese.TreeZone;

public class GardenUtil {
	private static final String BLANK_SPACE = " ";

	private GardenUtil() {
	}

	public static TreeZone[][] dataToGarden(List<String> treeLines) {
		String[] size = treeLines.get(0).split(BLANK_SPACE);
		TreeZone[][] garden = new TreeZone[Integer.valueOf(size[0])][Integer.valueOf(size[1])];
		
		AtomicInteger idx = new AtomicInteger();
		treeLines.stream().skip(1).forEach((x) -> {
			Stream<String> applesStream = Stream.of(x.split(BLANK_SPACE));
			garden[idx.getAndIncrement()] = applesStream.map(Integer::valueOf).map(TreeZone::new).toArray(TreeZone[]::new);
		});
		
		return garden;
	}

}
