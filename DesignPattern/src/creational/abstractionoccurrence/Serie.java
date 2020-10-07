/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.abstractionoccurrence;

import java.util.ArrayList;

/**
 * This is abstraction
 */
public class Serie {
    public String title;
    public String producer;
    ArrayList<Episode> episodes = new ArrayList<>();

    Serie(String title, String producer) {
        this.title = title;
        this.producer = producer;
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }
}
