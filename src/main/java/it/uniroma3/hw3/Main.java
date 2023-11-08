package it.uniroma3.hw3;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

    final static String INDEX_PATH = System.getProperty("user.dir")+"/index";
    final static String TABLE_PATH = System.getProperty("user.dir")+"/tables.json";

    public static void main(String[] args) throws IOException {
        TableIndexer tr = new TableIndexer();
        Searcher search = new Searcher();
        Set<String> set = new HashSet<>();

        //tr.tableIndexer(TABLE_PATH, INDEX_PATH);

     String s = "crimes";
        String c = "plural";
        String d = "singular";

        set.add(s);
        set.add(c);

        set.add(d);

        search.read_from_index(INDEX_PATH, set);

    }
}
