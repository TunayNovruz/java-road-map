/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.abstractionoccurrence;

public class TvSeries {
    public static void main(String[] args) {
        Serie BrBa = new Serie("Breaking Bad", "AMC");
        BrBa.addEpisode(new Episode("Explosion", 7));
        /*
         use has a relation instead of isA
        */
    }
}
