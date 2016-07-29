package com.Priyanka.headFirstJava.Chapter11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by Priyanka on 7/29/2016.
 */
public class music {
    public void play() {
        try {
            Sequencer sqr = MidiSystem.getSequencer();
        } catch (MidiUnavailableException muve) {
            muve.printStackTrace();
        }
    }
}
