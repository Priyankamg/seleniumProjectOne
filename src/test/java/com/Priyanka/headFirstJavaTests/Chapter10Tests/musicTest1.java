package com.Priyanka.headFirstJavaTests.Chapter10Tests;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by Priyanka on 7/21/2016.
 */
public class musicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException e) {
            System.out.println("Midi unavailable");
            e.printStackTrace();
        }

        System.out.println("We got a sequencer");
    }

    public static void main(String[] args) {
        musicTest1 m1 = new musicTest1();
        m1.play();
    }
}
