package com.advanced.dataStructures.nonLinear.tries;

import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean wordEnd;
    TrieNode(){
        wordEnd = false;
        children = new TrieNode[26]; // Alphabets a - z
    }
}
public class Trie {
    // Insert & Search
    // aryan -> a, r, y, a, n
    static void insertWord(TrieNode root, String word){
        TrieNode curr = root;
        for (char c : word.toCharArray()){
            if(curr.children[c-'a'] == null){
                // null means the node with that char doesn't exist
                // So we will create that node
                curr.children[c-'a'] = new TrieNode();
            }
            // Move to the node's children for the next character
            curr = curr.children[c-'a'];
        }
        // We have inserted the word, now store the word
        curr.wordEnd = true;
    }
    static boolean searchWord(TrieNode root, String word){
        TrieNode curr = root;
        for (char c : word.toCharArray()){
            if(curr.children[c-'a'] == null){
                // null means the node with that char doesn't exist
                // So, the entire word is not present
                return false;
            }
            // Move to the node's children for the next character
            curr = curr.children[c-'a'];
        }
        // If the wordEnd variable is true, the word exists
        return curr.wordEnd;
    }
    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> input = Arrays.asList(
                "vivek", "chitra", "bhavna", "ashok", "manmohan",
                "anjali", "chandana"
        );
        for (String word : input){
            insertWord(root, word);
        }
        List<String> search = Arrays.asList(
                "vivek", "chitra", "saurav", "bhavna", "ashok", "manmohan",
                "anup", "karthik", "anjali", "chandana", "vikrant"
        );
        for (String word : search){
            if(searchWord(root, word)){
                System.out.println(word + " is present in Trie.");
            }else {
                System.out.println(word + " is not present in Trie.");
            }
        }
    }
}
