package be.intecbrussel;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@With
@Builder
public class Student {
    private String name;
    }
