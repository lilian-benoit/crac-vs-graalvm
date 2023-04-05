package fr.lbenoit.utils.presentation.utils.horodatage;

import java.lang.management.ManagementFactory;

public class HorodatageUtils {

	public static long getTime() {
		return System.nanoTime();
	}
	
	public static void logTime(String message, long start) {
		System.out.println(message + ": " + ((System.nanoTime() - start) / 1_000_000) + " ms");
	}
	
	public static void logStartTime() {
        long currentTime = System.currentTimeMillis();
        long vmStartTime = ManagementFactory.getRuntimeMXBean().getStartTime();

        System.out.println("JVM startup time      : " + (currentTime - vmStartTime) + "ms");
        System.out.println("PID                   : " + ProcessHandle.current().pid());
	}
	
}
