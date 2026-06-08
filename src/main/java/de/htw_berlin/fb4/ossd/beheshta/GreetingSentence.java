package de.htw_berlin.fb4.ossd.beheshta;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class GreetingSentence implements Sentence {

    @Override
    public String get() {
        return "Hallo zusammen!";
    }

}
