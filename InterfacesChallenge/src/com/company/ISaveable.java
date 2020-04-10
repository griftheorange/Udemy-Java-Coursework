package com.company;

import java.util.ArrayList;
import java.util.List;

interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
