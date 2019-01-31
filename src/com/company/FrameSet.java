package com.company;

import java.util.ArrayList;
import java.util.List;

public class FrameSet {

    List<Frame> frameSet;

    public FrameSet(){
        this.frameSet = new ArrayList<Frame>();

        for(int i = 0; i < 10; i++){
            frameSet.add(new Frame());
        }

    }

}
