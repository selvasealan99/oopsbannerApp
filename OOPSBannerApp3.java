public class OOPSBannerApp3 {
    public static void main(String[] args) {
        // Each line is built using String.join("", ...)
        String[] banner = {
            String.join("", " ", "OOOOO", "   ", "OOOOO", "   ", "PPPPP", "   ", "SSSSS"),
            String.join("", " ", "O   O", "   ", "O   O", "   ", "P   P", "   ", "S    "),
            String.join("", " ", "O   O", "   ", "O   O", "   ", "PPPPP", "   ", "SSSSS"),
            String.join("", " ", "O   O", "   ", "O   O", "   ", "P     ", "   ","    S"),
            String.join("", " ", "OOOOO", "   ", "OOOOO", "   ", "P     ", "   ","SSSSS"),
            String.join("", "         "), // optional spacing line if needed
        };

        // Print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

