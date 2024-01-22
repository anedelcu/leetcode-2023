class Solution {

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String localName = parts[0];
            String domainName = parts[1];

            // Remove dots in the local name
            localName = localName.replace(".", "");

            // Ignore everything after the first plus sign
            localName = localName.split("\\+")[0];

            // Add the modified email to the set of unique emails
            uniqueEmails.add(localName + "@" + domainName);
        }

        return uniqueEmails.size();
    }
}
