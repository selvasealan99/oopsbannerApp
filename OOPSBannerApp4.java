
public class OOPSBannerApp4 {
    public static void main(String[] args) {
        // Define a String array with the number of lines in the banner
        String[] lines = new String[7];

        // Populate each index of the array with the corresponding banner line
        lines[0] = String.join(" "," *** ","  ***** ");
        lines[1] = String.join(" ","** **"," ** ");
        lines[2] = String.join(" ","** **","** ");
        lines[3] = String.join(" ","** **"," ***** ");
        lines[4] = String.join(" ","** **","   ** ");
        lines[5] = String.join(" ","** **","** ** ");
        lines[6] = String.join(" "," *** ","*****");

        // Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}