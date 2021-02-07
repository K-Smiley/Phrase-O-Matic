package phrase.o.matic;

public class PhraseOMatic {

    public static void main(String[] args) {

        // 3 Arrays of (hard-coded) word lists to choose from 
        String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "B2B", "win-win", "frontend", "web-based", "automated", "smart",
            "agile", "critical path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box",
            "positioned", "networkded", "focussed", "determined"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space",
            "vision", "paradigm", "mission", "blockchain", "AI"};
        

        // find out how many words are in each list so we can generate a number within this limit (used in method below)
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        

        // generate 3 random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        
        
        // build a phrase
        String phrase = wordListOne[rand1] + ", " + wordListTwo[rand2] + ", " + wordListThree[rand3];
        
        
        // print out the phrase
        System.out.println("What we need is a '" + phrase + "'.");

    }

}
