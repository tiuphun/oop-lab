package others.lab3;

public class NoGarbage {
    String filename = "test.exe";
    byte[] inputBytes = {0};
    long startTime, endTime;

    inputBytes = Files.readAllBytes(Paths.get(filename));
    startTime = System.currentTimeMillis();
    StringBuilder outputSB = new StringBuilder();
    for (byte b : inputBytes) {
        outputSB.append((char) b);
    }
    
}
