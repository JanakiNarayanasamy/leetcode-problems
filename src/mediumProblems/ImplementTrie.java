package mediumProblems;

public class ImplementTrie {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Test data
        String[] wordsToInsert = {"apple", "app", "apricot", "banana", "bat", "bath", "batman"};
        String[] wordsToSearch = {"apple", "app", "batman", "banana", "bat", "apricot", "bath", "bad"};
        String[] prefixesToCheck = {"app", "bat", "ban", "bad", "ba"};

        // Inserting words into the Trie
        for (String word : wordsToInsert) {
            trie.insert(word);
            System.out.println("Inserted: " + word);
        }

        System.out.println();

        // Testing search method
        for (String word : wordsToSearch) {
            boolean result = trie.search(word);
            System.out.println("Search for word '" + word + "': " + result);
        }

        System.out.println();

        // Testing startsWith method
        for (String prefix : prefixesToCheck) {
            boolean result = trie.startsWith(prefix);
            System.out.println("StartsWith prefix '" + prefix + "': " + result);
        }
    }
}

class Trie{
    Trie[] letters = new Trie[26];
    boolean isLastWord = false;

    public void insert(String word){
        Trie node = this;

        for (char c:word.toCharArray()){
        int index = c -'a';
        if(node.letters[index] == null){
            node.letters[index] = new Trie();
        }
        node = node.letters[index];
        }
        node.isLastWord = true;
    }

    public boolean search(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            node =  node.letters[c-'a'];
            if(node == null){
                return false;
            }
        }
        return node.isLastWord;
    }

    public boolean startsWith(String prefix) {
        Trie node = this;
        for (char c : prefix.toCharArray()) {
            node =  node.letters[c-'a'];
            if(node == null){
                return false;
            }
        }
        return true;
    }
}
