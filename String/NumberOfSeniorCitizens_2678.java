package String;

public class NumberOfSeniorCitizens_2678 {
    public static void main(String[] args) {
        String[] details = {
                "1234567890M5012", // Age 50
                "0987654321F6521", // Age 65
                "1122334455M6112"  // Age 61
        };
        int result = countSeniors(details);
        System.out.println("Number of seniors: " + result); // Output: 2
    }
    static int countSeniors(String[] details){
        int count = 0;
        // Iterate over each string in the details array
        for (int i = 0; i < details.length; i++) {
            String detail = details[i];

            // Extract characters at index 11 and 12 (as index is 0-based) from the current string
            char charAt12 = detail.charAt(11);
            char charAt13 = detail.charAt(12);

            // Concatenate the characters and convert to an integer
            String concatenated = String.valueOf(charAt12) + charAt13;
            int age = Integer.parseInt(concatenated);

            // Check if the age is strictly greater than 60
            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}
