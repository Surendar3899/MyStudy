import java.io.*;

public class CodeSplitterByRows {

    public static void main(String[] args) {
        String inputFilePath = "/home/surendarn/Documents/10-06-2026/RTP_2026_MAY_21_31.csv";
        String outputDirectoryPath = "/home/surendarn/Documents/10-06-2026/";

        try {
            splitCSV(inputFilePath, outputDirectoryPath, 800000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void splitCSV(String inputFilePath, String outputDirectoryPath, int rowsPerFile) throws IOException {
        File inputFile = new File(inputFilePath);
        File outputDirectory = new File(outputDirectoryPath);
        outputDirectory.mkdirs();

        int partNumber = 1;
        int currentRow = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String header = reader.readLine(); // Read the header line

            if (header == null) {
                throw new IOException("Empty input file");
            }

            String line;
            BufferedWriter writer = null;

            while ((line = reader.readLine()) != null) {
                if (currentRow % rowsPerFile == 0) {
                    if (writer != null) {
                        writer.close();
                    }
                    String partFilePath = outputDirectoryPath + "/part_" + partNumber + ".csv";
                    writer = new BufferedWriter(new FileWriter(partFilePath));
                    writer.write(header); // Write the header to each part file
                    writer.newLine();
                    partNumber++;
                }
                writer.write(line);
                writer.newLine();
                currentRow++;
            }

            if (writer != null) {
                writer.close();
            }
        }
    }
}