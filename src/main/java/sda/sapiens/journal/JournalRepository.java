package sda.sapiens.journal;

import java.time.LocalDate;
import java.util.*;

public enum JournalRepository {
    INSTANCE;

    public static JournalRepository getInstance() {
        return INSTANCE;
    }

    private Map<LocalDate, List<String>> journalList = new HashMap<>();

    JournalRepository() {
        journalList.put(LocalDate.of(2021, 7, 12),
                Arrays.asList("Adam", "Kain", "Abel"));
        journalList.put(LocalDate.of(2021, 7, 11),
                Arrays.asList("Marius", "Darius", "Babel"));
        journalList.put(LocalDate.of(2021, 7, 9),
                Arrays.asList("Lindsey", "Kitana", "Yvonne"));
    }

    public List<String> findByDate(LocalDate date) {
        return journalList.getOrDefault(date, Collections.emptyList());
    }
}
