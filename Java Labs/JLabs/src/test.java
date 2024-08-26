 class Test
 {
        public static void main(String[] args) {
            // Initialize the array with key terms
            String[] keyTerms = {"Did", "This", "really", "work" };

            // Initialize the key term to search
            String searchTerm = "e";

            // Loop through the array to search for the key term
            for (int i = 0; i < keyTerms.length; i++)
            {
                // Check if the key term is found in the current element of the array
                if (keyTerms[i].contains(searchTerm))
                {
                    // Check if the current element has an even number of letters
                    if (keyTerms[i].length() % 2 == 0)
                    {
                        // Print the current element
                        System.out.println(keyTerms[i]);
                    }
                }
            }
        }
    }


