package others.lab3;

public class GarbageCreator {
    String filename = "test.exe";
    byte[] inputBytes = {0};
    long startTime, endTime;

    inputBytes = Files.readAllBytes(Paths.get(filename));
    startTime = System.currentTimeMillis();
    String outpString = "";
    for (byte b : inputBytes) {
        outpString += (char) b;
    }
    endTime = System.currentTimeMillis();
    System.out.println("Time taken by String concatenation: " + (endTime - startTime) + "ms");
}
